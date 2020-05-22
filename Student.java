import java.util.Scanner;

public class Student {
    private int numOfStudents, studentID, tuitionBalance, gradeYear;
    private int costOfCourse = 600;
    private String firstName, lastName;
    private String courses;// enums

    // constuctor prompts user to enter student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level:");
        this.gradeYear = in.nextInt();
        System.out.println(firstName + lastName + gradeYear);

    }

    // generate unique 5 digit ID for each student

    // method for enrolling in courses

    // View balance

    // method for paying tuition

    // View Status

}