package at_home;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Мурзик"),
                new Dog("Шарик"),
                new Dog("Бобик"),
                new Cat("Тишка")
        };
        countAnimals(animals);
        printInfo(animals, 50, 12);
    }

    public static void countAnimals(Animal[] animalList){
        System.out.printf("Всего количество животных: %s%n", Animal.getCount());
        System.out.printf("Всего количество собак: %s%n", Dog.getCount());
        System.out.printf("Всего количество кошек: %s%n", Cat.getCount());
    }

    public static void printInfo(Animal[] animalList, int runDistance, int swimDistance){
        for (int i = 0; i < animalList.length; i++) {
            animalList[i].run(runDistance);
            animalList[i].swim(swimDistance);
        }
    }
}
