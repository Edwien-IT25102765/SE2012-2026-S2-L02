package services;
import models.*;

public class EnrollmentManager {

    /**
     * Enrolls a student into a specific course.
     * @param student the student to enroll
     * @param course the course to enroll in
     */
    public void enroll(Student student, Course course) {
        System.out.println(student.getName() + " successfully enrolled to " + course.getTitle() );
    }
}
