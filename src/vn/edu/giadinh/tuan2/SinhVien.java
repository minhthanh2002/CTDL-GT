package vn.edu.giadinh.tuan2;

import java.util.Date;

public class SinhVien {
    
    //1. thuộc tính - attribute

    String mssv;
    String tenSinhVien;
    int tuoi;

    String queQuan;

    Date ngaySinh;


    //2.phương thức - method- function
    //<kiểu trả về> <tên hàm> <(danh sách tham số)>(...)
    void inThongTinSV(){
        System.out.println("Mã số sinh viên: " + mssv);
        System.out.println("Tên SInh Viên: " + tenSinhVien);
        System.out.println("Tuổi:" + tuoi);
        System.out.println("Quê quán:" + queQuan);
        System.out.println("Ngày Sinh:" + ngaySinh);
    }
}
