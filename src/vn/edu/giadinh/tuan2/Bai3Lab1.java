package vn.edu.giadinh.tuan2;

import java.util.Scanner;

public class Bai3Lab1 {
    public static void main(String[] args) {
        System.out.println("Tinh delta");
        System.out.println("Tinh can bac 2");
        float a,b,c;
        Scanner bienNhap = new Scanner(System.in);
        System.out.println("Nhap a:");
        a = bienNhap.nextFloat();
        System.out.println("Nhap b:");
        b = bienNhap.nextFloat();
        System.out.println("Nhap c:");
        c = bienNhap.nextFloat();
        float delta = (b*b) - 4*a*c;
        System.out.println("Can bac 2 cua delta =" +  delta );
        
        
    }

    
}
