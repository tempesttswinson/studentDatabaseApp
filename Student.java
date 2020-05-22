import java.util.Scanner;

public class Student {
    private int gradeYear;
    private int tuitionBalance = 0;
    private String firstName, lastName, studentID;
    private String courses = "";
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
            System.out.print("Enter course to enroll (Q to quit): ");

            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equalsIgnoreCase("Q")) {
                courses = courses + "\n " + course;
                tuitionBalance += costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);

        System.out.println("ENROLLED IN: " + courses);
    }

    // View balance
    public void viewBalance() {
        System.out.println("Your balance is: " + tuitionBalance);
    }

    // method for paying tuition
    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    // View Status
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\nGrade Level: " + gradeYear + "\nStudent Id: " + studentID
                + "\nCourses Enrolled: " + courses + "\nBalance: $" + tuitionBalance;
    }

}