package File;

public class Multimedia extends File{
    private String content;
    private Duration duration;



    public Multimedia(String name, int sizeByte, String format, String content, Duration duration) {
        super(name, sizeByte, format);
        setContent(content);
        setDuration(duration);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        if(content.isEmpty()){
            throw new IllegalArgumentException("Введите контент");
        }else{
            this.content = content;
        }

    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }
    public void print(){
        super.print();
        System.out.print(content);
        duration.printDuration();
        System.out.println();
    }

}

