package GSach;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class XLSach {
    private Connection cn;

    public Connection getCon() {
        try {
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DLSach", "root", "15062004");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cn;
    }

    public List<Sach> getSA() {
        List<Sach> sachList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM tbSach";
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Sach s = new Sach();
                s.setMaSach(rs.getString("MaS"));
                s.setTenSach(rs.getString("TenS"));
                s.setNamXB(rs.getInt("NamXB"));
                s.setGiaBan(rs.getDouble("GiaB"));
                sachList.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sachList;
    }

    public void deleteSA(int namXB) {
        try {
            String sql = "DELETE FROM tbSach WHERE namXB = ?";
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, namXB);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}