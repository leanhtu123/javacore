package imic.buoi10;

import java.util.Random;
import java.util.Scanner;

public class thuchanh3 {
    public static double giatri() {
        Random rd = new Random();
        int trongLuong = 1 + rd.nextInt(50);
        int sanLuongSua = 1 + rd.nextInt(50);
        int sanLuongtrung = 1 + rd.nextInt(10);
        int sanLuonglong = 1 + rd.nextInt(20);
        double giatri = trongLuong * 10 + sanLuonglong * 5 + sanLuongSua + sanLuongtrung / 10.0;
        return giatri;
    }

    public static double giatri1mua(int x, int y, int z, int k) {
        double tonggiatri = 0.0;
        for (int i = 1; i <= x; i++) {
            System.out.println(" ID ga: Ga0" + i);
            double giatriga = thuchanh3.giatri();
            System.out.println(" Gia tri la: " + giatriga + " $");
            tonggiatri = tonggiatri + giatriga;

        }
        for (int i = 1; i <= y; i++) {
            System.out.println(" ID Bo: Bo0" + i);
            double giatribo = thuchanh3.giatri();
            System.out.println(" Gia tri la: " + giatribo + " $");
            tonggiatri = tonggiatri + giatribo;
        }
        for (int i = 1; i <= z; i++) {
            System.out.println(" ID Cuu: Cuu0" + i);
            double giatricuu = thuchanh3.giatri();
            System.out.println(" Gia tri la: " + giatricuu + " $");
            tonggiatri = tonggiatri + giatricuu;
        }
        for (int i = 1; i <= k; i++) {
            System.out.println(" ID De: De0" + i);
            double giatride = thuchanh3.giatri();
            System.out.println(" Gia tri la: " + giatride + " $");
            tonggiatri = tonggiatri + giatride;
        }
        return tonggiatri;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap so luong Ga: ");
        int soGa = scan.nextInt();
        System.out.print("Nhap so luong Bo: ");
        int soBo = scan.nextInt();
        System.out.print("Nhap so luong Cuu: ");
        int soCuu = scan.nextInt();
        System.out.print("Nhap so luong De: ");
        int soDe = scan.nextInt();
        double giatri1mua = thuchanh3.giatri1mua(soGa, soBo, soCuu, soDe);
        System.out.println("Tong gia tri nong trai trong 1 mua = " + giatri1mua + " $");
        double giatri4mua = 0.0;
        for (int i = 1; i <= 4; i++) {
            giatri4mua = giatri4mua + giatri1mua;
        }
        System.out.println("Tong gia tri nong trai trong 4 mua = " + giatri4mua + " $");
    }
}

