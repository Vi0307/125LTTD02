package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    private ArrayList<TaiLieu> danhSach131 = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // Nhập thông tin tài liệu
    public void nhapTaiLieu131() {
        System.out.println("Nhap loai tai lieu (1-Sach, 2-Tap chi, 3-Bao): ");
        int loai = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap ma tai lieu: ");
        String ma = sc.nextLine();
        System.out.print("Nhap ten NXB: ");
        String nxb = sc.nextLine();
        System.out.print("Nhap so ban phat hanh: ");
        int soBan = Integer.parseInt(sc.nextLine());

        if (loai == 1) {
            System.out.print("Nhap ten tac gia: ");
            String tg = sc.nextLine();
            System.out.print("Nhap so trang: ");
            int st = Integer.parseInt(sc.nextLine());
            danhSach131.add(new Sach(ma, nxb, soBan, tg, st));
        } else if (loai == 2) {
            System.out.print("Nhap so phat hanh: ");
            int soPH = Integer.parseInt(sc.nextLine());
            System.out.print("Nhap thang phat hanh: ");
            int thang = Integer.parseInt(sc.nextLine());
            danhSach131.add(new TapChi(ma, nxb, soBan, soPH, thang));
        } else if (loai == 3) {
            System.out.print("Nhap ngay phat hanh: ");
            String ngay = sc.nextLine();
            danhSach131.add(new Bao(ma, nxb, soBan, ngay));
        }
    }

    // Tìm kiếm theo loại
    public void timKiemTheoLoai131(String loai) {
        for (TaiLieu tl : danhSach131) {
            if (("sach".equalsIgnoreCase(loai) && tl instanceof Sach) ||
                ("tapchi".equalsIgnoreCase(loai) && tl instanceof TapChi) ||
                ("bao".equalsIgnoreCase(loai) && tl instanceof Bao)) {
                tl.hienThiThongTin131();
                System.out.println("-----");
            }
        }
    }

    // Tìm kiếm theo mã tài liệu
    public void timKiemTheoMa131(String ma) {
        for (TaiLieu tl : danhSach131) {
            if (tl.getMaTaiLieu131().equalsIgnoreCase(ma)) {
                tl.hienThiThongTin131();
                return;
            }
        }
        System.out.println("Khong tim thay ma tai lieu: " + ma);
    }

    // Hiển thị tất cả tài liệu
    public void hienThiTatCa131() {
        for (TaiLieu tl : danhSach131) {
            tl.hienThiThongTin131();
            System.out.println("-----");
        }
    }
}
