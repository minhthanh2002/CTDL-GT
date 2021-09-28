package com.thanh2008110129.tuan3;

import java.util.Scanner;
import java.util.Arrays;

public class Bai3Lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap may so nguyen? ");
        int n = sc.nextInt();
    
        // Nhập mảng
        int[] mangSoNguyen = new int[n];
        for (int i = 0; i < n; i++) {
          System.out.print("Nhap so thu " + (i + 1) + ": ");
          mangSoNguyen[i] = sc.nextInt();
        }
        // Sắp xesp tăng dần
        Arrays.sort(mangSoNguyen);
        // In  mảng
        System.out.println("Day so nguyen: ");
        for (int i = 0; i < n; i++) {
          System.out.print(mangSoNguyen[i] +  " ");
        }
        // Tìm phần tử nhỏ nhất
        int soNhoNhat = mangSoNguyen[0];
        for (int i = 1; i < n; i++) {
          if (mangSoNguyen[i] < soNhoNhat) {
            soNhoNhat = mangSoNguyen[i];
          }
        }
        System.out.println("\nSo nho nhat la: " + soNhoNhat);
    
        int tong = 0;
        int dem = 0;
        for (int i = 0; i < n; i++) {
          if (mangSoNguyen[i] % 3 == 0) {
            tong += mangSoNguyen[i];
            dem++;
          }
        }
        System.out.println("TB la: " + (tong / dem));
    
        sc.close();
      }
}
    



    

