package Bai5;

import java.util.ArrayList;
import java.util.Scanner;

public class HoGiaDinh {
    private int soThanhVien;
    private String soNha;
    private ArrayList<Nguoi> dsNguoi;

    public HoGiaDinh() {
        dsNguoi = new ArrayList<>();
    }

    public void nhapThongTin() {
        Scanner sc131 = new Scanner(System.in);
        System.out.print("Nhập số nhà: ");
        soNha = sc131.nextLine();

        System.out.print("Nhập số thành viên: ");
        soThanhVien = Integer.parseInt(sc131.nextLine());

        for (int i = 0; i < soThanhVien; i++) {
            System.out.println(">> Thành viên " + (i + 1) + ":");
            System.out.print("Họ tên: ");
            String hoTen131 = sc131.nextLine();
            System.out.print("Năm sinh: ");
            int namSinh131 = Integer.parseInt(sc131.nextLine());
            System.out.print("Nghề nghiệp: ");
            String nghe131 = sc131.nextLine();

            dsNguoi.add(new Nguoi(hoTen131, namSinh131, nghe131));
        }
    }

    public void hienThiThongTin() {
        System.out.println("\n--- Hộ gia đình số nhà " + soNha + " ---");
        for (Nguoi n131 : dsNguoi) {
            n131.hienThiThongTin();
        }
    }

    public boolean coNguoi80Tuoi(int namHienTai131) {
        for (Nguoi n131 : dsNguoi) {
            int tuoi131 = namHienTai131 - n131.getNamSinh();
            if (tuoi131 == 80) {
                return true;
            }
        }
        return false;
    }
}

