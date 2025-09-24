package Bai3;

public class Main {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        // Nhập 3 tài liệu mẫu
        ql.nhapTaiLieu131();
        ql.nhapTaiLieu131();
        ql.nhapTaiLieu131();

        // Hiển thị tất cả
        System.out.println("\nDanh sach tai lieu:");
        ql.hienThiTatCa131();

        // Tìm kiếm theo loại
        System.out.println("\nTim kiem theo loai Sach:");
        ql.timKiemTheoLoai131("Sach");

        // Tìm kiếm theo mã
        System.out.println("\nTim kiem theo ma TL001:");
        ql.timKiemTheoMa131("TL001");
    }
}
