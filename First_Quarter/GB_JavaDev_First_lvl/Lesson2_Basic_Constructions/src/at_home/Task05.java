/**
 * Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
 */

package at_home;

import java.util.Random;

public class Task05 {
    public static void main(String[] args) {
        int[] myArray = fillArray();
        printArray(myArray);
        System.out.println(findMin(myArray));
        System.out.println(findMax(myArray));
    }

    public static int[] fillArray() {
        Random rnd = new Random();
        int range = rnd.nextInt(((10 - 0) + 1) + 0);
        int[] array = new int[range];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(((100 - 0) + 1) + 0);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static int findMin(int[] array){
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }
}
