package Bai8;

import java.util.Scanner;

public class Nguoi {
    protected String hoTen131;
    protected String ngaySinh131;
    protected String queQuan131;

    public void nhap131(Scanner sc) {
        System.out.print("Nhập họ và tên: ");
        hoTen131 = sc.nextLine();
        System.out.print("Nhập ngày sinh (dd/mm/yyyy): ");
        ngaySinh131 = sc.nextLine();
        System.out.print("Nhập quê quán: ");
        queQuan131 = sc.nextLine();
    }

    public void hienThi131() {
        System.out.println("Họ tên: " + hoTen131);
        System.out.println("Ngày sinh: " + ngaySinh131);
        System.out.println("Quê quán: " + queQuan131);
    }
}

