package Bai3;

public class TaiLieu {
    protected String maTaiLieu131;
    protected String tenNXB131;
    protected int soBanPH131;

    public TaiLieu(String maTaiLieu131, String tenNXB131, int soBanPH131) {
        this.maTaiLieu131 = maTaiLieu131;
        this.tenNXB131 = tenNXB131;
        this.soBanPH131 = soBanPH131;
    }

    public String getMaTaiLieu131() {
        return maTaiLieu131;
    }

    public void hienThiThongTin131() {
        System.out.println("Ma tai lieu: " + maTaiLieu131);
        System.out.println("Nha xuat ban: " + tenNXB131);
        System.out.println("So ban phat hanh: " + soBanPH131);
    }
}
