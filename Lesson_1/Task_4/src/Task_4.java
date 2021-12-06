import java.util.Locale;
import java.util.Scanner;

// Дано действительное число R вида nnn.ddd (три цифровых разряда
// в дробной и целой частях). Поменять местами дробную и целую части
// числа и вывести полученное значение числа.
public class Task_4 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Введите R: ");
        double r = scan.nextDouble();

        scan.close();

        String [] massRPart = String.valueOf(r).split("\\.");
        System.out.println("result = " + massRPart[1] + "." + massRPart[0]);
    }
}
