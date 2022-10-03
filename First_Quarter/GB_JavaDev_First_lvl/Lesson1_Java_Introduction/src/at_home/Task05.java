/**
 * Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
 * положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
 */

package ru.geekbrains;

public class Task05 {
    public static void main(String[] args) {
        int number = -2;
        isPositive(number);
    }
    static void isPositive(int num){
        if(num > 0 || num == 0) System.out.println("Число "+ num+ " положительное");
        else System.out.println("Число "+ num+ " отрицательное");
    }
}
