package at_home;

public abstract class Animal {
    private String name;
    private int runDistanceLimit;
    private int swimDistanceLimit;
    private static int count = 0;

    public Animal(String name, int runDistanceLimit, int swimDistanceLimit) {
        this.name = name;
        this.runDistanceLimit = runDistanceLimit;
        this.swimDistanceLimit = swimDistanceLimit;
        count++;
    }

    public String getName() {
        return name;
    }

    public int getRunDistanceLimit() {
        return runDistanceLimit;
    }

    public int getSwimDistanceLimit() {
        return swimDistanceLimit;
    }

    public static int getCount() {
        return count;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);
}
