import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Human maks = new Human();
        maks.setName("Maks");
        maks.setId(1);

        Human kolya = new Human(getHumanId(), "Kolyan");
        System.out.printf("_____________%n|ID|Name|%n-------------%n|%s  |%s|%n_____________", kolya.getId(), kolya.getName());

        maks.move();
        kolya.move();
    }

    static int getHumanId(){
        Random random = new Random();
        return random.nextInt(1, 1000);
    }


}
