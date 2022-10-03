/**
 * Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
 */
package at_home;

public class Task02 {

    public static void main(String[] args) {
        int[] myArray = new int[8];

        drawArray(fillArray(myArray));
    }

    public static int[] fillArray(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = count;
            count += 3;
        }
        return array;
    }

    public static void drawArray(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.print("]");
    }
}
