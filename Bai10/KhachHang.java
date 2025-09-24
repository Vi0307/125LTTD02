package Bai10;

import java.util.Scanner;

public class KhachHang {
    private String hoTenChuHo131;
    private String soNha131;
    private String maCongTo131;

    public void nhap131(Scanner sc) {
        System.out.print("Nhập họ tên chủ hộ: ");
        hoTenChuHo131 = sc.nextLine();
        System.out.print("Nhập số nhà: ");
        soNha131 = sc.nextLine();
        System.out.print("Nhập mã số công tơ: ");
        maCongTo131 = sc.nextLine();
    }

    public void hienThi131() {
        System.out.println("Họ tên chủ hộ: " + hoTenChuHo131);
        System.out.println("Số nhà: " + soNha131);
        System.out.println("Mã công tơ: " + maCongTo131);
    }
}
