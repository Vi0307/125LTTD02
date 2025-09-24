package Bai4;

// ThiSinhKhoiC131.java
public class ThiSinhKhoiC131 extends ThiSinh131 {
    public ThiSinhKhoiC131(String soBaoDanh131, String hoTen131, String diaChi131, String uuTien131) {
        super(soBaoDanh131, hoTen131, diaChi131, uuTien131);
    }

    @Override
    public void hienThiThongTin131() {
        super.hienThiThongTin131();
        System.out.println("Khối thi: C (Văn, Sử, Địa)");
    }
}

