import java.util.Scanner;

// Найдите значение функции: z=((a-3)*b/2)+c
public class Task_1 {
    public static void main (String [] args) {
        double z = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите a: ");
        double a = scan.nextDouble();
        System.out.println("Введите b: ");
        double b = scan.nextDouble();
        System.out.println("Введите c: ");
        double c = scan.nextDouble();
        scan.close();

        z = ((a - 3) * b / 2) + c;

        System.out.println("z = " + z);
    }
}
