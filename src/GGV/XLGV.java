package GGV;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class XLGV {
    public Connection getCon() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/DLGV", "root", "password");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Giangvien> getGV(String donVi, int soCT) {
        List<Giangvien> giangviens = new ArrayList<>();
        try (Connection con = getCon(); Statement stmt = con.createStatement()) {
            String query = "SELECT * FROM tbGiangvien WHERE Donvi = '" + donVi + "' AND Soct >= " + soCT;
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Giangvien gv = new Giangvien(
                        rs.getInt("MaDD"),
                        rs.getString("Hoten"),
                        rs.getString("GT"),
                        rs.getString("Donvi"),
                        rs.getInt("Soct")
                );
                giangviens.add(gv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return giangviens;
    }
}