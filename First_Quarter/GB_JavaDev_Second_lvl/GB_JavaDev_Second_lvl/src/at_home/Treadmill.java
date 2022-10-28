package at_home;

public class Treadmill implements Obstacle{

    @Override
    public void overcome(Participant p) {
        p.run();
    }
}
