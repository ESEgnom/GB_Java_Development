package at_home;

public class FoodBag {

    private int amountFood;

    public FoodBag() {
        amountFood = 100;
    }

    public int decreaseFood(int n) {
        amountFood -= n;
        return n;
    }

    public void foodBagInfo() {
        System.out.println("amountFood: " + amountFood);
    }
}
