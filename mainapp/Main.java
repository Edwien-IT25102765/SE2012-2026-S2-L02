package mainapp;
import models.*;
import services.EnrollmentManager;
import java.util.Scanner;

/**
 * Main application entry point for the Student Management System.
 */

public class Main {

    /**
     * Main execution method displaying the interactive user menu.
     * 
     * @param args Command-line arguments.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] student = new Student[100];
        int studentCount = 0;

        EnrollmentManager enrollmentManager = new EnrollmentManager();
        
        
        boolean running = true;

        while (running) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Sort Students by Name");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            if (scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    String id;
                    while (true) {
                        System.out.print("Enter Student ID (e.g:- IT25102765): ");
                        id = scanner.nextLine().trim();
                        if (id.matches("^IT\\d{8}$")) {
                            break;
                        }
                        System.out.println("Invalid ID format! Must start with 'IT' followed by 8 digits.");
                    }

                    String name;
                    while (true) {
                        System.out.print("Enter Student Name: ");
                        name = scanner.nextLine().trim();
                        if (name.matches("^[A-Z][a-zA-Z\\s]*$")) {
                            break;
                        }
                        System.out.println("Invalid Name! Name must start with a capital letter only.");
                    }

                    Student newStudent = new Student(id, name);
                    Course course = new Course("SE2012", "Object Oriented Analysis and Design");
                    
                    enrollmentManager.enroll(newStudent, course);
                    student[studentCount++] = newStudent;
                    break;
                case 2:
                    for (int i = 0; i < studentCount; i++) {
                        System.out.println(student[i]);
                    }
                    break;
                case 3:
                    System.out.print("Enter Student ID to search: ");
                    String searchId = scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < studentCount; i++) {
                        if (student[i].getId().equals(searchId)) {
                            System.out.println("Student found: " + student[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student with ID " + searchId + " not found.");
                    }
                    break;
                case 4:
                    for (int i = 0; i < studentCount - 1; i++) {
                        for (int j = 0; j < studentCount - i - 1; j++) {
                            if (student[j].getName().compareToIgnoreCase(student[j + 1].getName()) > 0) {
                                Student temp = student[j];
                                student[j] = student[j + 1];
                                student[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("Students sorted by name alphabetically.");
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.(1-5)");
            }
            }else{
            System.out.println("Invalid input. Please enter a number.");
            scanner.nextLine(); // Consume the invalid input
            }

        }
        scanner.close();
    }
}
