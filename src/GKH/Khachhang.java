package GKH;

public class Khachhang {
    private int SoTK;
    private String Hoten;
    private String GT;
    private String Diachi;
    private double Sodu;

    public Khachhang() {

    }

    public Khachhang(int soTK, String hoten, String GT, String diachi, double sodu) {
        SoTK = soTK;
        Hoten = hoten;
        this.GT = GT;
        Diachi = diachi;
        Sodu = sodu;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    public int getSoTK() {
        return SoTK;
    }

    public void setSoTK(int soTK) {
        SoTK = soTK;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public String getGT() {
        return GT;
    }

    public void setGT(String GT) {
        this.GT = GT;
    }

    public double getSodu() {
        return Sodu;
    }

    public void setSodu(double sodu) {
        Sodu = sodu;
    }
}