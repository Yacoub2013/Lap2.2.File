package File;

public class Document extends File {
    private int numberOfPages;

    public Document(String name, int sizeByte, String format, int numberOfPages) {
        super(name, sizeByte, format);
        setNumberOfPages(numberOfPages);
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        if(numberOfPages<=0){
            throw new IllegalArgumentException("Введите кол-во страниц");
        }else{
            this.numberOfPages = numberOfPages;
        }

    }
    public void print(){
        super.print();
        System.out.println(numberOfPages);
    }
}
