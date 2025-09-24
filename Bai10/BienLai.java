package Bai10;

import java.util.Scanner;

public class BienLai {
    private KhachHang khachHang131;
    private int chiSoCu131;
    private int chiSoMoi131;

    public void nhap131(Scanner sc) {
        khachHang131 = new KhachHang();
        System.out.println("=== Nhập thông tin khách hàng ===");
        khachHang131.nhap131(sc);

        System.out.println("=== Nhập thông tin biên lai ===");
        System.out.print("Chỉ số cũ: ");
        chiSoCu131 = Integer.parseInt(sc.nextLine());
        System.out.print("Chỉ số mới: ");
        chiSoMoi131 = Integer.parseInt(sc.nextLine());
    }

    public void hienThi131() {
        khachHang131.hienThi131();
        System.out.println("Chỉ số cũ: " + chiSoCu131);
        System.out.println("Chỉ số mới: " + chiSoMoi131);
        System.out.println("Số tiền phải trả: " + tinhTien131() + " VND");
        System.out.println("-----------------------------");
    }

    public int tinhTien131() {
        return (chiSoMoi131 - chiSoCu131) * 750;
    }
}

