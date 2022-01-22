// Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент
// (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.

import java.util.Scanner;


public class Task_2_10 {
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

        compress(array);

        System.out.println();

        for (int element: array) {
            System.out.println(element);
        }
    }

    public static void compress(int [] array) {
        int item = 1;
        int compressCount = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
        for( int i = 2; i < array.length; i++) {
            if(i % 2 == 0 & item <= compressCount) {
                array[item] = array[i];
                item++;
            }
            if (i == array.length - 1 & item == compressCount){
                i = compressCount;
                item = compressCount + 1;
            }
            if (item > compressCount) {
                array[i] = 0;
                item++;
            }
        }
    }
}