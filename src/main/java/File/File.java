package File;

public class File {
    private String name;
    private int sizeByte;
    private String format;

    public File(String name, int sizeByte, String format) {
        setName(name);
        setSizeByte(sizeByte);
        setFormat(format);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Введтие название файла");
        } else {
            this.name = name;
        }
    }


    public int getSizeByte() {
        return sizeByte;
    }

    public void setSizeByte(int sizeByte) {
        if (sizeByte <= 0) {
            throw new IllegalArgumentException("Введите размер файла");
        } else {
            this.sizeByte = sizeByte;
        }

    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        if (format.isEmpty()) {
            throw new IllegalArgumentException("Введите формат файла");
        } else {
            this.format = format;
        }
    }

    public void print() {
        System.out.printf("| %-25s | %-17s|  ", name, sizeByte);

    }
}



