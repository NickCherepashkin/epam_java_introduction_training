import java.util.Scanner;

// Заданы размеры A, B прямоугольного отверстия и размеры x, y, z кирпича.
// Определить, пройдет ли кирпич через отверстие.
public class Task_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A, B: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();

        System.out.println("Enter x, y, z: ");
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z = scan.nextDouble();

        scan.close();

        if((x < a && y < b) || (x < b && y < a) || (x < b && z < a) || (z < b && x < a) || (y < b && z < a) || (z < b && y < a)) {
            System.out.println("Will pass");
        } else {
            System.out.println("Won't pass");
        }

    }
}
