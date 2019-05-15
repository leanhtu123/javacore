package imic.Baitapfinal;

public class Ga extends Vatnuoi {
    Integer sanluongTrung;
    public Ga()
    {
        super();
        type = 0;
        sanluongTrung = rd.nextInt();
        giatri = trongluong * 10 + sanluongTrung;

    }
}
