package at_home;

public class Cat extends Animal{


    public Cat(String name) {
       super(name, 200, 0);
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
