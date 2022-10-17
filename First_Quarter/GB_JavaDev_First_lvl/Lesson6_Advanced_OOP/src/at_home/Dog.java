package at_home;

public class Dog extends Animal{

    private static int count = 0;

    public Dog(String name) {
        super(name,500, 10);
        count++;
    }

    public void run(int distance) {
        if (getRunDistanceLimit() > distance){
            System.out.printf("%s пробежал %s m %n",getName(), distance);
        }else {
            System.out.printf("%s не смог пробежать %s m %n",getName(), distance);
        }
    }
    public void swim(int distance) {
        if (getSwimDistanceLimit() > distance){
            System.out.printf("%s проплыл %s m %n",getName(), distance);
        }else {
            System.out.printf("%s не смог проплыть %s m %n",getName(), distance);
        }
    }
}
