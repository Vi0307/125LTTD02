package Bai3;

public class TapChi extends TaiLieu {
    private int soPhatHanh131;
    private int thangPH131;

    public TapChi(String maTaiLieu131, String tenNXB131, int soBanPH131, int soPhatHanh131, int thangPH131) {
        super(maTaiLieu131, tenNXB131, soBanPH131);
        this.soPhatHanh131 = soPhatHanh131;
        this.thangPH131 = thangPH131;
    }

    @Override
    public void hienThiThongTin131() {
        super.hienThiThongTin131();
        System.out.println("So phat hanh: " + soPhatHanh131);
        System.out.println("Thang phat hanh: " + thangPH131);
    }
}

