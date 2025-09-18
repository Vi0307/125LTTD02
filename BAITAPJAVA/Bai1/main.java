public class main {
    public static void main(String[] args) {
        PhanSo sp1_131 = new PhanSo(2, 3);
        PhanSo sp2_131 = new PhanSo(4, 5);

        PhanSo spTong_131 = sp1_131.cong(sp2_131);

        System.out.println("Phân số 1: " + sp1_131);
        System.out.println("Phân số 2: " + sp2_131);
        System.out.println("Tổng: " + spTong_131);

        System.out.println("Hiệu: " + sp1_131.tru(sp2_131));
        System.out.println("Tích: " + sp1_131.nhan(sp2_131));
        System.out.println("Thương: " + sp1_131.chia(sp2_131));

        System.out.println("Phân số 1 có tối giản không? " + sp1_131.laToiGian());
        System.out.println("Phân số 2 dạng tối giản: " + sp2_131.rutGon());
    }
}
