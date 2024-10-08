package GLuong;

public class Nhanvien extends Person {
    protected double luong;
    protected String diaChi;

    public Nhanvien() {
    }

    public Nhanvien(int maNV, String hoTen, String diaChi, double luong) {
        super(maNV, hoTen);
        this.diaChi = diaChi;
        this.luong = luong;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
