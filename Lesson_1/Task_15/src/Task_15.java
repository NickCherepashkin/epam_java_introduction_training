// Составить программу нахождения произведения квадратов первых двухсот чисел
public class Task_15 {
    public static void main(String[] args) {
        int number = 1;
        long sum = 1;
        while (number <= 200) {
            sum *= Math.pow(number, 2);
            number++;
        }
        System.out.println(sum);
    }
}
