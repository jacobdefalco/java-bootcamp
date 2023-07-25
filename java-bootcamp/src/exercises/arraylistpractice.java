package exercises;

import java.util.ArrayList;

public class arraylistpractice {
    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<String>();
        movies.add("Willy Wonka");
        movies.add("Greatest Showman");
        movies.add("Shutter Island");
        System.out.print(movies);
        movies.remove(2);
        System.out.print(movies);
    }
}
