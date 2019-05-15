package imic.Baitapfinal;


import java.util.Random;

public class Nongtrai
{
    Vatnuoi[] myNongtrai = new Vatnuoi[10];

    public Nongtrai()
    {
        for (Vatnuoi i : myNongtrai) {
            i = randomVatnuoi();
        }
    }

    public Vatnuoi randomVatnuoi()
    {
        Random rd1 = new Random();
        Integer a = rd1.nextInt(4);
        if (a == 0) {
            return new Ga();
        } else if (a == 1) {
            return new Bo();
        } else if (a == 2) {
            return new De();
        } else return new Cuu();
    }
}
