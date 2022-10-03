/**
 * Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
 * С помощью цикла и условия заменить 0 на 1, 1 на 0;
 */

package at_home;

public class Task01 {

    public static void main(String[] args) {

        int[] myArray =  {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        drawArray(myArray);
        drawArray(invertElementsArray(myArray));
    }

    public static int[] invertElementsArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0) array[i] = 1;
            else if(array[i] == 1) array[i] = 0;
        }
        return array;
    }

    public static void drawArray(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.print("]");
        System.out.println();
    }
}
