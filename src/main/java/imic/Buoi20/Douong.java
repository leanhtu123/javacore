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
    public String toWrite(String size) {
        return name + ": gia " + getPrice(size) + "K" + " size: " + size;
    }
    public String toprint() {
        return name + ": size S: " + getPrice("S") + "K; " + "size M:" + getPrice("M") + "K; " +"size L:" + getPrice("L") + "K" ;
    }
}
