package Ktra;

public class Grocery {
    String nameSP;
    double giaSP;
    String expiryDate;

    public Grocery() {
    }

    public Grocery(String nameSP, double giaSP, String expiryDate) {
        this.nameSP = nameSP;
        this.giaSP = giaSP;
        this.expiryDate = expiryDate;
    }

    public String getNameSP() {
        return nameSP;
    }

    public void setNameSP(String nameSP) {
        this.nameSP = nameSP;
    }

    public double getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}
