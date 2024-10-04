package GGV;

public class Giangvien extends Person {
    private String donVi;
    private int soCT;

    public Giangvien() {
    }

    public Giangvien(int maDD, String hoTen, String gioiTinh, String donVi, int soCT) {
        super(maDD, hoTen, gioiTinh);
        this.donVi = donVi;
        this.soCT = soCT;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public int getSoCT() {
        return soCT;
    }

    public void setSoCT(int soCT) {
        this.soCT = soCT;
    }

    @Override
    public String xetThuong() {
        return soCT > 10 ? "Khen thưởng" : "Không khen thưởng";
    }
}