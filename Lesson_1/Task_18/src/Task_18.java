import java.util.Scanner;

// Для каждого натурального числа в промежутке от m до n вывести все делители,
// кроме единицы и самого числа. m и n вводятся с клавиатуры
public class Task_18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter m: ");
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Entered wrong value. Try again.");
        }

        int m = scan.nextInt();

        System.out.println("Enter n: ");
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Entered wrong value. Try again.");
        }

        int n = scan.nextInt();

        for (int num = m; num <= n; num++) {
            System.out.print("number = " + num + ", dividers: ");
            for (int divider = 2; divider < num; divider++) {
                if ((num % divider == 0) ) {
                    System.out.print(" " + divider);
                }
            }
            System.out.println();
        }
    }
}
