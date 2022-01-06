public class Test2 {
    private int numOne;
    private int numSecond;

    public Test2(int numOne, int numSecond) {
        this.numOne = numOne;
        this.numSecond = numSecond;
    }

    public Test2() {
        this.numOne = 0;
        this.numSecond = 0;
    }

    public int getNumOne() {
        return numOne;
    }

    public void setNumOne(int numOne) {
        this.numOne = numOne;
    }

    public int getNumSecond() {
        return numSecond;
    }

    public void setNumSecond(int numSecond) {
        this.numSecond = numSecond;
    }
}
