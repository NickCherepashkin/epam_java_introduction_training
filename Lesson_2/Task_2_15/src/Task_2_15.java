// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//	1	1	1	.	1
//	2	2	2	.	0
//	3	3	3	.	0
//	4	4	4	.	0
//	.	.	.	.	.
//	.	.	.	.	.
//	n-1	n-1	0	.   0
//	n	0	0	.	0

import java.util.Random;

public class Task_2_15 {
    public static void main(String[] args) {
        createMatrix();
    }

    public static void createMatrix() {
        Random random = new Random();
        // n и m в диапазоне от 2 до 10 и четное
        int n;
        do {
            n = random.nextInt(9) + 2;
        }
        while (n % 2 != 0);

        int matrix[][] = new int[n][n];

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= n - i) {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = i + 1;
                }

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
