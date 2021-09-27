package vn;

import java.util.Scanner;

public class Bai1Lab2 {
    public static void main(String[] args) {
        System.out.println("Giai ptrinh bac nhat:");
        float a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a:");
        a = sc.nextFloat();
        System.out.println("Nhap b:");
        b = sc.nextFloat();

        if (a == 0) {
            if (b == 0) {
                System.out.println("PT co vo so nghiem! ");
            } else {
                System.out.println("PT vo nghiem");
            }
        } else {
            System.out.println("PT co nghiem: " + (-b/a));
        }
    }
         

         

    
    
}
