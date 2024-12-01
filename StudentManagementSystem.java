
import java.util.HashMap;
import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {
        HashMap<Integer, String> studentGrades = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nStudent Management Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student by ID");
            System.out.println("3. Update Student Grade");
            System.out.println("4. Remove Student");
            System.out.println("5. Display All Students");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Student Name and Grade (e.g., John A+): ");
                    String nameAndGrade = scanner.nextLine();
                    studentGrades.put(id, nameAndGrade);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Student ID to search: ");
                    id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    if (studentGrades.containsKey(id)) {
                        System.out.println("Student Details: " + studentGrades.get(id));
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to update: ");
                    id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    if (studentGrades.containsKey(id)) {
                        System.out.print("Enter new name and grade: ");
                        nameAndGrade = scanner.nextLine();
                        studentGrades.put(id, nameAndGrade);
                        System.out.println("Student details updated successfully!");
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Student ID to remove: ");
                    id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    if (studentGrades.remove(id) != null) {
                        System.out.println("Student removed successfully!");
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 5:
                    System.out.println("\nAll Students:");
                    if (studentGrades.isEmpty()) {
                        System.out.println("No students available.");
                    } else {
                        for (Integer key : studentGrades.keySet()) {
                            System.out.println("ID: " + key + ", Details: " + studentGrades.get(key));
                        }
                    }
                    break;

                case 6:
                    System.out.println("Exiting the Student Management System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}