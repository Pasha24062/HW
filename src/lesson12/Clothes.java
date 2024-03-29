package lesson12;

public abstract class   Clothes {
    private Sizes size;
    private String color;
    private int price;

    public Clothes(Sizes size, String color, int price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public Sizes getSize() {
        return size;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "size=" + size +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
