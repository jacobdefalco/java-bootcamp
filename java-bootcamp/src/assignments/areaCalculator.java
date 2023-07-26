import java.text.DecimalFormat;
import java.util.Scanner;

public class areaCalculator {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void introduction() {
        System.out.println("***********Welcome to the Area Calculator!***********");

    }

    public static void squareArea() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is the length of the square's sides?");
        int length = myObj.nextInt();
        int area = length * length;
        System.out.println("The area of the square is: " + df.format(area));
        return;
    }

    public static void circleArea() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is the radius of the cirlce?");
        int radius = myObj.nextInt();
        double area = Math.pow(Math.PI * radius, 2);
        System.out.println("The area of the circle is: " + df.format(area));
        return;
    }

    public static void areas() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What area do you want to calculate?");
        System.out.println("Square, Circle, Quit - (S, C, Q)");
        String scq = "";
        scq = myObj.nextLine();

        if (scq.equals("s")) {
            squareArea();
            areas();
        } else if (scq.equals("c")) {
            circleArea();
            areas();
        } else if (scq.equals("q")) {
            System.out.println("Alright later ya loser");
            myObj.close();
            return;
        } else {
            System.out.println("Invalid Input! Try Again");
            areas();
        }
        myObj.close();
    }

    public static void main(String[] args) {
        introduction();
        areas();
    }
}