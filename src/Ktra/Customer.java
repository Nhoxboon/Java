package Ktra;

public class Customer {
    String name;
    String idKH;

    public Customer() {
    }

    public Customer(String name, String id) {
        this.name = name;
        this.idKH = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdKH() {
        return idKH;
    }

    public void setIdKH(String idKH) {
        this.idKH = idKH;
    }

    @Override
    public String toString() {
        return "Ktra.Customer{" +
                "name='" + name + '\'' +
                ", id='" + idKH + '\'' +
                '}';
    }
}

