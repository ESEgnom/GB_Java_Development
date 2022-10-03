public class Arrays {
    public static void main(String[] args) {
        System.out.println("One-dimensional Array:");
        drawArray(returnMultipleValues());
        System.out.println();
        System.out.println("Multidimensional Array:");
        drawMultidimensionalArray(returnMultidimensionalArray());


    }

    public static int[] returnMultipleValues(){
        int[] values = new int[5];
        values[0] = 123;
        values[1] = -1;
        values[2] = 80;
        values[3] = 354686;
        values[4] = -68686;

        return values;
    }

    public static int[][] returnMultidimensionalArray(){
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        return array;
    }

    public static void drawArray(int[] array){
        System.out.println("size: "+ array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.println("["+ i+ "] => "+ array[i]+ "; ");
        }
        System.out.println();
    }

    public static void drawMultidimensionalArray(int[][] array){
        System.out.println("size: "+ array.length);
        System.out.println("Container size: "+ array[0].length);
        for (int i = 0; i < array.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.print("}");
            System.out.println();
        }
    }

}
