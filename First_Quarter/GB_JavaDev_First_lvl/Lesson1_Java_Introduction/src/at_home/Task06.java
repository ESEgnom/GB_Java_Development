/**
 * Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
 * отрицательное, и вернуть false если положительное.
 */

package ru.geekbrains;

public class Task06 {
    public static void main(String[] args) {
        int number = -2;
        System.out.println(isPositive(number));
    }

    static boolean isPositive(int num){
        if(num > 0 || num == 0) return true;
        return false;
    }
}
