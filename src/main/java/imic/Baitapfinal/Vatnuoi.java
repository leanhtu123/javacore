package imic.Baitapfinal;

import java.util.Random;

public class Vatnuoi
{
    int type;
    String ID;
    Double giatri;
    Double trongluong;
    Random rd = new Random();

    public Vatnuoi()
    {
        ID = "123"; //todo: chinhsuasau
        giatri = 0.0;
        trongluong = rd.nextDouble()*10;
    }
}
