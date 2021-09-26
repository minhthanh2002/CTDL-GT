package Tuan3.tuan3;

import java.util.Scanner;


public class ChuongTrinhLab2Bai4 {

    public static void main(String[] args) {
        System.out.println("Tinh chu vi hcn");
        System.out.println("Tinh dien tich hcn");
        int dai, rong;
         Scanner bienNhap = new Scanner(System.in);
         System.out.println("Nhap chieu dai:");
         dai = bienNhap.nextInt();
         System.out.println("Nhap chieu rong:");
         rong = bienNhap.nextInt();
         System.out.println("Chu vi hcn la:" + (dai + rong) * 2);
         System.out.println( "Dien tich hcn la:"  + dai * rong);
         System.out.println("Canh nho nhat la :" + Math.min(dai, rong));

    }
}