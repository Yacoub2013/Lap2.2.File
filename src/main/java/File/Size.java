package File;

public class Size {
    private int width;
    private int height;

    public Size(int width, int height) {
        setWidth(width);
        setHeight(height);
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Введите коректный размер");
        }
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Введите коректный размер");
        } else {
            this.height = height;
        }

    }

    public String printSize() {
        return width + "x" + height;
    }
}


