import java.util.Scanner;

public class TrainsListController {
    private Train[] list;

    public TrainsListController(Train[] list) {
        this.list = list;
    }

    public Train[] sortByNumberAsc() {
        Train train;
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i].getTrainNumber() > list[j].getTrainNumber()) {
                    train = list[i];
                    list[i] = list[j];
                    list[j] = train;
                }
            }
        }

        return list;
    }

    public Train[] sortByNumberDesc() {
        Train train;
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i].getTrainNumber() < list[j].getTrainNumber()) {
                    train = list[i];
                    list[i] = list[j];
                    list[j] = train;
                }
            }
        }

        return list;
    }

    public void infoAboutTrain (int number) {
        boolean isFound = false;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getTrainNumber() == number) {
                isFound = true;
                System.out.println("Station: " + list[i].getStationTitle());
                System.out.println("Time start: " + list[i].getTimeStart());
            }
        }

        if (!isFound) {
            System.out.println("Train number " + number + " not found.");
        }
    }

    public Train[] sortByStations () {
        Train train;
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                int result = list[i].getStationTitle().compareToIgnoreCase(list[j].getStationTitle());
                if (result > 0) {
                    train = list[i];
                    list[i] = list[j];
                    list[j] = train;
                } else if (result == 0) {
                    if (list[i].getTimeStart().compareTo(list[j].getTimeStart()) > 0) {
                        train = list[i];
                        list[i] = list[j];
                        list[j] = train;
                    }
                }
            }
        }

        return list;
    }
}
