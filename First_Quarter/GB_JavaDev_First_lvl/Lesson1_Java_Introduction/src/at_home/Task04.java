/**
 * Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
 * (включительно), если да – вернуть true, в противном случае – false.
 */

package ru.geekbrains;

public class Task04 {
    public static void main(String[] args) {
        int numberA = 2;
        int numberB = 36;
        int numberC = 5;
        int numberD = 6;

        System.out.println(checkInRange(numberA, numberB));
        System.out.println(checkInRange(numberC, numberD));
    }
    static boolean checkInRange(int num1, int num2){
        if (num1 + num2 >= 10 && num1 + num2 <= 20) return true;
        return false;
    }
}
