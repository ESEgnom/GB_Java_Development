package at_home;

public class Robot implements Participant{

    private String model;

    public Robot(String model) {
        this.model = model;
    }

    @Override
    public void run() {
        System.out.println(model + " проходит дистанцию ...");
    }

    @Override
    public void jump() {
        System.out.println(model + " преодолевает препятствие...");
    }
}
