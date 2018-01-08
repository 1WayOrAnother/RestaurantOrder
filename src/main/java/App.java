

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class App {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        int guestCount = parseInt(getInfoFromUser("How many guests are coming?"));

        boolean isFood = Boolean.valueOf(getInfoFromUser("Order food? type / 'true' if yes / 'false' if no."));

        boolean isDrinks = Boolean.valueOf(getInfoFromUser("Order drinks? / type 'true' if yes / 'false' if no."));

        boolean isMusic = Boolean.valueOf(getInfoFromUser("Orderm Music? / type 'true' if yes / 'false' if no."));

        System.out.println();

        String couponNumber = null;
    }

    private static String getInfoFromUser(String message) {
        System.out.println(message);

        return SCANNER.next();
    }

}

