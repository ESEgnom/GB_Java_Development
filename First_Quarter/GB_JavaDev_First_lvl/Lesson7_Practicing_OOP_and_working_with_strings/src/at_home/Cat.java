package at_home;

public class Cat extends Animal {
    private boolean fedUp ;
    public Cat(String name, int appetite) {
        super(name, appetite);
        this.fedUp = isFedUp();
    }

    public boolean eat(Plate p) {

        if (getAppetite() < p.getFood()) {
            p.decreaseFood(getAppetite());
            return fedUp = true;
        }
        return fedUp;
    }


}
