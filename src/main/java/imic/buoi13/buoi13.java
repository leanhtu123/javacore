package imic.buoi13;

import javax.xml.stream.events.Characters;

public class buoi13 {
    public static void inKiTuChar()
    {
        int y = 0;
        int k = Character.MAX_VALUE;
        System.out.println(k);
        for(char x = Character.MIN_VALUE; x<=Character.MAX_VALUE; x++ )
        {
            int i = x;
            System.out.println(String.format("int[%d] char[%s]", i, x));
        }
    }


    public static void inUpcase(String chuoikitu)
    {
       System.out.println(chuoikitu.toUpperCase());
    }
    public static boolean kiemTraChuoi()
    {
        String doanvan = "However in Java development, we come across situations where we need to use objects instead of primitive data types. In order to achieve this, Java provides wrapper class Character for primitive data type char.";
        String doanvan2 = "Java";
        int index1 = doanvan.indexOf(doanvan2);
        int index2 = doanvan.lastIndexOf(doanvan2);
        System.out.print(index2);
        boolean kq;
        if (index1 !=-1) { kq = true;}
        else kq = false;
        return kq;
    }

}
