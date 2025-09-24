package Bai4;

// ThiSinh131.java
public class ThiSinh131 {
    private String soBaoDanh131;
    private String hoTen131;
    private String diaChi131;
    private String uuTien131;

    public ThiSinh131(String soBaoDanh131, String hoTen131, String diaChi131, String uuTien131) {
        this.soBaoDanh131 = soBaoDanh131;
        this.hoTen131 = hoTen131;
        this.diaChi131 = diaChi131;
        this.uuTien131 = uuTien131;
    }

    public String getSoBaoDanh131() {
        return soBaoDanh131;
    }

    public void hienThiThongTin131() {
        System.out.println("SBD: " + soBaoDanh131 + ", Họ tên: " + hoTen131 +
                ", Địa chỉ: " + diaChi131 + ", Ưu tiên: " + uuTien131);
    }
}

