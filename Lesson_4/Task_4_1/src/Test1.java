public class Test1 {
    private int numOne;
    private int numSecond;

    public Test1() {
        numOne = 5;
        numSecond = 9;
    }

    public void printScreen() {
        System.out.println("Переменная 1: " + numOne);
        System.out.println("Переменная 2: " + numSecond);
    }

    public void setNumOne (int initNumOne) {
        numOne = initNumOne;
    }

    public void setNumSecond (int initNumSecond) {
        numSecond = initNumSecond;
    }

    public int summ() {
        return (numOne + numSecond);
    }

    public int max() {
        if (numOne > numSecond) {
            return numOne;
        } else {
            return numSecond;
        }
    }
}
