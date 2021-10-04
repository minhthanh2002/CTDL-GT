package com.thanhdm2008110129.tuan3;

public class TaiKhoan {
    String tenTaiKhoan;
    int soTaiKhoan;
    int soDu;

    void inThongTin(){
        System.out.println("Ten ti khoan: " + tenTaiKhoan);
        System.out.println("So tai khoan: " + soTaiKhoan);
        System.out.println("So du: " + soDu);
    }
        TaiKhoan(String ttk, int stk, int sd){
        tenTaiKhoan=ttk;
        soTaiKhoan=stk;
        soDu=sd;
    }
        public TaiKhoan() {
        }
    
    
}
