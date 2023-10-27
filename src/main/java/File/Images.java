package File;

public class Images extends File {
    private Size size;









        public Images(String name, int sizeByte, String format, Size size) {
        super(name, sizeByte, format);
        setSize(size);
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;

    }
    public void print(){
        super.print();
        size.printSize();
        System.out.println();
    }
}
