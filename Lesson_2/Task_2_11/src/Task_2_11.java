import java.util.Random;

// Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
public class Task_2_11 {
    public static void main(String[] args) {
        int [][] matrix = createMatrix();
        printOdDColumns(matrix);
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

    public static void printOdDColumns(int [][] matrix) {

        System.out.println("len = " + matrix[0].length);

        // столбец с нечетным индексом
        for (int i = 1; i < matrix[0].length; i += 2) {
            int last = matrix.length - 1;
            if (matrix[0][i] > matrix[last][i]) {
                for (int j = 0; j <= last; j++) {
                    System.out.println(matrix[j][i]);
                }
                System.out.println();
            }
        }
    }
}
