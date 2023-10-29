package File;

public class Images extends File {
    private Size size;

    public Images(String name, int sizeByte, String format, int width, int height) {
        super(name, sizeByte, format);
        size = new Size(width, height);
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;

    }

    public void print() {
        super.print();
        System.out.format("%-51s|\n", (getFormat() + "," + size.printSize()));

    }
}
