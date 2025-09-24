package Bai2;

public class NhanVien extends CanBo {
    private String congViec131;

    public NhanVien(String hoTen131, String ngaySinh131, String gioiTinh131, String diaChi131, String congViec131) {
        super(hoTen131, ngaySinh131, gioiTinh131, diaChi131);
        this.congViec131 = congViec131;
    }

    @Override
    public void hienThiThongTin131() {
        super.hienThiThongTin131();
        System.out.println("Cong viec: " + congViec131);
    }
}

