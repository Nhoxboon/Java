package GSach;

public class TaiLieu {
    protected String maSach;
    protected String tenSach;

    public TaiLieu() {
    }

    public TaiLieu(String maSach, String tenSach) {
        this.maSach = maSach;
        this.tenSach = tenSach;
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

    public double thanhTien(int namXB, double giaBan) {
        if (namXB < 2015) {
            return giaBan * 0.85;
        }
        return giaBan * 0.95;
    }
}
