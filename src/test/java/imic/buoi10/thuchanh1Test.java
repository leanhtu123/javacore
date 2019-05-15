package imic.buoi10;

import org.junit.Test;

public class thuchanh1Test {

    @Test
    public void nguyento() {
        thuchanh1.timNguyenTo(101);
    }

    @Test
    public void lietke() {
        thuchanh1.lietke(15);
    }

    @Test
    public void fibo() {
       int kq =  thuchanh1.Fibo(3);
       System.out.println(kq);
    }


}