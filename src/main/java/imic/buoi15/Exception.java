package imic.buoi15;

public class Exception {
    public static void devideForzero() {
        int a = 8;
        int c = 0;
        for (int b = 0; b <= a; b++) {
            try {
                c = a / b;
                System.out.println(c);
            } catch (java.lang.Exception zero) {
                System.out.println(zero.getMessage());
            }
        }
    }


}
