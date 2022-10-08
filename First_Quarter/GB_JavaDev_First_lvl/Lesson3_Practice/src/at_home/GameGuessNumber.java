import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        playGame();
    }
	
	static void playGame(){
		Scanner scanner = new Scanner(System.in);
        do{
            int number = 1; //(int)(Math.random() * 10);
            for (int i = 0; i < 3; i++) {

                System.out.println("Введите число от 0 до 9");
                int answer = scanner.nextInt();

                if (answer != number) {
                    System.out.print("Введенное число " + ((answer < number) ? "меньше " : "больше "));
                    
                }else{
                    System.out.println("Вы " + (answer == number ? "угадали!!!":"не угадали." ) );
                    break;
                }
            }

            System.out.println("Повторить? ДА - 1 , НЕТ - 0");
        }while (scanner.nextInt() == 1);
	}
}
