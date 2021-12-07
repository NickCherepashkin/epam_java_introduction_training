import java.util.Scanner;

// Найти max{min(a,b), min(c,d)}
public class Task_8 {
    public static void main (String [] args) {
        double max;
        double min_1;
        double min_2;
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter a, b, c, d: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d = scan.nextDouble();

        if (a <= b) {
            min_1 = a;
        } else {
            min_1 = b;
        }
        if(c <= d) {
            min_2 = c;
        } else {
            min_2 = d;
        }
        max = Math.max(min_1, min_2);
        System.out.println("max number = " + max);
    }
}
