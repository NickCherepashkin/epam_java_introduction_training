import java.util.Scanner;

// Дана последовательность действительных чисел а1, а2, ..., an. Заменить все ее члены,
// большие данного Z, этим числом. Подсчитать количество замен.
public class Task_2_2 {
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

        System.out.println("Enter Z: ");
        while (!scan.hasNextDouble()) {
            scan.next();
            System.out.println("Entered wrong double value. Try again.");
        }

        double z = scan.nextDouble();

        count(massive, z);

    }

    public static void count (double [] massive, double z) {
        int count = 0;
        for (int index = 0; index < massive.length; index++) {
            if(massive[index] > z) {
                massive[index] = z;
                count++;
            }
        }
        System.out.println("Number of replacements: " + count);
    }
}
