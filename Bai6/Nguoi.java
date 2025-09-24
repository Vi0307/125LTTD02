package Bai6;

// Nguoi.java
// Nguoi.java
public class Nguoi {
    private String hoTen131;
    private String ngaySinh131;
    private String cmnd131;

    public Nguoi(String hoTen131, String ngaySinh131, String cmnd131) {
        this.hoTen131 = hoTen131;
        this.ngaySinh131 = ngaySinh131;
        this.cmnd131 = cmnd131;
    }

    public String getCmnd131() {
        return cmnd131;
    }

    public void hienThiThongTin131() {
        System.out.println("Họ tên: " + hoTen131 + ", Ngày sinh: " + ngaySinh131 + ", CMND: " + cmnd131);
    }
}

