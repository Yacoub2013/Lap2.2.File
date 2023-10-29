package File;

public class Video extends File {
    private String content;
    private Duration duration;
    private Size size;

    public Video(String name, int sizeByte, String format, String content, int width, int height, int hour, int minute, int second) {
        super(name, sizeByte, format);
        setContent(content);
        duration = new Duration(hour, minute, second);
        size = new Size(width, height);

    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        if (content.isEmpty()) {
            throw new IllegalArgumentException("Введите контент");
        }
        this.content = content;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void print() {
        super.print();
        System.out.format("%-50s |", getFormat() + ", " + getContent() + "," + duration.printDuration() + "," + size.printSize());
        System.out.println();
        System.out.format("+---------------------------+------------------+-----------------------------------------------------+%n");
    }
}

