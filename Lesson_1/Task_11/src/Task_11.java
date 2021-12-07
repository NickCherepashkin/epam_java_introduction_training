import java.util.Scanner;
import static java.lang.Math.pow;

// Вычислить значение функции:
// F(x) = x^2 - 3x + 9, если x <= 3;
// F(x) = 1 / (x^3 +6), если x > 3;
public class Task_11 {
    public static void main(String[] args) {
        double f;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x: ");
        double x = scan.nextDouble();
        scan.close();

        if(x <= 3) {
            f = pow(x, 2) - 3 * x + 9;
        } else {
            f = 1 / (pow(x, 3) + 6);
        }
        System.out.println("F(x) = " + f);
    }
}
