public class Course<T extends CourseType> {
    private final String name;
    private final T type;
    public Course(String name, T type) { this.name = name; this.type = type; }
    public void show() { System.out.println(" - " + name + " [" + type.getClass().getSimpleName() + "]"); }
}

public class ResearchCourse extends CourseType { }

public class AssignmentCourse extends CourseType { }

public class ExamCourse extends CourseType { }

public abstract class CourseType { }