package at_home;

public class Cat extends Animal{
    private static int count = 0;

    public Cat(String name) {
       super(name, 200, 0);
       count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void swim(int distance) {
        if (getSwimDistanceLimit() > distance){
            System.out.printf("%s проплыл %s m %n",getName(), distance);
        }else {
            System.out.printf("%s не умеет плавать%n",getName(), distance);
        }
    }

    @Override
    public void run(int distance) {
        if (getRunDistanceLimit() > distance){
            System.out.printf("%s пробежал %s m %n",getName(), distance);
        }else {
            System.out.printf("%s не смог пробежать %s m %n",getName(), distance);
        }
    }
}
