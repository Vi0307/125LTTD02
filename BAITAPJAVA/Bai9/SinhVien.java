package Bai9;

import java.util.Scanner;

public class SinhVien {
    private String hoTen131;
    private String maSV131;
    private String ngaySinh131;
    private String lop131;

    public void nhap131(Scanner sc) {
        System.out.print("Nhập họ tên sinh viên: ");
        hoTen131 = sc.nextLine();
        System.out.print("Nhập mã sinh viên: ");
        maSV131 = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        ngaySinh131 = sc.nextLine();
        System.out.print("Nhập lớp: ");
        lop131 = sc.nextLine();
    }

    public void hienThi131() {
        System.out.println("Họ tên: " + hoTen131);
        System.out.println("Mã SV: " + maSV131);
        System.out.println("Ngày sinh: " + ngaySinh131);
        System.out.println("Lớp: " + lop131);
    }

    public String getHoTen131() {
        return hoTen131;
    }
}
