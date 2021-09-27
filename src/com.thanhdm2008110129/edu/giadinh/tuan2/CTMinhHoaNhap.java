package vn.edu.giadinh.tuan2;

import java.util.Scanner;

public class CTMinhHoaNhap {

    public static void main(String[] args){
        double diemMonCTDLGT;
        diemMonCTDLGT = 4.0;//f
        
        //Tạo đối tượng
        //toán tử new
        //Hàm tạo của lớp Scanner
        Scanner bienNhap = new Scanner(System.in);
        System.out.print("Nhập vào điểm môn CTDL & GT: ");
        diemMonCTDLGT = bienNhap.nextDouble();
        bienNhap.close();
    
        

        System.out.println("Điểm vừa nhập vào là: " + diemMonCTDLGT );

        String chuoi = new String("Hello bạn");
        System.out.println(chuoi);

        //String chuỗi;

        // double diemmonCTDLGT;

        

    }
    
}
