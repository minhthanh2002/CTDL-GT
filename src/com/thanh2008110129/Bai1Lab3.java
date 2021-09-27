package com.thanh2008110129;

import java.util.Scanner;
public class Bai1Lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        boolean ok = true;
        for (int i = 2; i < n-1; i++) {
            if(n % i == 0){
                ok = false;
                break;
            }
        }
        if (ok) {
            System.out.print(n + " la so nguyen to!");
        } else {
            System.out.print(n + " khong phai la so nguyen to!");
        }
        
        sc.close();
    }
}
