package imic.Buoi20;

import org.junit.Test;

import static org.junit.Assert.*;

public class CuahangTest {

    @Test
    public void inmenu() {
        Cuahang.inmenu();
    }

    @Test
    public void tinhdoanhthu() {
        int kq = Cuahang.tinhdoanhthu("CCTSCTSTTT");
        System.out.println(kq);
        int kq5 = Cuahang.tinhdoanhthu( "CCTSCTSTTTTSCSCTTTSCCSTCSSSTTTTTT");
        System.out.println(kq5);
    }

    @Test
    public void tinhdoanhthu1() {
        int kq = Cuahang.tinhdoanhthu("CCTSCTSTTT", "SMSSLSLLSM");
        System.out.println(kq);
    }
}