package vn.edu.giadinh.tuan4;

public class Dog {
    String name;
    int size; 
    String color;

    public Dog() {};

    public Dog(int s) {};

    public Dog(int s,String n, String c){
        size = s;
        name = n;
        color = c;
    };
    void inThongtin() {
        System.out.println("Size là " + size + " color là " + color + " tên là " + name );
    }
}
