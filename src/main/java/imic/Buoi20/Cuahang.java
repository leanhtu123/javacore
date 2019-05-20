package imic.Buoi20;

import imic.buoi19.Student;

import java.util.HashMap;
import java.util.Map;

public class Cuahang {
    static Map<String, Douong> menu = new HashMap<>();

    static {
        menu.put("C", new Caphe());
        menu.put("T", new Trasua());
        menu.put("S", new Soda());
    }

    public static void inmenu() {
        for (Douong mymenu : menu.values()) {
            System.out.println(mymenu.toWrite("S"));
        }
    }

    public static int tinhdoanhthu(String dsbanhang) {
        int doanhthu = 0;
        for (Character ch : dsbanhang.toCharArray()) {
            Douong douong = menu.get(ch.toString());
            doanhthu = doanhthu + douong.price;
        }
        return doanhthu;
    }

    public static int tinhdoanhthu(String dsbanhang, String dssize) {
        int doanhthu = 0;
        int i=0;

        for (Character ch : dsbanhang.toCharArray()) {

            Douong douong = menu.get(ch.toString());
            doanhthu = doanhthu + douong.getPrice(Character.toString(dssize.toCharArray()[i]));
            i++;

        }
        return doanhthu;
    }
    public static void inFullmenu() {
        for (Douong mymenu : menu.values()) {
            System.out.println(mymenu.toprint());
        }
    }
    public static int inTonghoadon(String dsbanhang, String dssize) {
        int doanhthu = 0;
        int i=0;

        for (Character ch : dsbanhang.toCharArray()) {

            Douong douong = menu.get(ch.toString());
            doanhthu = doanhthu + douong.getPrice(Character.toString(dssize.toCharArray()[i]));
            System.out.println(douong.toWrite(Character.toString(dssize.toCharArray()[i])));
            i++;

        }
        return doanhthu;
    }
}