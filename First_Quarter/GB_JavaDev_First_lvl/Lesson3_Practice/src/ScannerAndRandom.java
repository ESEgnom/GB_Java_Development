import java.util.Random;
import java.util.Scanner;

public class ScannerAndRandom {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Создаем пустой массив с вводом количества индексов в консоль");
        int[] digitArray = createArray(5);
        drawArray(digitArray);

        System.out.println();

        System.out.println("Заполняем массив псевдослучайными числами при помощи класса Random");
        int[] digitArrayForRandom = createArray(5);
        fillArrayRandomValuesWithRandom(digitArrayForRandom,5, 5);
        drawArray(digitArrayForRandom);

        System.out.println();

        System.out.println("Заполняем массив псевдослучайными числами при помощи статического класса Math.random()");
        int[] digitArrayForMathRandom = createArray(5);
        fillArrayRandomValuesWithMathRandom(digitArrayForMathRandom, -5, 5);
        drawArray(digitArrayForMathRandom);
    }

    public static int[] createArray(int size){
        System.out.println("Size: "+ size);
        int[] array = new int[size];
        return array;
    }

    public static int[][] createArray(int row, int columns){
        System.out.printf("rows: %s;%n columns %S", row, columns);
        int[][] array = new int[row][columns];
        return array;
    }

    public static void fillArrayRandomValuesWithRandom(int[] array, int min, int max){
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(min, max);
        }
    }

    public static void fillArrayRandomValuesWithMathRandom(int[] array, int min, int max){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * (max - min) - min);
        }
    }

    public static void drawArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void drawArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
