import java.util.Scanner;

// Даны действительные числа a1, a2, ..., an. Поменять местами наибольший и наименьший элементы
public class Task_2_4 {
    public static void main(String[] args) {
        double [] matrix = fillTheMatrix();
        changeMinMax(matrix);
        printMatrix(matrix);
    }

    public static double[] fillTheMatrix () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N: ");
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Entered wrong integer value. Try again.");
        }
        int n = scan.nextInt();

        double [] matrix = new double[n];

        System.out.println("Enter array elements: ");

        for (int i = 0; i < n; i++) {
            while (!scan.hasNextDouble()) {
                scan.next();
                System.out.println("Entered wrong double value. Try again.");
            }

            matrix[i] = scan.nextDouble();
        }

        return matrix;
    }

    public static void changeMinMax(double [] matrix) {
        int minIndex = 0;
        int maxIndex = 0;
        double min = matrix[0];
        double max = matrix[0] ;

        for (int index = 0; index < matrix.length; index++) {
            if (matrix[index] < min) {
                minIndex = index;
                min = matrix[index];
            }
            if (matrix[index] > max) {
                maxIndex = index;
                max = matrix[index];
            }
        }

        matrix[minIndex] = max;
        matrix[maxIndex] = min;
    }

    public static void printMatrix(double [] matrix){
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i] + " ");
        }
    }
}
