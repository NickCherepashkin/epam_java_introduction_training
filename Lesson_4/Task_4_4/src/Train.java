import java.util.Objects;

public class Train {
    private String stationTitle;
    private int trainNumber;
    private String timeStart;

    public Train(String stationTitle, int trainNumber, String timeStart) {
        this.stationTitle = stationTitle;
        this.trainNumber = trainNumber;
        this.timeStart = timeStart;
    }

    public String getStationTitle() {
        return stationTitle;
    }

    public void setStationTitle(String stationTitle) {
        this.stationTitle = stationTitle;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return trainNumber == train.trainNumber && Objects.equals(stationTitle, train.stationTitle) && Objects.equals(timeStart, train.timeStart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stationTitle, trainNumber, timeStart);
    }

    @Override
    public String toString() {
        return "Train{" +
                "stationTitle = '" + stationTitle + '\'' +
                ", trainNumber = " + trainNumber +
                ", timeStart = '" + timeStart + '\'' +
                '}';
    }
}
