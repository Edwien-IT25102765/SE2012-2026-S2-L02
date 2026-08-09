package models;

/**
 * Represents a course object in the system.
 */
public class Course {
    private String code;
    private String title;

    /**
     * Constructs a new Course object.
     * 
     * @param code  The course code (e.g., SE2012).
     * @param title The title/description of the course.
     */

    public Course(String code,  String title){
        this.code = code;
        this.title = title;
    }

    /**
     * Gets the course code.
     * 
     * @return The course code.
     */

     public String getCode() {
        return code;
    }

    /**
     * Gets the course title.
     * 
     * @return The course title.
     */

    public String getTitle() {
        return title;
    }

    /**
     * Returns a string representation of the course object.
     * 
     * @return Formatted string with course code and title.
     */
    @Override

    public String toString() {
        return "Course Code: " + code + ", Title: " + title;
    }
}
