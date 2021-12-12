import java.util.Scanner;

// Дан массив действительных чисел, размерносить которого N. Подсчитать,
// сколько в нем отрицательных, положительных и нулевых элементов.
public class Task_2_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n: ");

        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Entered wrong integer value. Try again.");
        }
        int n = scan.nextInt();

        double [] massive = new double[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            while (!scan.hasNextDouble()) {
                scan.next();
                System.out.println("Entered wrong double value. Try again.");
            }

            massive[i] = scan.nextDouble();
        }

        count(massive);
    }

    public static void count(double [] massive) {
        int negative = 0;
        int positive = 0;
        int zero = 0;
        for (int index = 0; index < massive.length; index++) {
            if (massive[index] < 0) {
                negative++;
            } else if (massive[index] > 0) {
                positive++;
            } else {
                zero++;
            }
        }

        System.out.println("Number of negative elements: " + negative);
        System.out.println("Number of positive elements: " + positive);
        System.out.println("Number of zero elements: " + zero);
    }
}
