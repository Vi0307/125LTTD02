package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    private ArrayList<CanBo> danhSach131 = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // Nhập thông tin cán bộ mới
    public void nhapCanBo131() {
        System.out.println("Nhap loai can bo (1-Cong nhan, 2-Ky su, 3-Nhan vien): ");
        int loai = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        String ngaySinh = sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        String gioiTinh = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        String diaChi = sc.nextLine();

        if (loai == 1) {
            System.out.print("Nhap bac cong nhan: ");
            int bac = Integer.parseInt(sc.nextLine());
            danhSach131.add(new CongNhan(hoTen, ngaySinh, gioiTinh, diaChi, bac));
        } else if (loai == 2) {
            System.out.print("Nhap nganh dao tao: ");
            String nganh = sc.nextLine();
            danhSach131.add(new KySu(hoTen, ngaySinh, gioiTinh, diaChi, nganh));
        } else if (loai == 3) {
            System.out.print("Nhap cong viec: ");
            String cv = sc.nextLine();
            danhSach131.add(new NhanVien(hoTen, ngaySinh, gioiTinh, diaChi, cv));
        }
    }

    // Tìm kiếm theo họ tên
    public void timKiemTheoTen131(String ten) {
        boolean timThay = false;
        for (CanBo cb : danhSach131) {
            if (cb.getHoTen131().equalsIgnoreCase(ten)) {
                cb.hienThiThongTin131();
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay can bo ten: " + ten);
        }
    }

    // Hiển thị tất cả cán bộ
    public void hienThiTatCa131() {
        for (CanBo cb : danhSach131) {
            cb.hienThiThongTin131();
            System.out.println("-----");
        }
    }
}

