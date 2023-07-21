package assignments;

import java.text.DecimalFormat;

import java.util.Scanner;

public class GradeBook {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            System.out.println("The Square Root of " + i + " is " + df.format(Math.sqrt(i)));
        }
        Scanner GradeBookObj = new Scanner(System.in);
        System.out.println("************");
        System.out.println("Would you like to input grades? (y/n)");
        String proceed = GradeBookObj.nextLine();
        if (proceed != "y" || proceed != "n") {
            System.out.println("y/n needed");
        }
        String proceed2 = GradeBookObj.nextLine();
        switch (proceed2) {
            case "n":
                System.out.println("See ya!");
                break;
            case "y":
                System.out.println("Student name:");
                String studentName = GradeBookObj.nextLine();
                System.out.println("Course name:");
                String courseName = GradeBookObj.nextLine();
                System.out.println("Midterm grade (Needs to be between 0-100):");
                int midtermGrade = GradeBookObj.nextInt();
                System.out.println("Final grade (Needs to be between 0-100):");
                int finalGrade = GradeBookObj.nextInt();
                System.out.println("Project grade (Needs to be between 0-100)");
                int projectGrade = GradeBookObj.nextInt();
                double averageGrade = (midtermGrade + finalGrade + projectGrade) / 3;
                System.out.println("********Grade Results********");
                System.out.println("Student Name: " + studentName);
                System.out.println("Course Name: " + courseName);
                System.out.println("Midterm Exam Grade: " + midtermGrade);
                System.out.println("Final Exam Grade: " + finalGrade);
                System.out.println("Average Exam Grade: " + averageGrade);
                break;
        }
        GradeBookObj.close();
    }

}
