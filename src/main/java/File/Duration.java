package File;

public class Duration {
    private int hour;
    private int minute;
    private int second;

    public Duration(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour <= 0 || hour > 24) {
            throw new IllegalArgumentException("Введите коректное время");
        } else {
            this.hour = hour;
        }

    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute <= 0 || minute > 60) {
            throw new IllegalArgumentException("Введите коректное время");

        } else {
            this.minute = minute;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 60) {
            throw new IllegalArgumentException("Введите коректное время");
        } else {
            this.second = second;
        }

    }

    public String printDuration() {
        return hour + ":" + minute + ":" + second;

    }

}


