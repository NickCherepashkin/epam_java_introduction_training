// Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
// Создайте массив из десяти элементов такого типа.
// Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные 9 или 10.

public class Main {
    public static void main(String[] args) {
        int [] marks1 = {8, 7, 10, 9, 5};
        int [] marks2 = {8, 8, 10, 9, 5};
        int [] marks3 = {8, 7, 2, 9, 5};
        int [] marks4 = {8, 7, 10, 9, 5};
        int [] marks5 = {9, 9, 10, 9, 9};
        int [] marks6 = {8, 8, 8, 9, 9};
        int [] marks7 = {10, 10, 10, 10, 10};
        int [] marks8 = {8, 7, 10, 9, 5};
        int [] marks9 = {9, 9, 10, 9, 10};
        int [] marks10 = {8, 7, 6, 9, 5};
        Student[] studentList = new Student[10];
        studentList[0] = new Student("Кузнецов Р.Л.", 5, marks1);
        studentList[1] = new Student("Петров Р.Л.", 2, marks2);
        studentList[2] = new Student("Сидоров Р.Л.", 4, marks3);
        studentList[3] = new Student("Пупкин Р.Л.", 1, marks4);
        studentList[4] = new Student("Иванов Р.Л.", 3, marks5);
        studentList[5] = new Student("Сомов Р.Л.", 4, marks6);
        studentList[6] = new Student("Борисов Р.Л.", 1, marks7);
        studentList[7] = new Student("Ивашко Р.Л.", 1, marks8);
        studentList[8] = new Student("Лосев Р.Л.", 3, marks9);
        studentList[9] = new Student("Туров Р.Л.", 2, marks10);

        findStudents(studentList);
    }

    public static void findStudents(Student [] list) {
        for (int index = 0; index < list.length; index++){
            list[index].checkHighMarks();
        }
    }
}
