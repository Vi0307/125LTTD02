package Bai7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HSHocSinh> ds131 = new ArrayList<>();

        System.out.print("Nhập số lượng học sinh: ");
        int n131 = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n131; i++) {
            System.out.println("=== Nhập học sinh thứ " + (i + 1) + " ===");
            HSHocSinh hs131 = new HSHocSinh();
            hs131.nhap131(sc);
            ds131.add(hs131);
        }

        System.out.println("\n--- Học sinh sinh năm 1985 và quê ở Thái Nguyên ---");
        for (HSHocSinh hs : ds131) {
            if (hs.getNgaySinh131().contains("1985") && hs.getQueQuan131().equalsIgnoreCase("Thái Nguyên")) {
                hs.hienThi131();
            }
        }

        System.out.println("\n--- Học sinh lớp 10A1 ---");
        for (HSHocSinh hs : ds131) {
            if (hs.getLop131().equalsIgnoreCase("10A1")) {
                hs.hienThi131();
            }
        }
    }
}

