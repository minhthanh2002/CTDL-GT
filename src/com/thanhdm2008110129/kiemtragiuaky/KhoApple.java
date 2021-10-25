package com.thanhdm2008110129.kiemtragiuaky;
import java.util.Scanner;
import java.util.ArrayList;

public class KhoApple{
  static ArrayList<Apple> appleList;
  static Scanner scanner;

  static void nhap() {
    scanner = new Scanner(System.in);
    appleList = new ArrayList<Apple>();
    while(true){
      System.out.print("Nhap id: ");
      int id = scanner.nextInt();
      System.out.print("Nhap khoi luong: ");
      double khoiLuong = scanner.nextDouble();
      scanner.nextLine();
      System.out.print("Nhap mau sac: ");
      String mauSac = scanner.nextLine();
      appleList.add(new Apple(id, khoiLuong, mauSac));
      System.out.print("Nhập thêm (Y/N)? ");
      String luaChon = scanner.nextLine();
      if(luaChon.equals("N") || luaChon.equals("n")){ 
        break; 
      }
    }
  }

  static void tim() {
    while(true){
      System.out.print("Nhap mau sac can tim: ");
      String mauSac = scanner.nextLine();

      ArrayList<Apple> ds = new ArrayList<Apple>();
      for(Apple apple:appleList) {
        if (apple.mauSac.equals(mauSac)) {
          ds.add(apple);
        }
      }
      if (ds.size() == 0) {
        System.out.print("Không tìm thấy Apple co mau " + mauSac + "!\n");
      } else {
        System.out.print("Tìm thấy " + ds.size() + " Apple co mau " + mauSac + "\n");
        for(Apple apple:ds) {
          apple.inThongTin();
        }
      }
      
      System.out.print("Tìm tiếp (Y/N)? ");
      String luaChon = scanner.nextLine();
      if(luaChon.equals("N") || luaChon.equals("n")){ 
        break; 
      }
    }
  }
  static void inDanhSach(){
    for(Apple apple:appleList) {
      apple.inThongTin();
    }
  }

}