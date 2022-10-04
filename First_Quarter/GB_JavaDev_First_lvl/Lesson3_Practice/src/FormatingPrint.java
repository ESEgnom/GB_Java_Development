import java.util.Scanner;

public class FormatingPrint {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] digitArray = ScannerAndRandom.createArray(5);
        ScannerAndRandom.fillArrayRandomValuesWithMathRandom(digitArray, -5, 5);

        System.out.println();
        System.out.println("Просто печатаем в консоль массив ");
        ScannerAndRandom.drawArray(digitArray);

        System.out.println();
        System.out.println("Печатаем в консоль массив с помощью форматированной печати");
        drawOneDimensionalArrayWithFormatPrint(digitArray );
        doFirmattingDemo();
        System.out.println(doFirmattingDemo("Алеша"));

    }

    public static void drawOneDimensionalArrayWithFormatPrint(int[] array){
        String message = "[%s] => %s%n";
        for (int i = 0; i < array.length; i++) {
            System.out.printf(message, i, array[i]);
        }
        System.out.println();
    }

    static String doFirmattingDemo(String name){
        /**
         * String.format() работает точно так же как System.out.printf,
         * но возвращает форматированную строку
         */
        String template = "Привет, мир. Меня зовут %s";
        return String.format(template, name);
    }

    static void doFirmattingDemo(){
        int a = 14;
        float b = 16.156898983548f;
        System.out.printf("value: %s%n", a);   // %s - string - выводит любое значение как строку, %n - перенос
        System.out.printf("value: %d%n", a);   // %d - digit - выводит только цифры, %n - перенос
        System.out.printf("value: %f%n", b);   // %f - float - выводит только float как есть, %n - перенос
        System.out.printf("value: %.3f%n", b); // %.3f - округлит число до 3го знака после запятой, %n - перенос
    }


}
