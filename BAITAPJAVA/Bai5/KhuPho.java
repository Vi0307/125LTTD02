
package Bai5;

import java.util.ArrayList;
import java.util.Scanner;

public class KhuPho {
    private ArrayList<HoGiaDinh> dsHoGiaDinh;

    public KhuPho() {
        dsHoGiaDinh = new ArrayList<>();
    }

    public void nhapKhuPho() {
        Scanner sc131 = new Scanner(System.in);
        System.out.print("Nhập số hộ dân: ");
        int n131 = Integer.parseInt(sc131.nextLine());

        for (int i = 0; i < n131; i++) {
            System.out.println("\n=== Hộ dân " + (i + 1) + " ===");
            HoGiaDinh ho131 = new HoGiaDinh();
            ho131.nhapThongTin();
            dsHoGiaDinh.add(ho131);
        }
    }

    public void hienThiNguoi80Tuoi(int namHienTai131) {
        System.out.println("\n=== Các hộ có người 80 tuổi trong năm nay ===");
        for (HoGiaDinh ho131 : dsHoGiaDinh) {
            if (ho131.coNguoi80Tuoi(namHienTai131)) {
                ho131.hienThiThongTin();
            }
        }
    }
}

