import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_12 {
    public static void main(String[] args) throws IOException {
        int sum = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a positive number: ");
        int number = Integer.parseInt(reader.readLine());
        for(int index = 1; index <= number; index++){
            sum += index;
        }
        System.out.println("Summ = " + sum);
    }
}
