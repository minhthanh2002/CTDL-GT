package com.thanhdm2008110129.tuan4;
import java.util.Scanner;
import java.util.ArrayList;
public class Bai1Lab4 {
    
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double tong = 0;
    ArrayList<Double> list = new ArrayList<Double>();
    while(true){
      System.out.print("Vui long nhap 1 con so: ");
      Double x = scanner.nextDouble();
      scanner.nextLine();
      list.add(x);
      tong += x;
      System.out.print("Nhập thêm (Y/N)? ");
      if(scanner.nextLine().equals("N")){ 
        break; 
      }
    }
    scanner.close();
    System.out.print("cac so vua nhap: ");
    for (double i : list) {
      System.out.print(i + " ");
    }
    System.out.print("\nTong la: " + tong);
  }
}
    

