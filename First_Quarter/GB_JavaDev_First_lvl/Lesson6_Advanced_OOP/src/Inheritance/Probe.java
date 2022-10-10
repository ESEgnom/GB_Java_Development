package Inheritance;

public class Probe extends Unit {
    public Probe() {
        super(100, 1);
    }

    @Override
    public void go() {
        System.out.printf("[Probe] is moving...  %n");
        System.out.printf(
                "[State] health: %s, armor: %s %n",
                getHealth(),
                getArmor()
        );
    }

    @Override
    public void stop() {
        System.out.printf("[Probe] is stopping...  %n");
        System.out.printf(
                "[State] health: %s, armor: %s %n",
                getHealth(),
                getArmor()
        );
    }
}