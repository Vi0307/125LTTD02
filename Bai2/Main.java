package Bai2;

public class Main {
    public static void main(String[] args) {
        QLCB qlcb = new QLCB();

        // Nhập 2 cán bộ mẫu
        qlcb.nhapCanBo131();
        qlcb.nhapCanBo131();

        // Hiển thị tất cả
        System.out.println("\nDanh sach can bo:");
        qlcb.hienThiTatCa131();

        // Tìm kiếm theo tên
        System.out.println("\nTim kiem theo ten:");
        qlcb.timKiemTheoTen131("Nguyen Van A");
    }
}

