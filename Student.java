import java.util.Scanner;

public class Student {
    private int numOfStudents, gradeYear;
    private int tuitionBalance = 0;
    private String firstName, lastName, studentID;
    private String courses = null;
    // static variables mean that the property is true for all objects. Its not
    // specific to just one object. It belongs to the class not just an instance of
    // the object
    private static int costOfCourse = 600;
    private static int id = 1000;

    // constuctor prompts user to enter student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level:");
        this.gradeYear = in.nextInt();

        setStudentID();

        System.out.println(firstName + lastName + gradeYear + " " + studentID);

    }

    // generate unique 5 digit ID for each student with the first number
    // representing grade year
    private void setStudentID() {
        // Grade Year + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    // method for enrolling in courses
    public void enroll() {
        // get inside a loop, user hits Q to exit
        do {
            System.out.println("Enter course to enroll (Q to quit): ");

            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);

        System.out.println("ENROLLED IN: " + courses);
        System.out.println("TUITION BALANCE: " + tuitionBalance);
    }

    // View balance

    // method for paying tuition

    // View Status

}