
public class Order {

    public static final int FOOD_COST = 15;

    public static final int DRINKS_COST = 25;

    public static final int MUSIC_COST = 35;

    public static final int BENEFIT = 55;

    public static final String COUPON_NUMBER = "#B17";


    private int guestCount;
    private boolean isFood;
    private boolean isDrinks;
    private boolean isMusic;
    private String couponNumber;

    Order(int inputGuestCount, boolean inputFood, boolean inputDrinks,
          boolean inputMusic, String couponNumber) {
        guestCount = inputGuestCount;
        isFood = inputFood;
        isDrinks = inputDrinks;
        isMusic = inputMusic;
        this.couponNumber = couponNumber;
    }

    public boolean isFood() {
        return isFood;
    }

    public void setCouponNumber(String cn) {
        couponNumber = cn;
    }


    public int calculateCost() {

        int resultCost = 0;

        int couponBenefit = 0;

        if (isMusic) {
            resultCost += MUSIC_COST;
        }

        if (isFood) {
            resultCost += FOOD_COST;
        }

        if (isDrinks) {
            resultCost += DRINKS_COST;
        }

        if (couponNumber.equals(COUPON_NUMBER)) {
            couponBenefit = BENEFIT;
        }

        return guestCount * resultCost - couponBenefit;
    }
}