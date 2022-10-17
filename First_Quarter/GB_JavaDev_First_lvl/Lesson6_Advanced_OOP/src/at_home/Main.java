package at_home;

public class Main {
    public static void main(String[] args) {

        AnimalGroup groupOne = new AnimalGroup();

        groupOne.add(
                new Cat("Мурзик"),
                new Dog("Шарик"),
                new Dog("Бобик"),
                new Cat("Тишка")
        );

        for (int i = 0; i < groupOne.getAnimals().length; i++) {
            System.out.println(groupOne.getAnimals()[i].toString());
            groupOne.getAnimals()[i].run(160);
            groupOne.getAnimals()[i].swim(20);
        }
        System.out.println(groupOne.getAnimalCount());
    }
}
