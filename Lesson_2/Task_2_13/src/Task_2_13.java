// Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

import java.util.Random;

public class Task_2_13 {
    public static void main(String[] args) {
        int [][] matrix = createMatrix();

        Random random = new Random();
        int row = random.nextInt(matrix.length);
        int column = random.nextInt(matrix[0].length);

        printRowAndColumn(matrix, row, column);
    }

    public static int [][] createMatrix() {
        Random random = new Random();
        // n и m в диапазоне от 2 до 10
        int n = random.nextInt(9) + 2;
        int m = random.nextInt(9) + 2;

        int matrix[][] = new int[n][m];

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = random.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    public static void printRowAndColumn(int [][] matrix, int row, int column) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == row || j == column) {
                    System.out.print(matrix[i][j] + " ");
                } else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
