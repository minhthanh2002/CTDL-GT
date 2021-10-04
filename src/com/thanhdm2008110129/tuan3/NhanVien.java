package com.thanhdm2008110129.tuan3;

public class NhanVien {
    String tenNhanVien;
    int luong;
    int diaChi;
    String boPhanLamViec;

    void inThongTin(){
        System.out.println("Ten nhan Vien: " + tenNhanVien);
        System.out.println("Luong: " + luong);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Bo phan lam viec: " + boPhanLamViec);
    }

        NhanVien(String nv, int l, int dc, String bp){
            tenNhanVien = nv;
            luong = l;
            diaChi = dc;
            boPhanLamViec = bp;
        }

        public NhanVien() {
        }
         
    
    
        


}
