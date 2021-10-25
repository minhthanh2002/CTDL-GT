package com.thanhdm2008110129.kiemtragiuaky;

public class Apple {
    int id;
    double khoiLuong;
    String mauSac;

    Apple(int id, double khoiLuong, String mauSac){
        this.id = id;
        this.khoiLuong = khoiLuong;
        this.mauSac = mauSac;
    }
    void inThongTin(){
        System.out.println("Apple id " + id + ", khối lượng " + khoiLuong + ", màu sắc " + mauSac);

    }
    
}
