import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class LateSubmissionException extends Exception {
    public LateSubmissionException(String message) {
        super(message);
    }
}

class InvalidFileFormatException extends Exception {
    public InvalidFileFormatException(String message) {
        super(message);
    }
}

class ExamSubmission {
    private final LocalDateTime deadline;
    private static final DateTimeFormatter formatter = 
        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public ExamSubmission(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public void submitExam(String fileName, LocalDateTime submissionTime) 
            throws LateSubmissionException, InvalidFileFormatException {
        
        // Check file format
        if (!fileName.toLowerCase().endsWith(".pdf")) {
            throw new InvalidFileFormatException(
                "Only PDF files are accepted. Received: " + fileName);
        }

        // Check submission time
        if (submissionTime.isAfter(deadline)) {
            String deadlineStr = deadline.format(formatter);
            String submissionStr = submissionTime.format(formatter);
            throw new LateSubmissionException(
                "Submission time: " + submissionStr + 
                " is after deadline: " + deadlineStr);
        }

        System.out.println("Exam submitted successfully!");
    }
}

public class ExamSubmissionSystem {
    public static void main(String[] args) {
        LocalDateTime deadline = LocalDateTime.now().plusHours(2);
        ExamSubmission examSystem = new ExamSubmission(deadline);

        try {
            // Test valid submission
            examSystem.submitExam("exam.pdf", LocalDateTime.now());

            // Test invalid file format
            examSystem.submitExam("exam.doc", LocalDateTime.now());
        } catch (LateSubmissionException e) {
            System.out.println("Submission failed: " + e.getMessage());
        } catch (InvalidFileFormatException e) {
            System.out.println("Submission failed: " + e.getMessage());
        }
    }
}