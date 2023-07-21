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

        String yesno;
        do {
            System.out.println("Would you like to input grades? Y/N");
            yesno = (GradeBookObj.next()).toLowerCase();

            if (yesno.equals("y")) {
                System.out.println("Student name:");
                String studentName = GradeBookObj.next();
                System.out.println("Course name:");
                String courseName = GradeBookObj.next();

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

                char letterGrade = 'A';
                if (averageGrade <= 100 && averageGrade >= 90) {
                    letterGrade = 'A';
                }
                if (averageGrade <= 89 && averageGrade >= 80) {
                    letterGrade = 'B';
                }
                if (averageGrade <= 79 && averageGrade >= 70) {
                    letterGrade = 'C';
                }
                if (averageGrade <= 69 && averageGrade >= 60) {
                    letterGrade = 'D';
                }
                if (averageGrade <= 59) {
                    letterGrade = 'G';
                }

                String feeback = "You have earned " + letterGrade + " for this class.";

                System.out.println("********Grade Results********");
                System.out.println("Student Name: " + studentName);
                System.out.println("Course Name: " + courseName);
                System.out.println("Midterm Exam Grade: " + midtermGrade);
                System.out.println("Final Exam Grade: " + finalGrade);
                System.out.println("Project Grade: " + projectGrade);
                System.out.println("Average Exam Grade: " + averageGrade);
                System.out.println(feeback);
            } else if (yesno.equals("n")) {
                System.out.println("LATER LOSER");
            } else {
                System.out.println("That is an invalid input. Input must be y/n. Ya dummy");
                yesno = "y";
            }
        } while (yesno.equals("y"));
        GradeBookObj.close();
    }
}
// System.out.println("Would you like to input grades? (y/n)");
// YorN = (GradeBookObj.nextLine()).toLowerCase();

// if (YorN == "n") {
// System.out.println("Alright, see ya!");
// }

// if (YorN == "y") {
// System.out.println("Student name:");
// String studentName = GradeBookObj.nextLine();
// System.out.println("Course name:");
// String courseName = GradeBookObj.nextLine();

// int midtermGrade;
// int finalGrade;
// int projectGrade;
// do {
// System.out.println("Midterm grade (Must to be between 0-100):");
// midtermGrade = GradeBookObj.nextInt();
// } while (midtermGrade < 0 || midtermGrade > 100);
// do {
// System.out.println("Final grade (Must to be between 0-100):");
// finalGrade = GradeBookObj.nextInt();
// } while (finalGrade < 0 || finalGrade > 100);
// do {
// System.out.println("Project grade (Must to be between 0-100):");
// projectGrade = GradeBookObj.nextInt();
// } while (projectGrade < 0 || projectGrade > 100);

// double averageGrade = (midtermGrade + finalGrade + projectGrade) / 3;

// System.out.println("********Grade Results********");
// System.out.println("Student Name: " + studentName);
// System.out.println("Course Name: " + courseName);
// System.out.println("Midterm Exam Grade: " + midtermGrade);
// System.out.println("Final Exam Grade: " + finalGrade);
// System.out.println("Project Grade: " + projectGrade);
// System.out.println("Average Exam Grade: " + averageGrade);
// }