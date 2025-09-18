package Bai7;

import java.util.Scanner;

public class HSHocSinh extends Nguoi {
    private String lop131;
    private String khoaHoc131;
    private String kyHoc131;

    @Override
    public void nhap131(Scanner sc) {
        super.nhap131(sc);
        System.out.print("Nhập lớp: ");
        lop131 = sc.nextLine();
        System.out.print("Nhập khóa học: ");
        khoaHoc131 = sc.nextLine();
        System.out.print("Nhập kỳ học: ");
        kyHoc131 = sc.nextLine();
    }

    @Override
    public void hienThi131() {
        super.hienThi131();
        System.out.println("Lớp: " + lop131);
        System.out.println("Khóa học: " + khoaHoc131);
        System.out.println("Kỳ học: " + kyHoc131);
        System.out.println("----------------------------");
    }

    // Getter để lọc học sinh
    public String getQueQuan131() {
        return queQuan131;
    }

    public String getNgaySinh131() {
        return ngaySinh131;
    }

    public String getLop131() {
        return lop131;
    }
}
