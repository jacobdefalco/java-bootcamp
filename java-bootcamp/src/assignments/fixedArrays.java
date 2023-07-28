import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class fixedArrays {
    private static final DecimalFormat df = new DecimalFormat("#,###.00");

    public static void introduction() {
        System.out.println("**********Fixed Length Arrays**********");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (Exception e) {
        }
    }

    public static void cubes() {
        System.out.println("**********Cubes**********");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (Exception e) {
        }
        int[] cubes = { 1, 2, 3, 4, 5, 6, 493, 39430 };
        for (int i = 0; i < cubes.length; i++) {
            System.out.println(cubes[i] + " cubed is " + df.format(Math.pow(cubes[i], 3)));

        }
    }

    public static void grades() {
        System.out.println("**********Grades**********");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (Exception e) {
        }
        Scanner myObj = new Scanner(System.in);
        System.out.println("How many grades are you submitting?");
        int quantity = myObj.nextInt();

        int gradeTotal = 0;

        System.out.println("Lets input those grades");
        for (int i = 0; i < quantity; i++) {
            int grade;
            do {
                System.out.println("Submit grade #" + (i + 1) + ":");
                grade = myObj.nextInt();
                if (grade > 100 || grade < 0) {
                    System.out.println("Grade must be between 0 and 100");
                }
            } while (grade > 100 || grade < 0);
            gradeTotal = gradeTotal + grade;
        }
        int averageGrade = gradeTotal / quantity;

        System.out.println("Average grade: " + df.format(averageGrade));
        myObj.close();
    }

    public static void main(String[] args) {
        introduction();
        cubes();
        grades();

    }
}