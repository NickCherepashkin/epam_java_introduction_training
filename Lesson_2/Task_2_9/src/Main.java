// В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
// Если таких чисел несколько, то определить наименьшее из них

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array's size: ");
        while (!scan.hasNextInt()) {
            System.out.println("Error value.");
            scan.next();
        }
        int n = scan.nextInt();

        int [] array = new int[n];

        System.out.print("Enter elements: ");

        for (int i = 0; i < n; i++) {
            while (!scan.hasNextInt()) {
                System.out.println("Error value.");
                scan.next();
            }
            array[i] = scan.nextInt();
        }


        System.out.println("result = " + foundElement(array));

    }

    public static int foundElement (int [] array) {
        int [] count = new int[array.length];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length; j++) {
                if (count[i] == 0 && i < j) {
                    count[i]++;
                }
                if(i < j) {
                    if (array[i] == array[j]) {
                        count[i]++;
                    }
                } else if(i > j) {
                    if (array[i] == array[j]) break;
                }
            }
        }

        int maxCount = count[0];
        int minNumber = array[0];
        for (int i = 1; i < count.length; i++) {
            if (count[i] > maxCount) {
                minNumber = array[i];
            } else if (count[i] == maxCount) {
                minNumber = Math.min(minNumber, array[i]);
            }
        }

        return minNumber;
    }
}
