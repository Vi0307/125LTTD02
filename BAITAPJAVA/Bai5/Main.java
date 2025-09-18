package Bai5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc131 = new Scanner(System.in);
        KhuPho kp131 = new KhuPho();

        kp131.nhapKhuPho();

        System.out.print("\nNhập năm hiện tại: ");
        int nam131 = Integer.parseInt(sc131.nextLine());

        kp131.hienThiNguoi80Tuoi(nam131);
    }
}

