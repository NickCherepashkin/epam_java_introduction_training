public class Student {
    private String fio;
    private int groupNumber;
    private int [] marks;

    public Student(String initFio, int initGroupNumber, int [] initMarks) {
        fio = initFio;
        groupNumber = initGroupNumber;
        marks = initMarks;
    }

    public boolean checkHighMarks() {
        for(int i = 0; i < marks.length; i++) {
            if(marks[i] < 9) {
                return false;
            }
        }
        printInfo();
        return true;
    }

    public void printInfo() {
        System.out.println("ФИО: " + fio);
        System.out.println("группа: " + groupNumber + "\n");
    }
}
