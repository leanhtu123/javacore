package imic.Buoi20;

public class Douong {
    String category;
    String name;
    protected Integer price;

    public Douong() {
    }

    public int getPrice(String size) {
        switch (size) {

            case "M":
                return price + 5;
            case "L":
                return price + 10;
            default:
                return price;

        }
    }

    public String toString() {
        return name + ": gia " + getPrice("S") + "K";
    }
}
