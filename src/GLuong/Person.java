package GLuong;

public class Person {
    protected int maNV;
    protected String hoTen;

    public Person() {
    }

    public Person(int maNV, String hoTen) {
        this.maNV = maNV;
        this.hoTen = hoTen;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
}
