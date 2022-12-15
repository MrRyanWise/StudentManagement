package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    // Properties
    private String firstName;
    private String lastName;
    private String gradeYear;
    private int studentID;
    private String courses;
    private int tuitionBalance;
    private int costOfCourse = 600;

    // Constructor
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name : ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name : ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level : ");
        this.gradeYear = in.nextLine();

        System.out.print(firstName + " " + lastName + " " + gradeYear);
    }
}