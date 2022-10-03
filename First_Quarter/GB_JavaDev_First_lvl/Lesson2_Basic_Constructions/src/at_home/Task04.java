/**
 * Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
 */

package at_home;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int columns = scn.nextInt();
        int[][] myArray = new int[rows][columns];

        doTask04(myArray);
        printArray(myArray);
    }

    public static int[][] doTask04(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array[i].length - 1 - i] = 1;
        }
        return array;
    }

    public static void printArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
