// Создайте класс Train, содержащий поля: название пункта назнаения, номер поезда, время отправления
// Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
// Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
// Добавьте возможность сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть
// упорядочены по времени отправления.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Train [] list = new Train[5];
        list[0] = new Train("Иваново", 4, "12:00");
        list[1] = new Train("Петрушино", 6, "11:30");
        list[2] = new Train("иваново", 2, "11:28");
        list[3] = new Train("Мартышкино", 7, "16:32");
        list[4] = new Train("иваНово", 8, "09:56");

        TrainsListController controller = new TrainsListController(list);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter train number: ");
        while (!scan.hasNextInt()) {
            System.out.println("Entered wrong value. Try again.");
            scan.next();
        }

        int number = scan.nextInt();
        controller.infoAboutTrain(number);

        controller.sortByStations();
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getTrainNumber() + " " + list[i].getStationTitle() + " " + list[i].getTimeStart());
        }
        System.out.println();

        controller.sortByNumberAsc();
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getTrainNumber() + " " + list[i].getStationTitle() + " " + list[i].getTimeStart());
        }
        System.out.println();

        controller.sortByNumberDesc();
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getTrainNumber() + " " + list[i].getStationTitle() + " " + list[i].getTimeStart());
        }
    }
}
