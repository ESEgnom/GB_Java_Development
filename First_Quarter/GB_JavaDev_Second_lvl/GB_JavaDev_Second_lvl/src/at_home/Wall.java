package at_home;

public class Wall implements Obstacle{
    @Override
    public void overcome(Participant p) {
        p.jump();
    }
}
