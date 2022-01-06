// Дана последовательность целых чисел a1, a2, ..., an. Образовать новую последоватеьность, выбросив из исходной
// те члены, которые равны min(a1, a2, ..., an)

import java.util.Scanner;

public class Task_2_8 {
    public static void main(String[] args) {
        int[] array = enterArray();
        array = delMin(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int [] enterArray (){
        System.out.print("Введите размер массива: ");
        int size = enterNumber();

        int [] array = new int[size];

        System.out.println("Введите элементы последовательности:");
        for (int index = 0; index < size; index++) {
            array[index] = enterNumber();
        }

        return array;
    }

    public static int enterNumber() {
        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Введено некорректное значение!");
        }

        return scan.nextInt();
    }

    public static int findMin(int [] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int [] delMin(int [] array) {
        int min = findMin(array);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min)
                count++;
        }
        int [] newArray = new int[array.length - count];
        count = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] > min) {
                newArray[count] = array[index];
                count++;
            }
        }

        return newArray;
    }

}
