package StudenManagementSystem;
import java.util.HashMap;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private int age;
    private String course;

    public Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String toString() {
        return String.format("ID: %d, Name: %s, Age: %d, Course: %s", id, name, age, course);
    }
}

public class StudentManagementSystem {
    private static HashMap<Integer, Student> students = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Remove Student");
            System.out.println("4. View Student Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> updateStudent();
                case 3 -> removeStudent();
                case 4 -> viewStudentDetails();
                case 5 -> {
                    running = false;
                    System.out.println("Exiting Student Management System. Goodbye!");
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        if (students.containsKey(id)) {
            System.out.println("Error: A student with this ID already exists.");
            return;
        }
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Course: ");
        String course = scanner.nextLine();
        students.put(id, new Student(id, name, age, course));
        System.out.println("Student added successfully!");
    }

    private static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Student student = students.get(id);
        if (student == null) {
            System.out.println("Error: Student not found.");
            return;
        }
        System.out.print("Enter New Name (current: " + student.getName() + "): ");
        String name = scanner.nextLine();
        System.out.print("Enter New Age (current: " + student.getAge() + "): ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter New Course (current: " + student.getCourse() + "): ");
        String course = scanner.nextLine();
        student.setName(name);
        student.setAge(age);
        student.setCourse(course);
        System.out.println("Student details updated successfully!");
    }

    private static void removeStudent() {
        System.out.print("Enter Student ID to remove: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        if (students.remove(id) != null) {
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Error: Student not found.");
        }
    }

    private static void viewStudentDetails() {
        System.out.println("\nView Options:");
        System.out.println("1. View All Students");
        System.out.println("2. View Specific Student");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                if (students.isEmpty()) {
                    System.out.println("No students available.");
                } else {
                    System.out.println("All Student Records:");
                    students.values().forEach(System.out::println);
                }
            }
            case 2 -> {
                System.out.print("Enter Student ID: ");
                int id = scanner.nextInt();
                Student student = students.get(id);
                if (student == null) {
                    System.out.println("Error: Student not found.");
                } else {
                    System.out.println(student);
                }
            }
            default -> System.out.println("Invalid choice.");
        }
    }
}
