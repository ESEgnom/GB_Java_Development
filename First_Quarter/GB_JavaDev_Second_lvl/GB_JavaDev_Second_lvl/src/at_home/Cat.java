package at_home;

public class Cat implements Participant{

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " проходит дистанцию ...");
    }

    @Override
    public void jump() {
        System.out.println(name + " преодолевает препятствие...");
    }
}
