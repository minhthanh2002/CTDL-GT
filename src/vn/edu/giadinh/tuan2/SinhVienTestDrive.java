package vn.edu.giadinh.tuan2;

public class SinhVienTestDrive {

    public static void main(String[] args){
        SinhVien sinhVien;//khai báo biến tên sinhVien tham chiếu đối tượng kiêỉu SinhVien

        sinhVien = new SinhVien();//tạo đối tượng sinh viên vùng nhớ heap
        sinhVien.mssv= "12345";
        sinhVien.tenSinhVien = "Đặng Minh Thành";
        sinhVien.queQuan = "TPHCM";
        sinhVien.tuoi = 19;

        sinhVien.inThongTinSV();
    }
    
}
