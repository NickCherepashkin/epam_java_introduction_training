import java.util.Scanner;

// Вычислить значение выражения по формуле (все переменные принимают действительные значения)
// ((sin x + cos y) / (cos x - sin y)) * tg xy
public class Task_3 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите x: ");
        double x = scan.nextDouble();

        System.out.print("Введите y: ");
        double y = scan.nextDouble();

        scan.close();

        double result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println("result = " + result);
    }
}
