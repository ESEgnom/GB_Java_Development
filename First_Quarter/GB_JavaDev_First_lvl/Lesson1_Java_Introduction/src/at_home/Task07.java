/**
 * Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль
 * сообщение «Привет, указанное_имя!».
 */

package ru.geekbrains;

public class Task07 {
    public static void main(String[] args) {

        String userName = "Алёша";
        hello(userName);
    }

    static void hello(String name){
        System.out.println("Привет, "+ name+ "!");
    }
}
