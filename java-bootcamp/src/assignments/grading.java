package assignments;

import java.util.Scanner;

public class grading {
    public static void main(String[] args) {
        Scanner GradeObj = new Scanner(System.in);
        System.out.println("What is your first name?");
        String UsersName = GradeObj.nextLine();
        String username = UsersName.substring(0, 3).toLowerCase();
        System.out.println("Your username is " + username + "_YearUp");
        int grade;
        do {
            System.out.println("What is your grade?");
            grade = GradeObj.nextInt();
            if (grade < 1 || grade > 100) {
                System.out.println("The inputted number must be between 1 and 100");
            } else {
                if (grade % 2 == 0) {
                    System.out.println("The grade is an even number");
                } else {
                    System.out.println("The grade is an odd number");
                }
            }
        } while (grade < 1 || grade > 100);
        GradeObj.close();
    }
}