package imic.buoi19;

import java.util.*;

public class Javacolectiontest {
    public static void main(String[] args) {

        testMap();
    }

    public static void testList()
    {
        List<Student> dsSV = new ArrayList<>();
        dsSV.add(new Student("Le Anh Tu", "01", 10));
        dsSV.add(new Student("Le Anh Tai", "02", 9));
        dsSV.add(new Student("Le Anh Teo", "03", 8));
        dsSV.add(new Student("Le Anh Thu", "04", 7));
        dsSV.add(new Student("Le Anh Thuan", "05", 6));
        for (Student sv : dsSV) {
            System.out.println(sv.toString());
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ma so: ");
        String maso = scan.nextLine();
        for (Student sv : dsSV) {
            //System.out.println("ms = " + maso + ", sv.ms = " + sv.ms);
            if (maso.equals(sv.ms)) {
                System.out.println(sv.toString());
            }
        }
    }

    public static void testMap()
    {
        Map<String, Student> dsSV = new HashMap<>();
        dsSV.put("01", new Student("Le Anh Tu", "01", 10));
        dsSV.put("02", new Student("Le Anh Tai", "02", 9));

        for (Student sv : dsSV.values()) {
            System.out.println(sv.toString());
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ma so: ");
        String maso = scan.nextLine();
        Student found = dsSV.get(maso);
        System.out.println(found);
    }
}
