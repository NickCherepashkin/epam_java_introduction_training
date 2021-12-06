import java.util.Scanner;

// Для дданной области составить линейную программу, которая печатает true,
// если точка с координатами (x, y) принадлежит закрашенной области, и false
// - в противном случае.
public class Task_6 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите координаты (x, y): ");
        int x = scan.nextInt();
        int y = scan.nextInt();

        scan.close();
        boolean result;
        result = ((y > 0 && y <= 4 && x >= -2 && x <= 2) || (y <= 0 && y >= -3 && x >= -4 && x <= 4));
        System.out.println("" + result);
    }
}
