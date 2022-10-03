//Создать переменные всех пройденных типов данных и инициализировать их значения.

package ru.geekbrains;

public class Task02 {

    public static void main(String[] args) {
        byte byteVar = 1;           //8-битное знаковое целое число, от -128 до 127
        short shortVar = 2;         //16-битное знаковое целое число, от -32768 до 32767
        int intVar = 3;             //32-битное знаковое целое число, от -2147483648 до 2147483647
        long longVar = 4l;          //64-битное знаковое целое число, от -9223372036854775808 до 9223372036854775807
        float floatVar = 5.1f;      //32-битное знаковое число с плавающей запятой одинарной точности
        double doubleVar = 6.1;     //64-битное знаковое число с плавающей запятой двойной точности
        char charVar = '*';         //16-битный тип данных, предназначенный для хранения символов в кодировке Unicode
                                    //от '\u0000' или 0 до '\uffff' или 65,535
        boolean booleanVar = true;  //логический тип данных false, true

        System.out.println(byteVar);
        System.out.println(shortVar);
        System.out.println(intVar);
        System.out.println(longVar);
        System.out.println(floatVar);
        System.out.println(doubleVar);
        System.out.println(charVar);
        System.out.println(booleanVar);

    }
}
