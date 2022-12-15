package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    // Properties
    private String firstName;
    private String lastName;
    private String gradeYear;
    // static means that the property is not specified for the object only
    private static int id = 1000;
    private static int costOfCourse = 600;
    private String courses = "";
    private String studentID;
    private int tuitionBalance;


    // Constructor
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name : ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name : ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level : ");
        this.gradeYear = in.nextLine();

        setStudentId();
    }

    // Generate an ID
    private void setStudentId() {
        // Grade Level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    // Enroll in courses
    public void enroll() {
        // Get inside a loop user hits 0
        do {
            System.out.println("\nEnter course to enroll (Q to quit) : ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();

            if (!course.equals("Q")) {
                courses += "\n    " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }

        } while (true);

        System.out.println("\nENROLLED IN : " + courses);
    }

    // View the balance
    public void viewBalance() {
        System.out.println("\nYour balance is : $" + tuitionBalance);
    }

    // Pay Tuition
    public void payTuition() {

        System.out.println("\nAdd your payment: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();

        tuitionBalance = tuitionBalance - payment;
        System.out.println("\nThank you for your payment of $" + payment);

        viewBalance();
    }

    // Show status

    public String toString() {
        return "\nName : " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent Id: " + studentID +
                "\nCourses Enrolled:" + courses +
                "\nBalance: $" + tuitionBalance;
    }
}