package com.thanhdm2008110129.tuan3;

public class NhanVienTestDrive {
    public static void main(String[] args) {
        NhanVien nhanVien;
        nhanVien = new NhanVien();

        nhanVien.tenNhanVien="Nguyen Van A";
        nhanVien.luong=8000000;
        nhanVien.diaChi=2000/13;
        nhanVien.boPhanLamViec="Ke toan";
        
        nhanVien.inThongTin();
        nhanVien= new NhanVien("Nguyen Van A", 8000000, 2000/13, "Ke toan");
        System.out.println("Ten nhan vien: " + nhanVien.tenNhanVien + " Luong: " + nhanVien.luong + " Dia chi: " + nhanVien + " Bo phan lam viec: " + nhanVien.boPhanLamViec);


    }
    
}
