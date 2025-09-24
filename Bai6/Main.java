package Bai6;

// Main131.java
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc131 = new Scanner(System.in);
        KhachSan ks131 = new KhachSan();

        ks131.nhapDanhSach131();
        ks131.hienThiTatCa131();

        System.out.print("\nNhập CMND để tính tiền: ");
        String cmndTinh131 = sc131.nextLine();
        ks131.tinhTienTheoCMND131(cmndTinh131);

        System.out.print("\nNhập CMND để xóa khách: ");
        String cmndXoa131 = sc131.nextLine();
        ks131.xoaKhach131(cmndXoa131);

        System.out.println("\nDanh sách khách còn lại:");
        ks131.hienThiTatCa131();
    }
}
