import java.util.Scanner;

// Даны целые числа a1, a2, ..., an. Вывести на печать только те числа, для которых ai > i.
public class Task_2_5 {

    public static void main(String[] s) {
        inputMass();
    }

    public static void inputMass() {
        Scanner scan = new Scanner(System.in);
        int size;
        System.out.println("Enter size of array: ");

        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Entered wrong value.");
        }
        size = scan.nextInt();

        int [] mass  = new int[size];

        System.out.println("Enter elements: ");
        int index = 0;
        while (index < size) {
            while(!scan.hasNextInt()) {
                scan.next();
                System.out.println("Entered wrong value.");
            }
            mass[index] = scan.nextInt();
            index++;
        }

        scan.close();

        outputMass(mass);
    }

    public static void outputMass(int [] mass) {
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > i) {
                System.out.println(mass[i]);
            }
        }
    }
}
