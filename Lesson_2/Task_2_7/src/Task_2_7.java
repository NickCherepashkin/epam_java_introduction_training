// Даны действительные числа a1, a2, ..., an. Найти max(a1+a2n, a2+a2n-1, ..., an+an+1)

import java.util.Scanner;

public class Task_2_7 {
    public static void main(String[] args) {
        double [] array = enterArray();
        double maxSum = findMaxSum(array);
        System.out.println("Максимальная сумма: " + maxSum);
    }

    public static double [] enterArray (){
        System.out.print("Введите размер массива: ");
        int size = (int) enterNumber();

        double [] array = new double[size];

        System.out.println("Введите элементы последовательности:");
        for (int index = 0; index < size; index++) {
            array[index] = enterNumber();
        }

        return array;
    }

    public static double enterNumber() {
        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextDouble()) {
            scan.next();
            System.out.println("Введено некорректное значение!");
        }

        return scan.nextDouble();
    }

    public static double findMaxSum(double[] array) {
        double maxSum = array[0] + array[array.length - 1];
        double sum;
        for (int index = 1; index < array.length / 2; index++) {
            sum = array[index] + array[array.length - index -1];
            if(sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }
}
