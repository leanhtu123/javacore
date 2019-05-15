package imic.Baitapfinal;

public class Bo extends Vatnuoi {
    Double sanluongSua;

    public Bo()
    {
        super();
        type = 1;
        sanluongSua = rd.nextDouble()*20;
        giatri = trongluong * 10 + sanluongSua;
    }
}
