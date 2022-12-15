package studentdatabaseapp;

import java.util.Scanner;

public class StudentDataBaseApp {

    public static void main(String[] args) {
        // Creation of a new student


        Student student = new Student();
        student.enroll();
        student.payTuition();
        System.out.println(student);
        

        // Ask how many new users we want to add
        System.out.println("Enter number of new students to enroll :");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        // Create n number of new students
        for (int i = 0; i < numOfStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }

        System.out.println("resume : ");

        for (Student studentResult : students) {
            System.out.println(studentResult.toString());
        }
    }
}
