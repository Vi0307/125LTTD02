package Bai4;

// Main131.java
import java.util.Scanner;

public class Main131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TuyenSinh131 ts = new TuyenSinh131();

        ts.nhapThiSinh131();
        ts.hienThiTatCa131();

        System.out.print("\nNhập số báo danh cần tìm: ");
        String sbd = sc.nextLine();
        ts.timKiemTheoSBD131(sbd);
    }
}

