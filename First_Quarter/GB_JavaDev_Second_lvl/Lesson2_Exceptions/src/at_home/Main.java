package at_home;

public class Main {
    public static void main(String[] args) {
        String[][] myArray = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},


        };
        System.out.println(sumArrayElements(myArray));
    }

    static int sumArrayElements(String[][] array){
       int sum = 0;
        if (array.length != 4) {
            throw new MyArraySizeException("Размер массива отличается от размера 4х4");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException("Данные не соответствуют заданному формату в ячейке с " +
                            "координатами: (" + i + "," + j + ")\n", e);
                }
            }
        }
        return sum;
    }
}
