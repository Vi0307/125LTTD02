package Bai3;

public class Sach extends TaiLieu {
    private String tenTacGia131;
    private int soTrang131;

    public Sach(String maTaiLieu131, String tenNXB131, int soBanPH131, String tenTacGia131, int soTrang131) {
        super(maTaiLieu131, tenNXB131, soBanPH131);
        this.tenTacGia131 = tenTacGia131;
        this.soTrang131 = soTrang131;
    }

    @Override
    public void hienThiThongTin131() {
        super.hienThiThongTin131();
        System.out.println("Tac gia: " + tenTacGia131);
        System.out.println("So trang: " + soTrang131);
    }
}
