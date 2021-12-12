import java.util.Scanner;

// В массив A[N] занесены натуральные числа. Найти сумму тех элементов массива, которые кратны данному K
public class Task_2_1 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n: ");
        while(!scan.hasNextInt()) {
            scan.next();
            System.out.println("Entered wrong value. Try again.");
        }
        int n = scan.nextInt();

        int [] array = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("Entered wrong value. Try again.");
            }
            num = scan.nextInt();
            if (num < 1) {
                i--;
                System.out.println("Entered wrong value. Try again.");
            } else {
                array[i] = num;
            }
        }

        System.out.println("Enter k");
        while(!scan.hasNextInt()) {
            scan.next();
            System.out.println("Entered wrong value. Try again.");
        }
        int k = scan.nextInt();

        scan.close();

        for (int index = 0; index < n; index++) {
            if (array[index] % k == 0) {
                sum += array[index];
            }
        }

        System.out.println("sum = " + sum);
    }
}
