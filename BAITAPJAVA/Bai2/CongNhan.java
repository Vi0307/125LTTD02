package Bai2;

public class CongNhan extends CanBo {
    private int bac131;

    public CongNhan(String hoTen131, String ngaySinh131, String gioiTinh131, String diaChi131, int bac131) {
        super(hoTen131, ngaySinh131, gioiTinh131, diaChi131);
        this.bac131 = bac131;
    }

    @Override
    public void hienThiThongTin131() {
        super.hienThiThongTin131();
        System.out.println("Bac cong nhan: " + bac131);
    }
}
