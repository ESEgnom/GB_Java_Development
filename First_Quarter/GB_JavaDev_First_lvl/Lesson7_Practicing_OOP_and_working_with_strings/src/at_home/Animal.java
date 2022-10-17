package at_home;

public abstract class Animal {
    private String name;
    private int appetite;
    private boolean fedUp;

    public Animal(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public abstract boolean eat(Plate p);

    public int getAppetite() {
        return appetite;
    }

    public boolean isFedUp() {
        return fedUp;
    }
}
