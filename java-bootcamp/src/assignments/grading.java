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
        if (grade <= 100 && grade >= 90) {
            System.out.println("Congrats! You got an A!");
        }
        if (grade <= 89 && grade >= 80) {
            System.out.println("You got an B!");
        }
        if (grade <= 79 && grade >= 70) {
            System.out.println("You got an C!");
        }
        if (grade <= 69 && grade >= 60) {
            System.out.println("You got an D!");
        }
        if (grade <= 59) {
            System.out.println("You got an F!");
        }
        GradeObj.close();
    }
}
