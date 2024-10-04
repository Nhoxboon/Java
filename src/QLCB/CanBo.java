package QLCB;

public class CanBo {
    private String SoTK;
    private String HoTen;
    private String GT;
    private String Diachi;
    private float Luong;

    public CanBo() {
    }

    public CanBo(String SoTK, String HoTen, String GT, String Diachi, float Luong) {
        this.SoTK = SoTK;
        this.HoTen = HoTen;
        this.GT = GT;
        this.Diachi = Diachi;
        this.Luong = Luong;
    }

    public String getSoTK() {
        return SoTK;
    }

    public void setSoTK(String soTK) {
        SoTK = soTK;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getGT() {
        return GT;
    }

    public void setGT(String GT) {
        this.GT = GT;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    public float getLuong() {
        return Luong;
    }

    public void setLuong(float luong) {
        Luong = luong;
    }
}