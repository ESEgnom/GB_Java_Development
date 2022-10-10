package at_home;

public class Main {

    public static void main(String[] args) {
        Animal[] animals =
                {
                        new Cat("Barsik", 5),
                        new Cat("Murka", 7),
                        new Cat("Butch", 9),
                        new Dog("Sharik", 25)
                };

        Plate plate = new Plate(10);
        FoodBag foodBag = new FoodBag();

        feedTheAnimals(animals, plate, foodBag);

    }

    public static void feedTheAnimals(Animal[] animals, Plate p, FoodBag f) {
        boolean isFedUp;
        for (int i = 0; i < animals.length; i++) {
            p.info();
            isFedUp = animals[i].eat(p);
            System.out.println(isFedUp);
            if (!isFedUp) {
                p.addFood(f);
                isFedUp = animals[i].eat(p);
                System.out.println(isFedUp);
            }
            ;

            f.foodBagInfo();
            System.out.println();
        }
    }
}
