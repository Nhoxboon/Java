package GSach;

public class Sach {
    public String maSach;
    public String tenSach;
    public String nhaXB;
    public int namXB;
    public double giaBan;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, String nhaXB, int namXB, double giaBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.nhaXB = nhaXB;
        this.namXB = namXB;
        this.giaBan = giaBan;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public int getNamXB() {
        return namXB;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public double KhuyenMai() {
        if (namXB < 2019) {
            return giaBan * 0.25;
        }
        return giaBan;
    }
}
