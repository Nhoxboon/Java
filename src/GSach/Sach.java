package GSach;

public class Sach extends TaiLieu {
    int namXB;
    double giaBan;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, int namXB, double giaBan) {
        super(maSach, tenSach);
        this.namXB = namXB;
        this.giaBan = giaBan;
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
    
    public double thanhTien() {
        return super.thanhTien(namXB, giaBan);
    }
}
