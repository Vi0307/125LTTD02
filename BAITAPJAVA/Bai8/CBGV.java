package Bai8;

import java.util.Scanner;

public class CBGV extends Nguoi {
    private double luongCung131;
    private double thuong131;
    private double phat131;
    private double luongThucLinh131;

    @Override
    public void nhap131(Scanner sc) {
        super.nhap131(sc);
        System.out.print("Nhập lương cứng: ");
        luongCung131 = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập tiền thưởng: ");
        thuong131 = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập tiền phạt: ");
        phat131 = Double.parseDouble(sc.nextLine());
        tinhLuong131();
    }

    private void tinhLuong131() {
        luongThucLinh131 = luongCung131 + thuong131 - phat131;
    }

    @Override
    public void hienThi131() {
        super.hienThi131();
        System.out.println("Lương cứng: " + luongCung131);
        System.out.println("Thưởng: " + thuong131);
        System.out.println("Phạt: " + phat131);
        System.out.println("Lương thực lĩnh: " + luongThucLinh131);
        System.out.println("----------------------------");
    }

    public double getLuongThucLinh131() {
        return luongThucLinh131;
    }
}
