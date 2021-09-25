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
        System.out.println("Triển khai code tính tiền điện");
    }

}