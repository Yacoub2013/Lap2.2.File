package File;

public class Multimedia extends File {
    private String content;
    private Duration duration;


    public Multimedia(String name, int sizeByte, String format, String content, int hour, int minute, int second) {
        super(name, sizeByte, format);
        setContent(content);
        duration = new Duration(hour, minute, second);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        if (content.isEmpty()) {
            throw new IllegalArgumentException("Введите контент");
        } else {
            this.content = content;
        }

    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public void print() {
        super.print();
        System.out.format("%-51s|\n", (getFormat() + "," + getContent() + "," + duration.printDuration()));
    }

}

