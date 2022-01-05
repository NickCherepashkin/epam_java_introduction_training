
// Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
// являются простыми числами.

import java.util.Scanner;

public class Task_2_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер последовательности: ");
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Введено некорректное значение.");
        }
        int size = scan.nextInt();
        double [] mass = new double[size];
        int count = 0;

        System.out.println("Введите элементы последовательности");

        while (count < size) {
            while (!scan.hasNextDouble()) {
                scan.next();
                System.out.println("Введено некорректное значение.");
            }
            mass[count] = scan.nextDouble();
            count++;
        }

        calcSum(mass);
    }

    public static void calcSum(double [] mass) {
        double sum = 0;
        for (int index = 0; index < mass.length; index++) {
            if (isPrime(index + 1)) {
                sum += mass[index];
            }
        }

        System.out.println("Сумма равна: " + sum);
    }

    public static boolean isPrime(int number) {
        int temp;
        for (int i = 2; i <= number/2; i++) {
            temp = number % i;
            if(temp == 0) {
                return false;
            }
        }

        return true;
    }

}
