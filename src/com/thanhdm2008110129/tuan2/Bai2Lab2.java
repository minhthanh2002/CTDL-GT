package com.thanhdm2008110129.tuan2;

import java.util.Scanner;

public class Bai2Lab2 {
    public static void main(String[] args) {
        System.out.println("Giai ptrinh bac hai:");
        float a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a:");
        a = sc.nextFloat();
        System.out.println("Nhap b:");
        b = sc.nextFloat();
        System.out.println("Nhap c:");
        c = sc.nextFloat();

        if (a==0){
            //giai ptrinh bac 1 
        } if (b==0){
            if(c==0){
                System.out.println("Phuong trinh vo so nghiem");
            }else{
                System.out.println("Phuong trinh vo nghiem:");
            }
        
        }else{
                System.out.println("Phuong trinh co nghiem x=" + -b/c);
            }
            //phuong trinh bac 2
            float delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("PT vo nghiem!");
        } else if (delta == 0) {
            System.out.println("PT co nghiem kep: x1 = x2 = " + -b/ (2 * a));
        } else {
            double x1 = (-b+Math.sqrt(delta)) / (2*a);
            double x2 = (-b-Math.sqrt(delta)) / (2*a);
            System.out.println("PT co nghiem: x1=" + x1 + ", x2=" + x2);
        }
    }
}       
         
         
         

    

