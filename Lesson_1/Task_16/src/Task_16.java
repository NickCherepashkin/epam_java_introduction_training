import java.util.Scanner;

// Даны числовой ряд и некоторое число e. Найти сумму тех членов ряда, модуль которых больше или равен заданному e
// Общий член ряда имеет вид: an=(1/2^n)+1/3^n

public class Task_16 {
    public static void main(String[] args) {
        double a;
        double sum = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter n: ");
        while (!scan.hasNextDouble()) {
            scan.next();
            System.out.println("Entered wrong value. Try again.");
        }
        double n = scan.nextDouble();

        System.out.println("Enter e: ");
        while (!scan.hasNextDouble()) {
            scan.next();
            System.out.println("Entered wrong value. Try again.");
        }
        double e = scan.nextDouble();

        scan.close();
        for (int index = 0; index < n; index++) {
            a = 1 / Math.pow(2, index) + 1 / Math.pow(3, index);
            if (Math.abs(a) >= e) {
                sum += a;
            }
        }
        System.out.println("sum = " + sum);
    }
}
