package imic.buoi10;

public class thuchanh1 {
    public static void main(String[] args) {
    }

    public static int USLN(int a, int b) {
        int uoclonnhat = 1;
        for (int i = 1; i <= a || i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                uoclonnhat = i;
            }
        }
        return uoclonnhat;

    }

    public static int BCNN(int x, int y) {
        int max = x;
        if (x > y) {
            max = x;
        } else max = y;
        int boichungnhonhat = max;
        for (int j = max; j <= x * y; j++) {
            if (j % x == 0 && j % y == 0) {
                boichungnhonhat = j;
                break;
            }
        }
        return boichungnhonhat;


    }

    public static int Fibo(int z) {
        int[] F = new int[z];
        F[0] = 0;
        F[1] = 1;
        F[2] = 1;
        int Fn = 1;
        for (int k = 2; k < z; k++) {
            F[k] = F[k - 1] + F[k - 2];
            Fn = F[k];
        }
        return Fn;

    }

    public static void nguyento(int g) {
        int tu = 0;
        for (int t = 1; t <= g; t++) {
            if (g % t == 0) {
                tu++;
            }
        }
        if (tu == 2) {
            System.out.println(g + " la so nguyen to");
        } else {
            System.out.println(g + " khong phai la so nguyen to");
        }
    }

    public static void lietke(int q) {
        for (int tt = 1; tt <= q; tt++) {
            int thao = 0;
            for (int vv = 1; vv <= tt; vv++) {
                if (tt % vv == 0) {
                    thao++;
                }
            }
            if (thao == 2) {
                System.out.print(tt + " ");
            }
        }
    }

}
