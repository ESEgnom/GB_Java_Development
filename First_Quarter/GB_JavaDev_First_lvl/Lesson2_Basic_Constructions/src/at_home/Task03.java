/**
 * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 */

package at_home;

public class Task03 {
    public static void main(String[] args) {
        int[] myArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        drawArray(myArray);

        drawArray(multiplyByTwoLessThanSix(myArray));
    }

    public static void drawArray(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ ",");
        }
        System.out.print("]");
        System.out.println();
    }

    public static int[] multiplyByTwoLessThanSix(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) array[i] *= 2;
        }
        return array;
    }
}
