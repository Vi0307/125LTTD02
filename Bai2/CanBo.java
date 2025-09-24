package Bai2;
   public class CanBo {
    private String hoTen131;
    private String ngaySinh131;
    private String gioiTinh131;
    private String diaChi131;

    public CanBo(String hoTen131, String ngaySinh131, String gioiTinh131, String diaChi131) {
        this.hoTen131 = hoTen131;
        this.ngaySinh131 = ngaySinh131;
        this.gioiTinh131 = gioiTinh131;
        this.diaChi131 = diaChi131;
    }

    // Getter
    public String getHoTen131() {
        return hoTen131;
    }

    // Setter
    public void setHoTen131(String hoTen131) {
        this.hoTen131 = hoTen131;
    }

    // Hiển thị thông tin (sẽ được override ở lớp con)
    public void hienThiThongTin131() {
        System.out.println("Ho ten: " + hoTen131);
        System.out.println("Ngay sinh: " + ngaySinh131);
        System.out.println("Gioi tinh: " + gioiTinh131);
        System.out.println("Dia chi: " + diaChi131);
    }
}

