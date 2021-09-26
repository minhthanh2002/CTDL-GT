package vn.edu.giadinh.tuan2;

import java.util.Scanner;

public class Bai2Lab2 {

    public static void main(String[] args) {
        System.out.println("Tinh the tich khoi hcn:");
        float canh;
        Scanner bienNhap = new Scanner (System.in);
        System.out.print("Nhap canh:");
        canh = bienNhap.nextFloat();
        System.out.println("The tich khoi hcn:" + canh*canh*canh);

    }


    
}
