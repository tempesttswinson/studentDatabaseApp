import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {
        // Ask how many new students the user wants to add
        System.out.print("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();

        // creates an array of Student objects
        Student[] students = new Student[numOfStudents];

        // Create n number of students
        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }

        for (int n = 0; n < numOfStudents; n++) {
            System.out.println(students[n].toString());
        }

    }
}