package imic.Baitapfinal;

public class De extends Vatnuoi {
    Double sanluongSua;

    public De()
    {
        super();
        type = 2;
        sanluongSua = rd.nextDouble()*20;
        giatri = trongluong * 10 + sanluongSua;
    }
}
