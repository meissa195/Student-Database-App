import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID; //unique ID
    private String courses = "";
    private int tuitionBalance = 0; //start off with 0
    private static int costOfCourse = 600;
    private static int id = 1000; //static, true for all objects, belongs to class/Student

    public Student() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name: ");
        this.firstName = scanner.nextLine();

        System.out.println("Enter last name: ");
        this.lastName = scanner.nextLine();

        System.out.println("Enter student grade level:" +
                "\n1. Freshman" +
                "\n2. Sophomore" +
                "\n3. Junior" +
                "\n4. Senior");
        this.gradeYear = scanner.nextInt();

        setStudentID();

    }

    //Generate and ID
    private void setStudentID() {
        //Grade level + ID
        id++; //increase static ID by 1 each time new student is created; 1001, 1002, 1003, etc...
        this.studentID = this.gradeYear + "" + id;
    }

    //Enroll in courses
    public void enroll() {
        //get inside a loop, user hits 0 when done enrolling
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner scanner = new Scanner(System.in);
            String course = scanner.nextLine();
            if (!course.equals("Q")) {
                this.courses = this.courses + "\n > " + course + ".";
                this.tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;

            }
        } while (true);
    }

    //View balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    //Pay tuition
    public void payTuition() {
        viewBalance();
        System.out.println("Enter your payment: ");
        Scanner scanner = new Scanner(System.in);
        int payment = scanner.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of: $" + payment);
        viewBalance();
    }

    //Show info
    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses enrolled: " + courses +
                "\nBalance is: $" + tuitionBalance;
    }
}
