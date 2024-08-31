package StudentManagement;
import java.util.LinkedList;
import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    String course;
    String cgpa;
    String mobileNo;
    String emailId;

    public Student(String name, int rollNo, String course, String cgpa, String mobileNo, String emailId) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
        this.cgpa = cgpa;
        this.mobileNo = mobileNo;
        this.emailId = emailId;
    }
}

public class StudentManagement {
    static LinkedList<Student> students = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    searchStudent(scanner);
                    break;
                case 3:
                    displayAllStudents();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }

    private static void addStudent(Scanner scanner) {
        System.out.print("Enter Name: ");
        String name = scanner.next();
        System.out.print("Enter Roll Number: ");
        int rollNo = scanner.nextInt();
        System.out.print("Enter Course: ");
        String course = scanner.next();
        System.out.print("Enter CGPA: ");
        String cgpa = scanner.next();
        System.out.print("Enter Mobile Number: ");
        String mobileNo = scanner.next();
        System.out.print("Enter Email ID: ");
        String emailId = scanner.next();

        Student student = new Student(name, rollNo, course, cgpa, mobileNo, emailId);
        students.add(student);
        System.out.println("Student added successfully!");
    }

    private static void searchStudent(Scanner scanner) {
        System.out.print("Enter roll number to search: ");
        int rollNo = scanner.nextInt();

        for (Student student : students) {
            if (student.rollNo == rollNo) {
                System.out.println("Name: " + student.name);
                System.out.println("Roll Number: " + student.rollNo);
                System.out.println("Course: " + student.course);
                System.out.println("CGPA: " + student.cgpa);
                System.out.println("Mobile Number: " + student.mobileNo);
                System.out.println("Email ID: " + student.emailId);
                return;
            }
        }
        System.out.println("Student not found!");
    }

    private static void displayAllStudents() {
        for (Student student : students) {
            System.out.println("Name: " + student.name);
            System.out.println("Roll Number: " + student.rollNo);
            System.out.println("Course: " + student.course);
            System.out.println("CGPA: " + student.cgpa);
            System.out.println("Mobile Number: " + student.mobileNo);
            System.out.println("Email ID: " + student.emailId);
            System.out.println();
        }
    }
}
