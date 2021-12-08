import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_13 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a, b and step h: ");
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int h = Integer.parseInt(reader.readLine());

        for(int index = a; index <= b; index += h) {
            if (index > 2) {
                System.out.println("y = " + index);
            } else {
                System.out.println("y = " + -index);
            }
        }
    }
}
