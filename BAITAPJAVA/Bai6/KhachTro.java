package Bai6;

// KhachTro.java
// KhachTro.java
public class KhachTro extends Nguoi {
    private int soNgayTro131;
    private String loaiPhong131;
    private double giaPhong131;

    public KhachTro(String hoTen131, String ngaySinh131, String cmnd131,
                    int soNgayTro131, String loaiPhong131, double giaPhong131) {
        super(hoTen131, ngaySinh131, cmnd131);
        this.soNgayTro131 = soNgayTro131;
        this.loaiPhong131 = loaiPhong131;
        this.giaPhong131 = giaPhong131;
    }

    public double tinhTien131() {
        return soNgayTro131 * giaPhong131;
    }

    @Override
    public void hienThiThongTin131() {
        super.hienThiThongTin131();
        System.out.println("Số ngày trọ: " + soNgayTro131 +
                           ", Loại phòng: " + loaiPhong131 +
                           ", Giá phòng: " + giaPhong131);
    }
}

