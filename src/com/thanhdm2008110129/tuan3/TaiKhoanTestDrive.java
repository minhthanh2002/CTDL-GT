package com.thanhdm2008110129.tuan3;

public class TaiKhoanTestDrive {
    public static void main(String[] args) {
        TaiKhoan taiKhoan;
        taiKhoan = new TaiKhoan();

        taiKhoan.tenTaiKhoan="Nguyen Van B";
        taiKhoan.soTaiKhoan=1234567890;
        taiKhoan.soDu=5000000;

        taiKhoan.inThongTin();

        taiKhoan = new TaiKhoan("Nguyen Van B", 1234567890, 5000000);
        System.out.println("Ten tai khoan: " + taiKhoan.tenTaiKhoan + ". So tai khoan: " + taiKhoan.soTaiKhoan + ". So du: " + taiKhoan.soDu);

        
    }
    
}
