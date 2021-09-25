package Tuan3.tuan3;

import java.util.Scanner;


public class ChuongTrinhLab2Bai4 {

    public static void main(String[] args) {
        System.out.println("====Menu====");
        System.out.println("1.Giải phương trình bậc 1");
        System.out.println("2.Giải phương trình bậc 2");
        System.out.println("3.Tính tiền điện");
        int suLuacChon;
        System.out.print("Lựa chọn chức năng: ");
        Scanner bienNhap;
        bienNhap = new Scanner(System.in);
        suLuacChon = bienNhap.nextInt();

        switch (suLuacChon) {
            case 1:
                giaiPTBac1();
                break;
            case 2:
                giaiPTBac2();
                break;
            case 3:
                tinhTienDien();
                break;
            default:
                System.out.println("chọn chức năng khác");

        }
        bienNhap.close();
    }
    static void giaiPTBac1() {
        // ax + b = 0
        float a, b;
        Scanner bienNhap = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = bienNhap.nextFloat();
        System.out.print("Nhap b: ");
        b = bienNhap.nextFloat();

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
    static void giaiPTBac2() {
        // ax2 + bx +c = 0
        float a, b, c;
        Scanner bienNhap = new Scanner(System.in);
        do {
            System.out.print("Nhap a khac 0: ");
            a = bienNhap.nextFloat();
        } while (a == 0);
        System.out.print("Nhap b: ");
        b = bienNhap.nextFloat();
        System.out.print("Nhap c: ");
        c = bienNhap.nextFloat();

        float delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("PT vo nghiem!");
        } else if (delta == 0) {
            System.out.println("PT co nghiem kep: x1 = x2 = " + -b/ (2 * a));
        } else {
            double x1 = (-b+Math.sqrt(delta)) / (2*a);
            double x2 = (-b-Math.sqrt(delta)) / (2*a);
            System.out.println("PT co nghiem: x1=" + x1 + ", x2=" + x2);
        }
    }
    static void tinhTienDien() {
        // Bậc 1: Cho kWh từ 0 - 50 1.678
        // Bậc 2: Cho kWh từ 51 - 100 1.734
        // Bậc 3: Cho kWh từ 101 - 200 2.014
        // Bậc 4: Cho kWh từ 201 - 300 2.536
        // Bậc 5: Cho kWh từ 301 - 400 2.834
        // Bậc 6: Cho kWh từ 401 trở lên 2.900
        System.out.println("Nhap So Kw dien nang tieu thu: ");
        Scanner sc = new Scanner(System.in);
        float soKw = sc.nextFloat();

        float tongTien;
        if (soKw <= 50) {
            tongTien = soKw * 1678;
        } else if (soKw <= 100) {
            tongTien = 50 * 1678 + (soKw - 50) * 1734;
        } else if (soKw <= 200) {
            tongTien = 50 * 1678 + 50 * 1734 + (soKw - 100) * 2014;
        } else if (soKw <= 300) {
            tongTien = 50 * 1678 + 50 * 1734 + 100 * 2014 + (soKw - 200) * 2536;
        } else if (soKw <= 400) {
            tongTien = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + (soKw - 300) * 2834;
        } else {
            tongTien = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + 100 * 2834 + (soKw - 400) * 2900;
        }
        System.out.println("So tien dien phai tra la: " + tongTien);
    }

}