package Bai10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<BienLai> ds131 = new ArrayList<>();

        System.out.print("Nhập số lượng hộ dân: ");
        int n131 = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n131; i++) {
            System.out.println("\n=== Nhập hộ dân thứ " + (i + 1) + " ===");
            BienLai bl131 = new BienLai();
            bl131.nhap131(sc);
            ds131.add(bl131);
        }

        System.out.println("\n--- Danh sách biên lai tiền điện ---");
        for (BienLai bl : ds131) {
            bl.hienThi131();
        }
    }
}

