package File;

public class Video extends File {
    private String content;
    private Duration duration;
    private Size size;

    public Video(String name, int sizeByte, String format, String content, Size size,Duration duration) {
        super(name, sizeByte, format);
        setContent(content);
        setDuration(duration);
        setSize(size);
    }



    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        if(content.isEmpty()){
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
    public void print(){
        super.print();
        System.out.print(content);
        duration.printDuration();
        size.printSize();
        System.out.println();
    }
}

