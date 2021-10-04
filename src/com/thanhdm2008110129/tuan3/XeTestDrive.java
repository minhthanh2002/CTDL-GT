package com.thanhdm2008110129.tuan3;

public class XeTestDrive {
    public static void main(String[] args) {
        Xe xe;
        xe = new Xe();

        xe.tenChuXe="Nguyen Van A";
        xe.hangSanXuat="Honda";
        xe.dong="Sh mode";
        xe.dungTichXang="5,6 (lit)";

        xe.inThongTin();

        xe = new Xe("Nguyen Van A", "Honda", "Sh mode", "5,6 (lit)");
        System.out.println("Ten chu xe: " + xe.tenChuXe + " Hang san xuat: " + xe.hangSanXuat + " Dong: " + xe.dong + " Dung tich xang: " + xe.dungTichXang);

    }
    
}
