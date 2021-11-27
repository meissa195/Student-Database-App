import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    //Ask how many new students we want to add
        System.out.println("Enter number of new students to enroll: ");
        Scanner scanner = new Scanner(System.in);
        int numOfStudents = scanner.nextInt();
        Student[] students = new Student[numOfStudents];

    //Create a number of new students
        for (int i = 0; i < numOfStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }
        for (Student student : students) {
            System.out.println(student);
            System.out.println();
        }
    }
}
