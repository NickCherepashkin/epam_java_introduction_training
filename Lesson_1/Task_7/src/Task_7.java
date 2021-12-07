import java.util.Scanner;

// Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
// и если да, то будет ли он прямоугольным.
public class Task_7 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значения двух углов треугольника: ");

        int alpha = scan.nextInt();
        int beta = scan.nextInt();

        scan.close();
        int gamma = 180 - alpha - beta;
        if(gamma > 0) {
            System.out.println("Треугольник существует.");
            if (alpha == 90 || beta == 90 || gamma == 90) {
                System.out.println("Треугольник прямоугольный");
            } else {
                System.out.println("Треугольник не является прямоугольным.");
            }
        } else {
            System.out.println("Треугольник не существует.");
        }
    }
}
