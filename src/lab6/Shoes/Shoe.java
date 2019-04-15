package lab6.Shoes;

public abstract class Shoe {
    private String color;
    private int size;

    public String getColor() {
        return color;
    }


    public int getSize() {
        return size;
    }

    public Shoe(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
