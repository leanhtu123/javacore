package imic.buoi12;

import org.junit.Test;

public class bai1Test {

    @Test
    public void lamBaiTap() {
        bai1.inTriTuyetDoi();
    }

    @Test
    public void inSoTran() {
        bai1.inSoTran();
    }

    @Test
    public void inSoSan() {
        bai1.inSoSan();
    }

    @Test
    public void inSoLamTron() {
        bai1.inSoLamTron();
    }

    @Test
    public void timSoMin() {
        double kq = bai1.timSoMin();
        System.out.println(kq);
        assert kq == 4.0: "sai roi";
    }


    @Test
    public void inCanbac2() {
        bai1.inCanbac2();
    }

    @Test
    public void getRandom() {
        double kq = bai1.getRandom();
        System.out.print(kq);
    }

    @Test
    public void inSoNhoNhat() {
        bai1.inSoNhoNhat();
    }
}