package vn.edu.giadinh.tuan2;

import java.util.Scanner;

public class Bai1Lab1 {

    public static void main(String[] args) {
        System.out.println("Tinh chu vi hcn");
        System.out.println("Tinh dien tich hcn");
        int suLuacChon;
        System.out.print("Lựa chọn chức năng: ");
        Scanner bienNhap;
        bienNhap = new Scanner(System.in);
        suLuacChon = bienNhap.nextInt();

        switch (suLuacChon) {
            case 1:
                tinhChuVi();
                break;
            case 2:
                tinhDienTich();
                break;
            default:
                System.out.println("chon chuc nang khac");

        }
     bienNhap.close();
    }

     static void tinhChuVi() {
         int dai, rong;
         Scanner bienNhap = new Scanner(System.in);
         System.out.println("Nhap chieu dai:");
         dai = bienNhap.nextInt();
         System.out.println("Nhap chieu rong:");
         rong = bienNhap.nextInt();
         System.out.println("Chu vi hcn la:" + (dai + rong) * 2);
     }

     static void tinhDienTich() {
        int dai, rong;
        Scanner bienNhap = new Scanner(System.in);
        System.out.println("Nhap chieu dai:");
        dai = bienNhap.nextInt();
        System.out.println("Nhap chieu rong:");
        rong = bienNhap.nextInt();
        System.out.println("Dien tich hcn la:" + dai * rong);
        

     }

     

         
 
         
     
    
}
