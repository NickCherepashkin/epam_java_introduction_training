import java.util.Scanner;

// Даны три точки A(x1, y1), B(x2, y2) и C(x3, y3).
// Оперделить, будут ли они расположены на одной прямой.
public class Task_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter x1, y1: ");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();

        System.out.println("Enter x2, y2: ");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();

        System.out.println("Enter x3, y3: ");
        double x3 = scan.nextDouble();
        double y3 = scan.nextDouble();

        scan.close();

        if((x1 == x2 && x1 == x3) || (y1 == y2 && y1 == y3)) {
            System.out.println("Points belong to the same line.");
        } else if (((y3 - y1) / (y2 - y1)) == ((x3 - x1) / (x2 - x1))){
            System.out.println("Points belong to the same line");
        } else {
            System.out.println("Points don't belong to the same line.");
        }
    }
}
