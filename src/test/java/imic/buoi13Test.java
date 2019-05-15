package imic;

import imic.buoi13.buoi13;
import org.junit.Test;

public class buoi13Test {

    @Test
    public void inKiTuChar() {
        buoi13.inKiTuChar();
    }

    @Test
    public void inUpcase() {
        String chuoikitu = "I love coding Java!!";
        buoi13.inUpcase(chuoikitu );
        String tu = "tô văn tèo";
        buoi13.inUpcase(tu );

    }

    @Test
    public void kiemTraChuoi() {
        boolean ketqua = buoi13.kiemTraChuoi();
        System.out.print(ketqua);
    }
}