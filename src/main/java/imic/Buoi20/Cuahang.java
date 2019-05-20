package imic.Buoi20;

public class Cuahang {
    static Douong[] menu = new Douong[3];
static {
    menu[0] = new Caphe();
    menu[1] = new Soda();
    menu[2] = new Trasua();
}

    public static void inmenu() {
                for (Douong mymenu : menu) {
            System.out.println(mymenu.toString());
        }
    }
}