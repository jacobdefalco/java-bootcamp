package exercises;

import java.util.Scanner;

public class randomNumber {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10) + 1;
        Scanner myObj = new Scanner(System.in);
        int answer;
        do {
            System.out.println("Guess the number!");
            answer = myObj.nextInt();
        } while (answer != a);
        System.out.println("YOU GOT IT RIGHT!");
        myObj.close();
    }
}