package Bai9;

import java.util.Scanner;

public class TheMuon {
    private String soPhieuMuon131;
    private String ngayMuon131;
    private String hanTra131;
    private String soHieuSach131;
    private SinhVien sinhVien131;

    public void nhap131(Scanner sc) {
        sinhVien131 = new SinhVien();
        System.out.println("=== Nhập thông tin sinh viên ===");
        sinhVien131.nhap131(sc);

        System.out.println("=== Nhập thông tin thẻ mượn ===");
        System.out.print("Số phiếu mượn: ");
        soPhieuMuon131 = sc.nextLine();
        System.out.print("Ngày mượn (dd/mm/yyyy): ");
        ngayMuon131 = sc.nextLine();
        System.out.print("Hạn trả (dd/mm/yyyy): ");
        hanTra131 = sc.nextLine();
        System.out.print("Số hiệu sách: ");
        soHieuSach131 = sc.nextLine();
    }

    public void hienThi131() {
        sinhVien131.hienThi131();
        System.out.println("Số phiếu mượn: " + soPhieuMuon131);
        System.out.println("Ngày mượn: " + ngayMuon131);
        System.out.println("Hạn trả: " + hanTra131);
        System.out.println("Số hiệu sách: " + soHieuSach131);
        System.out.println("-----------------------------");
    }

    public String getHanTra131() {
        return hanTra131;
    }

    public SinhVien getSinhVien131() {
        return sinhVien131;
    }

    public String getSoHieuSach131() {
        return soHieuSach131;
    }
}

