package imic.Baitapfinal;

public class Cuu extends Vatnuoi {
    Double sanluongLong;
    Double sanluongSua;

    public Cuu()
    {
        super();
        type = 3;
        sanluongSua = rd.nextDouble()*20;
        sanluongLong = rd.nextDouble()*20;
        giatri = trongluong * 10 + sanluongSua + sanluongLong;
    }
}
