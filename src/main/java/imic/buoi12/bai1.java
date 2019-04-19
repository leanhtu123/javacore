package imic.buoi12;

public class bai1
{
    static double[] F = {-3, 7, -1.5, 3.7, 10, 7, 0, 7, -1.5};

    public static void inTriTuyetDoi(){

        for (int i=0; i<F.length; i++){
            System.out.print(Math.abs(F[i])+ " ");
        }
            }

    public static void inSoTran(){
        double a = Math.max(F[0],F[1]);
        for (int i=2; i<F.length; i++){
            a = Math.max(F[i],a);
        }
        System.out.println(a);
    }
    public static void inSoSan(){
        double a = Math.min(F[0],F[1]);
        for (int i=2; i<F.length; i++){
            a = Math.min(F[i],a);
        }
        System.out.println(a);
    }
}

