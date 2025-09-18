package Bai3;

public class Bao extends TaiLieu {
    private String ngayPH131;

    public Bao(String maTaiLieu131, String tenNXB131, int soBanPH131, String ngayPH131) {
        super(maTaiLieu131, tenNXB131, soBanPH131);
        this.ngayPH131 = ngayPH131;
    }

    @Override
    public void hienThiThongTin131() {
        super.hienThiThongTin131();
        System.out.println("Ngay phat hanh: " + ngayPH131);
    }
}

