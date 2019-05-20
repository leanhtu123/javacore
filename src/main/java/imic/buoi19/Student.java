package imic.buoi19;

public class Student {
    public String ms;
    String name;
    Integer diem;

    Student(String name, String maso, Integer diem){
        this.ms = maso;
        this.name = name;
        this.diem = diem;
    }

    public String toString() {
        String result = this.ms + " " +  this.name + " " + this.diem;
        return result;
    }



}
