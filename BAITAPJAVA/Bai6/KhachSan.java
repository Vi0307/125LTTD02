package Bai6;

// KhachSan.java
import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
    private ArrayList<KhachTro> dsKhachTro131;

    public KhachSan() {
        dsKhachTro131 = new ArrayList<>();
    }

    // Nhập danh sách khách trọ
    public void nhapDanhSach131() {
        Scanner sc131 = new Scanner(System.in);
        System.out.print("Nhập số khách trọ: ");
        int n131 = Integer.parseInt(sc131.nextLine());

        for (int i = 0; i < n131; i++) {
            System.out.println("\n--- Khách trọ " + (i + 1) + " ---");
            System.out.print("Họ tên: ");
            String hoTen131 = sc131.nextLine();
            System.out.print("Ngày sinh: ");
            String ngaySinh131 = sc131.nextLine();
            System.out.print("CMND: ");
            String cmnd131 = sc131.nextLine();
            System.out.print("Số ngày trọ: ");
            int soNgay131 = Integer.parseInt(sc131.nextLine());
            System.out.print("Loại phòng: ");
            String loaiPhong131 = sc131.nextLine();
            System.out.print("Giá phòng/ngày: ");
            double gia131 = Double.parseDouble(sc131.nextLine());

            dsKhachTro131.add(new KhachTro(hoTen131, ngaySinh131, cmnd131, soNgay131, loaiPhong131, gia131));
        }
    }

    // Hiển thị tất cả khách trọ
    public void hienThiTatCa131() {
        System.out.println("\n=== Danh sách khách trọ hiện tại ===");
        for (KhachTro kt131 : dsKhachTro131) {
            kt131.hienThiThongTin131();
            System.out.println("----------------------");
        }
    }

    // Xóa khách theo CMND
    public void xoaKhach131(String cmnd131) {
        KhachTro canXoa131 = null;
        for (KhachTro kt131 : dsKhachTro131) {
            if (kt131.getCmnd131().equals(cmnd131)) {
                canXoa131 = kt131;
                break;
            }
        }
        if (canXoa131 != null) {
            dsKhachTro131.remove(canXoa131);
            System.out.println(">> Đã xóa khách có CMND: " + cmnd131);
        } else {
            System.out.println(">> Không tìm thấy khách có CMND: " + cmnd131);
        }
    }

    // Tính tiền khách trả phòng theo CMND
    public void tinhTienTheoCMND131(String cmnd131) {
        for (KhachTro kt131 : dsKhachTro131) {
            if (kt131.getCmnd131().equals(cmnd131)) {
                System.out.println("Khách hàng có CMND " + cmnd131 + " phải trả: " + kt131.tinhTien131());
                return;
            }
        }
        System.out.println(">> Không tìm thấy khách có CMND: " + cmnd131);
    }
}


