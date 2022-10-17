//Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат, где a, b, c, d – аргументы этого
// метода, имеющие тип float.

package ru.geekbrains;

public class Task03 {
    public static void main(String[] args) {
        float a = 2.0f;
        float b = 3.0f;
        float c = 4.0f;
        float d = 5.0f;

        System.out.println(calculate(a, b, c, d));
    }

    public static float calculate(float num, float num2, float num3, float num4) {
        return num * (num2 + (num3 / num4));
    }
}
