import java.util.Scanner;

// Вычислить значение выражения по формуле (все переменные принимают действительные значения)
// (b+√(b^2+4ac))/2a-(a^3)*c+b^(-2)
public class Task_2 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите a: ");
        double a = scan.nextDouble();

        System.out.print("Введите b: ");
        double b = scan.nextDouble();

        System.out.print("Введите c: ");
        double c = scan.nextDouble();

        scan.close();

        double result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println(" result = " + result);
    }
}
