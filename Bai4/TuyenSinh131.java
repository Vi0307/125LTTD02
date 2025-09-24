package Bai4;

// TuyenSinh131.java
import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh131 {
    private ArrayList<ThiSinh131> danhSach131 = new ArrayList<>();

    public void nhapThiSinh131() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng thí sinh: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Thí sinh " + (i+1) + " ---");
            System.out.print("Số báo danh: ");
            String sbd = sc.nextLine();
            System.out.print("Họ tên: ");
            String ten = sc.nextLine();
            System.out.print("Địa chỉ: ");
            String dc = sc.nextLine();
            System.out.print("Ưu tiên khu vực: ");
            String uuTien = sc.nextLine();

            System.out.print("Chọn khối thi (A/B/C): ");
            String khoi = sc.nextLine().toUpperCase();

            ThiSinh131 ts;
            switch (khoi) {
                case "A":
                    ts = new ThiSinhKhoiA131(sbd, ten, dc, uuTien);
                    break;
                case "B":
                    ts = new ThiSinhKhoiB131(sbd, ten, dc, uuTien);
                    break;
                case "C":
                    ts = new ThiSinhKhoiC131(sbd, ten, dc, uuTien);
                    break;
                default:
                    System.out.println("Khối không hợp lệ, bỏ qua!");
                    continue;
            }
            danhSach131.add(ts);
        }
    }

    public void hienThiTatCa131() {
        System.out.println("\n--- Danh sách thí sinh ---");
        for (ThiSinh131 ts : danhSach131) {
            ts.hienThiThongTin131();
            System.out.println("---------------------");
        }
    }

    public void timKiemTheoSBD131(String sbd) {
        System.out.println("\n--- Kết quả tìm kiếm ---");
        for (ThiSinh131 ts : danhSach131) {
            if (ts.getSoBaoDanh131().equalsIgnoreCase(sbd)) {
                ts.hienThiThongTin131();
                return;
            }
        }
        System.out.println("Không tìm thấy thí sinh có SBD: " + sbd);
    }
}
