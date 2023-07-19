package exercises;

import java.util.Scanner;

public class rollercoastar {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("How tall is the rider in inches?");
        int answer = myObj.nextInt();
        if (answer >= 48) {
            System.out.println("You may ride the ride!");
        } else {
            System.out.println("Sorry, you are not tall enought to ride this rollercoastar :( )");
        }
        myObj.close();
    }
}
