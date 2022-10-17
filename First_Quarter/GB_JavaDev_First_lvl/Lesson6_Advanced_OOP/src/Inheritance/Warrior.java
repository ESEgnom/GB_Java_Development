package Inheritance;

public class Warrior extends Unit {
    private int attack;

    public Warrior() {
        super(100, 5);
        this.attack = 7;
    }

    @Override
    public void go() {
        System.out.printf("[Warrior] is moving...  %n");
        System.out.printf(
                "[State] health: %s, armor: %s, attack: %s %n",
                getHealth(),
                getArmor(),
                attack
        );
    }

    @Override
    public void stop() {
        System.out.printf("[Warrior] is stopping...  %n");
        System.out.printf(
                "[State] health: %s, armor: %s, attack: %s %n",
                getHealth(),
                getArmor(),
                attack
        );
    }
}
