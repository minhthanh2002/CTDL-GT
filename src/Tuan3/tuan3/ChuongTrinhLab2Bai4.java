package Tuan3.tuan3;

import java.util.Scanner;


public class ChuongTrinhLab2Bai4 {
    
   public static void main (String[] args){ 
        System.out.println("====Menu====");
        System.out.println("1.Giải phương trình bậc 1");
        System.out.println("2.Giải phương trình bậc 2");
        System.out.println("3.Tính tiền điện");
        int suLuacChon;
        System.out.println("Lựa chọn chức năng");
        Scanner bienNhap;
        bienNhap = new Scanner(System.in);
        suLuacChon = bienNhap.nextInt();
   
        

        switch(suLuacChon){
            case 1: giaiPTBac1();break;
            case 2: giaiPTBac2();break;
            case 3: tinhTienDien();break;
            default: System.out.println("chọn chức năng khác");
        
        }
   }
 static void giaiPTBac1(){
     float a=0, b=0;

     if (a==0){
         if (b==0){
             System.out.println("Phương trình vô nghiệm");
         }

     }
 }       
 static void giaiPTBac2(){
     System.out.println("Trien khai code giải ptrinh bậc 2");
 }
 static void tinhTienDien(){
     System.out.println("Triển khai code tính tiền điện");
 }

}
