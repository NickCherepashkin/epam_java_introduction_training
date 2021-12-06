import java.util.Scanner;

// Дано натуральное число T, которое представляет длительность прошедшего времени в секундах. Вывести данное
// значение длительности в часах, минутах и секундах в следующей форме: HHч MMмин SSс.
public class Task_5 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество секунд: ");
        int t = scan.nextInt();
        int hour = t / 3600;
        int min = t % 3600 / 60;
        int sec = t - hour * 3600 - min * 60;

        System.out.println(hour + "ч " + min + "мин " + sec + "с.");
    }
}
