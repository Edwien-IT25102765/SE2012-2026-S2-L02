package models;

/**
 * Represents a student object in the system.
 */

public class Student {
   private String id;
   private String name;

   /**
     * Constructs a new Student object.
     * 
     * @param id   The unique student ID.
     * @param name The full name of the student.
     */

   public Student(String id, String name) {
       this.id = id;
       this.name = name;
   }

   /**
     * Gets the student's unique ID.
     * 
     * @return The student ID.
     */

    public String getId() {
         return id;
    }

    /**
     * Gets the student's name.
     * 
     * @return The student name.
     */

    public String getName() {
        return name;
    }

    /**
     * Returns a string representation of the student object.
     * 
     * @return Formatted string with student ID and name.
     */
    @Override


    public String toString() {
        return "Student ID: " + id + ", Name: " + name;
    }
}
