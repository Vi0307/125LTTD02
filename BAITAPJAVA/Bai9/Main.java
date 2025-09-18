package Bai9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<TheMuon> ds131 = new ArrayList<>();

        System.out.print("Nhập số lượng thẻ mượn: ");
        int n131 = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n131; i++) {
            System.out.println("\n=== Nhập thẻ mượn thứ " + (i + 1) + " ===");
            TheMuon tm131 = new TheMuon();
            tm131.nhap131(sc);
            ds131.add(tm131);
        }

        System.out.println("\n--- Danh sách sinh viên cần trả sách vào cuối tháng ---");
        for (TheMuon tm : ds131) {
            if (tm.getHanTra131().startsWith("30/") || 
                tm.getHanTra131().startsWith("31/")) {
                tm.hienThi131();
            }
        }
    }
}

