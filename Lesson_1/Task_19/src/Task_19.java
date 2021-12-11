import java.util.Scanner;

// Даны 2 числа. Определить цифры, входящие в запись как первого, так и второго числа
public class Task_19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int [] array = new int[10]; // 10 цифр максимум, по умолчанию инициализируется 0-ми

        while (num1 != 0) {
            array[num1 % 10]++;
            num1 /= 10;
        }

        while (num2 != 0) {
            if (array[num2 % 10] > 0) {
                System.out.println(num2 % 10);
            }
            num2 /= 10;
        }
    }
}
