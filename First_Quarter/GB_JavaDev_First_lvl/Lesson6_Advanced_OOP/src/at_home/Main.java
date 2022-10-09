package at_home;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Мурзик"),
                new Dog("Шарик"),
                new Dog("Бобик"),
                new Cat("Тишка")
        };
        System.out.printf("Всего животнызх учавствовало в соревнованиях: %s%n", countAnimals(animals));
        printInfo(animals, 50, 12);
    }

    public static int countAnimals(Animal[] animalList){
        int count = 0;
        for (int i = 0; i < animalList.length; i++) {
            count++;
        }
        return count;
    }

    public static void printInfo(Animal[] animalList, int runDistance, int swimDistance){
        for (int i = 0; i < animalList.length; i++) {
            animalList[i].run(runDistance);
            animalList[i].swim(swimDistance);
        }
    }
}
