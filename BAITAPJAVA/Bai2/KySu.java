package Bai2;

public class KySu extends CanBo {
    private String nganhDaoTao131;

    public KySu(String hoTen131, String ngaySinh131, String gioiTinh131, String diaChi131, String nganhDaoTao131) {
        super(hoTen131, ngaySinh131, gioiTinh131, diaChi131);
        this.nganhDaoTao131 = nganhDaoTao131;
    }

    @Override
    public void hienThiThongTin131() {
        super.hienThiThongTin131();
        System.out.println("Nganh dao tao: " + nganhDaoTao131);
    }
}
