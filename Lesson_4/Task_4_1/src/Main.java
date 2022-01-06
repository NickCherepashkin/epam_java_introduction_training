
// Создайте класс Test1 двумя переменными.
// Добавьте метод вывода на экран и методы изменения этих переменных.
// Добавьте метод, который находит сумму значений этих переменных,
// и метод, который находит наибольшее значение из этих двух переменных.

public class Main {
    public static void main(String[] args) {
        Test1 test = new Test1();
        test.printScreen();

        test.setNumOne(8);
        test.setNumSecond(3);
        test.printScreen();
        System.out.println("Сумма: " + test.summ());
        System.out.println("Max: " + test.max());
    }
}
