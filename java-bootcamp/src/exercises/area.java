package exercises;

import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is the height of the rectangle?");
        int height = myObj.nextInt();
        System.out.println("What is the length of the rectangle?");
        int width = myObj.nextInt();
        int area = height * width;
        System.out.println("The area of the rectangle is " + area + " units squared.");
        myObj.close();
    }
}
