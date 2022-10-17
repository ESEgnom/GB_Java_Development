package Inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Probe probe = new Probe();

        warrior.go();
        warrior.stop();
        System.out.println();
        probe.go();
        probe.stop();
    }
}
