package at_home;

public abstract class Animal {
    private String name;
    private int runDistanceLimit;
    private int swimDistanceLimit;

    public Animal(String name, int runDistanceLimit, int swimDistanceLimit) {
        this.name = name;
        this.runDistanceLimit = runDistanceLimit;
        this.swimDistanceLimit = swimDistanceLimit;
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

    public abstract void run(int distance);
    public abstract void swim(int distance);

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", runDistanceLimit=" + runDistanceLimit +
                ", swimDistanceLimit=" + swimDistanceLimit +
                '}';
    }
}

