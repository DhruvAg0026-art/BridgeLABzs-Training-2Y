import java.util.*;

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

class InvalidReturnException extends Exception {
    public InvalidReturnException(String message) {
        super(message);
    }
}

class UserLimitExceededException extends Exception {
    public UserLimitExceededException(String message) {
        super(message);
    }
}

class Library {
    private Map<String, Boolean> books = new HashMap<>(); // book -> isAvailable
    private Map<String, List<String>> userBorrowings = new HashMap<>(); // user -> list of books

    public Library() {
        // Initialize some books
        books.put("Java Programming", true);
        books.put("Data Structures", true);
        books.put("Algorithms", true);
    }

    public void borrowBook(String user, String book) 
            throws BookNotAvailableException, UserLimitExceededException {
        // Initialize user's borrowing list if not exists
        userBorrowings.putIfAbsent(user, new ArrayList<>());
        
        if (!books.containsKey(book) || !books.get(book)) {
            throw new BookNotAvailableException("Book '" + book + "' is not available");
        }

        if (userBorrowings.get(user).size() >= 5) {
            throw new UserLimitExceededException("User has reached maximum borrowing limit");
        }

        books.put(book, false);
        userBorrowings.get(user).add(book);
        System.out.println("Book '" + book + "' borrowed successfully by " + user);
    }

    public void returnBook(String user, String book) throws InvalidReturnException {
        List<String> userBooks = userBorrowings.get(user);
        if (userBooks == null || !userBooks.contains(book)) {
            throw new InvalidReturnException("Book '" + book + "' was not borrowed by " + user);
        }

        userBooks.remove(book);
        books.put(book, true);
        System.out.println("Book '" + book + "' returned successfully by " + user);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();
        String user = "John";

        try {
            library.borrowBook(user, "Java Programming");
            library.borrowBook(user, "Data Structures");
            library.returnBook(user, "Java Programming");
            // This should throw an exception
            library.returnBook(user, "Algorithms");
        } catch (BookNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (UserLimitExceededException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidReturnException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}