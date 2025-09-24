package Bai5;

// Nguoi.java
public class Nguoi {
    private String hoTen;
    private int namSinh;
    private String ngheNghiep;

    public Nguoi(String hoTen, int namSinh, String ngheNghiep) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.ngheNghiep = ngheNghiep;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void hienThiThongTin() {
        System.out.println("Họ tên: " + hoTen + ", Năm sinh: " + namSinh + ", Nghề nghiệp: " + ngheNghiep);
    }
}

