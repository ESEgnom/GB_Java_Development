import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        playGame();
    }

    static void playGame() {

        char[][] gameField = createField();
        drawField(gameField);
        while (true){
            if(!checkPlayerMove(gameField)) {
                return;
            }
            if(!checkCompMove(gameField)){
                return;
            }
        }
    }

    static char[][] createField() {
        char[][] matrix = new char[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = '_';
            }
        }
        return matrix;
    }

    static void drawField(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void doPlayerMove(char[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        do {
            x = checkCoordinateRange(matrix, scanner, 'X');
            y = checkCoordinateRange(matrix, scanner, 'Y');
        } while (isCellFree(matrix, x, y));

        matrix[x][y] = 'X';
    }

    static boolean checkPlayerMove(char[][] matrix){
        doPlayerMove(matrix);
        drawField(matrix);

        return isNextMoveAvailable(matrix, 'X', "You WIN!!!");
    }

    static void doCompMove(char[][] matrix) {
        Random random = new Random();
        int x, y;
        do {
            x = random.nextInt(matrix.length);
            y = random.nextInt(matrix.length);
        } while (isCellFree(matrix, x, y));

        matrix[x][y] = '0';
    }

    static boolean checkCompMove(char[][] matrix){
        doCompMove(matrix);
        drawField(matrix);

        return isNextMoveAvailable(matrix, '0', "You LOSE!!!");
    }

    static boolean isNextMoveAvailable(char[][] matrix, char sing, String winMessage){
        if(isDraw(matrix)){
            System.out.println("There is draw detected. FINISH!");
            return false;
        }
        if(isWin(matrix, sing)){
            System.out.println(winMessage);
            return false;
        }
        return true;
    }

    static int checkCoordinateRange(char[][] matrix, Scanner scanner,char coordName){
        int val;
        do {
            System.out.printf("Please input %s - coordinate in range [1-3]: ", coordName);
            val = scanner.nextInt() - 1;
        }while (val < 0 || val > matrix.length-1);
        return val;
    }

    static boolean isDraw(char[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == '_'){
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isWin(char[][] matrix, char sing){
        int count = 0;
        int count1 =0;
        int count2 =0;
        int count3 =0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == sing) {
                    count++;
                    if(count == matrix.length){
                        return true;
                    }
                }
            }
        }
        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix[j].length; i++) {
                if (matrix[i][j] == sing) {
                    count1++;
                    if(count == matrix.length){
                        return true;
                    }
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            if(matrix[i][i] == sing){
                count2++;
                if(count == matrix.length){
                    return true;
                }
            }
        }
        for (int i = matrix.length-1; i > 0; i--) {
            if(matrix[i][i] == sing){
                count3++;
                if(count == matrix.length){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean isCellFree(char[][] matrix, int x, int y){
        return matrix[x][y] != '_';
    }
}
