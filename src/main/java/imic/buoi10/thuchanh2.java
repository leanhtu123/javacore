package imic.buoi10;

import java.util.Random;

public class thuchanh2 {
    public static void phantich(int n) {
        int m = n;
        int j = 0;
        for (int k = 2; k <= n; k++) {
            if (n % k == 0) {
                n = n / k;
                j++;
                if (m == k) {
                    System.out.println(k + " la so nguyen to");
                    System.out.println(k + " =" + " 1 x " + k);
                } else if (j == 1) {
                    System.out.println("Phan tich thua so cua " + m + " la:");
                    System.out.print(m + " = " + k);
                    k=1;
                } else {
                    System.out.print(" x " + k);
                    k = 1;
                }

            }
        }

    }

    public static void kiemtraso(int m) {
        int i = 1;
        int n = m;
        int[] F = new int[m];
        if (m < 10) {
            F[1] = m;
        } else {
            for (i = 1; m >= 10; i++) {
                F[i] = m % 10;
                m = m / 10;
                if (m < 10) {
                    int j = i + 1;
                    F[j] = m;
                }
            }

        }
        int tong = 0;
        for (int u = 1; u <= i; u++) {
            tong = tong + F[u];

        }
        System.out.println("So " + n + " co " + i + " chu so");
        System.out.print("Tong cac chu so cua " + n + " la: " + n + " = ");
        for (int j=i; j>=1; j--) {
            if (j == 1) {
                System.out.print(F[j]);
            } else {
                System.out.print(F[j] + " + ");
            }
        }
        System.out.println(" = " +tong);
        int j = 1;
        for (j = 1; j <= i; j++) {
            if (F[j] != F[i + 1 - j]) {
                System.out.print("So " + n + " khong phai la so thuan nghich");
                break;
            }
        }
        if (j == i+1 ){
            System.out.print("So " + n + " la so thuan nghich");
        }
    }
    public static void inTraiTim(){
        System.out.println("    ****   ****    ");
        System.out.println("   ****** ******   ");
        System.out.println("  ***************  ");
        System.out.println("  ***************  ");
        System.out.println("   *************   ");
        System.out.println("    ***********    ");
        System.out.println("      *******      ");
        System.out.println("        ***        ");
        System.out.println("         *          ");

    }

}
