package vn.edu.giadinh.tuan4;

public class CTMinhHoaMang {
    public static void main(String[] args) {
        Dog[] danhSachDog = new Dog[7];
        Dog Dog0 = new Dog(10, "den" , "A");
        Dog Dog1 = new Dog(11, "do" , "B");
        Dog Dog2 = new Dog(12, "tim" , "C");
        Dog Dog3 = new Dog(13, "vang" , "D");
        Dog Dog4 = new Dog(14, "Cam" , "E");
        Dog Dog5 = new Dog(15, "Xanh" , "F");
        Dog Dog6 = new Dog(16, "den" , "H");
    

      danhSachDog[0] = Dog0;
      danhSachDog[1] = Dog1;
      danhSachDog[2] = Dog2;
      danhSachDog[3] = Dog3;
      danhSachDog[4] = Dog4;
      danhSachDog[5] = Dog5;
      danhSachDog[6] = Dog6;

      danhSachDog[0].inThongtin();
      danhSachDog[1].inThongtin();
      danhSachDog[2].inThongtin();
      danhSachDog[3].inThongtin();
      danhSachDog[4].inThongtin();
      danhSachDog[5].inThongtin();
      danhSachDog[6].inThongtin();
    }
}
