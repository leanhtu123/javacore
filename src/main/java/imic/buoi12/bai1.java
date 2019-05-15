package imic.buoi12;

import java.util.Random;

public class bai1 {
    static double[] F = {-3, 7, -1.52, 3.72, 10, 7, 0, 7, -1.5};

    public static void inTriTuyetDoi() {

        for (int i = 0; i < F.length; i++) {
            System.out.print(Math.abs(F[i]) + " ");
        }
    }

    public static void inSoTran() {
        for (int i = 0; i < F.length; i++) {
            System.out.print(Math.ceil(F[i]) + " ");
        }

    }

    public static void inSoSan() {
        for (int i = 0; i < F.length; i++) {
            System.out.print(Math.floor(F[i]) + " ");
        }
    }

    public static void inSoLamTron() {

        for (int i = 0; i < F.length; i++) {
            System.out.print(Math.round(F[i]*100.0)/100.0 + " ");
        }
    }

    public static double timSoMin() {

        double a = Math.min(F[0], F[1]);
        for (int i = 2; i < F.length; i++) {
            a = Math.min(F[i], a);
        }
        return a;
    }

    public static void inCanbac2()
    {
        for (int i = 0; i < F.length; i++) {
            if (F[i] > 0) {
                System.out.print(Math.sqrt(F[i]) + " ");
            }
        }
    }
    public static double getRandom() {
                int a = new Random().nextInt(F.length);
        return F[a];
           }

    public static void inSoNhoNhat()
    {
        System.out.print(Integer.MIN_VALUE);
    }

}

