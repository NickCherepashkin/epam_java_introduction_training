// Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

import java.util.Random;

public class Task_2_12 {
    public static void main(String[] args) {
        int [][] matrix = createMatrix();
        System.out.println("Print diagonals:");
        printDiagonal(matrix);
    }

    public static int [][] createMatrix() {
        Random random = new Random();
        // n в диапазоне от 2 до 10
        int n = random.nextInt(9) + 2;

        int matrix[][] = new int[n][n];

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    public static void printDiagonal(int [][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if ((i == j) || (i + j == matrix.length - 1)){
                    System.out.print(matrix[i][j] + " ");
                } else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
