package Inheritance;

public abstract class Unit {
    private int health;
    private int armor;

    public Unit(int health, int armor) {
        this.health = health;
        this.armor = armor;
    }

    public int getHealth() {
        return health;
    }

    public int getArmor() {
        return armor;
    }

    public abstract void go();

    public abstract void stop();
}

