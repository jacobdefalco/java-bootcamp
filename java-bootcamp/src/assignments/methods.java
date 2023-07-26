import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class methods {

    public static void astLine() {
        System.out.println("*********************");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (Exception e) {
        }
    }

    public static void introduction() {
        System.out.println(
                "Greetings traveler, you seem quite weary from the road.  Take a seat and let the wise mage of this keep learn you a thing or two.");
    }

    public static void addingGame() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Would you like to play a game? y/n");
        String yesno = myObj.nextLine().toLowerCase();
        Random rand = new Random();
        if (yesno.equals("y")) {
            int rand_int1 = rand.nextInt(100);
            int rand_int2 = rand.nextInt(100);
            System.out.println("Please add " + rand_int1 + " and " + rand_int2);
            int addingAnswer = myObj.nextInt();
            if (addingAnswer == rand_int1 + rand_int2) {
                System.out.println("YOU GOT IT RIGHT!  You're quite the mathmagician.");
            } else {
                System.out.println("How could you be so dumb?");
            }
        } else if (yesno.equals("n")) {
            System.out.println("Alright, whatever dude.  Suit yourself.");
        } else {
            System.out.println("Invalid input. Please Try Again.");
            addingGame();
        }
        myObj.close();
    }

    public static void squares() {
        System.out.println("The system will now print squares from 2-24");
        ;
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (Exception e) {
        }
        for (int i = 2; i < 24; i++) {
            System.out.println(i * i);
        }
    }

    public static void main(String[] args) {
        astLine();
        introduction();
        astLine();
        addingGame();
        astLine();
        squares();
    }
}
