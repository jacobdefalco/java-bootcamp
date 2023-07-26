import java.util.Scanner;

public class CoinCount {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("How many pennies are you inputting?");
        double pennies = myObj.nextDouble(); // Read user input
        System.out.println("How many nickels are you inputting?");
        double nickels = myObj.nextDouble();
        System.out.println("How many dimes are you inputting?");
        double dimes = myObj.nextDouble();
        System.out.println("How many quarters are you inputting?");
        double quarters = myObj.nextDouble();

        double total = (pennies) + (nickels * 5) + (dimes * 10) + (quarters * 25);
        double cents = total % 100;
        double dollars = (total - cents) / 100;

        System.out
                .println("****THANK YOU**** We will now credit your account with: " + dollars + " dollars and " + cents
                        + " cents"); // Output user input
    }
}
