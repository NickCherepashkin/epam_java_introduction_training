import java.io.BufferedReader;
import java.io.InputStreamReader;

// Найти сумму квадратов первых ста чисел
public class Task_14 {
    public static void main(String[] args){
        long number = 1;
        long sum = 0;
        while (number <= 100) {
            sum += Math.pow(number, 2);
            number++;
        }
        System.out.println(sum);
    }
}
