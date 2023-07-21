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

        String YorN;

        System.out.println("Would you like to input grades? (y/n)");
        YorN = (GradeBookObj.nextLine()).toLowerCase();

        if (YorN == "n") {
            System.out.println("Alright, see ya!");
        }

        if (YorN == "y") {
            System.out.println("Student name:");
            String studentName = GradeBookObj.nextLine();
            System.out.println("Course name:");
            String courseName = GradeBookObj.nextLine();

            int midtermGrade;
            int finalGrade;
            int projectGrade;
            do {
                System.out.println("Midterm grade (Must to be between 0-100):");
                midtermGrade = GradeBookObj.nextInt();
            } while (midtermGrade < 0 || midtermGrade > 100);
            do {
                System.out.println("Final grade (Must to be between 0-100):");
                finalGrade = GradeBookObj.nextInt();
            } while (finalGrade < 0 || finalGrade > 100);
            do {
                System.out.println("Project grade (Must to be between 0-100):");
                projectGrade = GradeBookObj.nextInt();
            } while (projectGrade < 0 || projectGrade > 100);

            double averageGrade = (midtermGrade + finalGrade + projectGrade) / 3;

            System.out.println("********Grade Results********");
            System.out.println("Student Name: " + studentName);
            System.out.println("Course Name: " + courseName);
            System.out.println("Midterm Exam Grade: " + midtermGrade);
            System.out.println("Final Exam Grade: " + finalGrade);
            System.out.println("Project Grade: " + projectGrade);
            System.out.println("Average Exam Grade: " + averageGrade);
        }
        GradeBookObj.close();
    }
}
