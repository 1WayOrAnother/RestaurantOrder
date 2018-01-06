import java.util.Scanner;
package restarant;

public class Order {


    public class Order {

        private static final int FOOD_PRICE = 30;

        private static final int DRINKS_PRICE = 50;

        private static final int MUSIC_PRICE = 40;

        private boolean isFood;

        private boolean isMusic;

        private boolean isDrinks;

        private int countOfPeople;

        public Order(boolean isFood, boolean isMusic, boolean isDrinks, int countOfPeople) {
            this.isFood = isFood;
            this.isMusic = isMusic;
            this.isDrinks = isDrinks;
            this.countOfPeople = countOfPeople;
        }

        public int sumOfOrder() {

            int sum = 0;

            if(isFood) {
                sum += FOOD_PRICE;
            }

            if(isDrinks) {
                sum += DRINKS_PRICE;
            }

            if(isMusic) {
                sum += MUSIC_PRICE;
            }

            return countOfPeople * sum;
        }


    }

    class Restorant {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Will you order food? type (true) if order");





            System.out.println("Food = " + scanner.nextBoolean());

            System.out.println("Music = " + scanner.nextBoolean());

            System.out.println("Drinks = " + scanner.nextBoolean());

            Order order = new Order(true, false, false, 9);




        }
    }
