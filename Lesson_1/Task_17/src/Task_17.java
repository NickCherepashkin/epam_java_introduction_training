// Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера
public class Task_17 {
    public static void main(String[] args) {
        int code = 0;

        System.out.println("==============");
        System.out.printf("%-4s|%6s\n", "  № ", " symbol");
        System.out.println("==============");

        while (code < 256) {
            System.out.printf("%-4d|%4c\n", code, (char)code);
            code++;
        }
    }
}
