package vn.edu.giadinh.tuan3;

public class Cow {

    double weight;
    String breed;//giống
    String color;//màu sắc

     //HÀM TẠO
    //deplover tạo ra KHÔNG ĐỂ java conpiler tạo ra

    Cow(){//Hàm tạo mặc định do developer tạo ra

    }

    Cow(double w){
        weight = w;
    }

    Cow(double w, String br, String cl ){
       weight = w;
       breed = br;
       color = cl;
    }
    
}
