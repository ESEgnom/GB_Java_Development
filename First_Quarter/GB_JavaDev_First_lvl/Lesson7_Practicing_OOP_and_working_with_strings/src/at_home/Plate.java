package at_home;

public class Plate {
    private final int size = 15;
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int decreaseFood(int n) {
        food -= n;
        return food;
    }


    public void info() {
        System.out.println("plate: " + food);
    }

    public void addFood(FoodBag foodBag) {
        food += foodBag.decreaseFood(isFullPlate());
        System.out.println("Plate again is full: " + food);
    }

    public int isFullPlate() {
        return size - food;
    }

    public int getFood() {
        return food;
    }
}
