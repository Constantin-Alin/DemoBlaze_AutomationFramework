package data;

import java.util.Random;

public class EmailAddress {
    static Random rnd;

    private EmailAddress() {
    }

    public static String generateEmail() {
        rnd = new Random();
        int number = rnd.nextInt(10000);
        return "marianpopescu" + number + "@abc.com";
    }
}
