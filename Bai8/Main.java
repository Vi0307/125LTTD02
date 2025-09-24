package Bai8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<CBGV> ds131 = new ArrayList<>();

        System.out.print("Nhập số lượng cán bộ giáo viên: ");
        int n131 = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n131; i++) {
            System.out.println("=== Nhập cán bộ giáo viên thứ " + (i + 1) + " ===");
            CBGV gv131 = new CBGV();
            gv131.nhap131(sc);
            ds131.add(gv131);
        }

        System.out.println("\n--- Danh sách cán bộ có lương thực lĩnh >= 8,000,000 ---");
        for (CBGV gv : ds131) {
            if (gv.getLuongThucLinh131() >= 8000000) {
                gv.hienThi131();
            }
        }
    }
}

