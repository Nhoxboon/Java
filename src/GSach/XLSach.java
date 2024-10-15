package GSach;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class XLSach implements ISach {
    private Connection cn;

    @Override
    public Connection getCon() {
        try {
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DLSachF", "root", "15062004");
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
                s.setNhaXB(rs.getString("NhaXB"));
                s.setNamXB(rs.getInt("NamXB"));
                s.setGiaBan(rs.getDouble("GiaB"));
                sachList.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sachList;
    }

    @Override
    public List<Sach> getSAbyNXBGB(String nhaXB, double giaBan) {
        List<Sach> sachList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM tbSach WHERE NhaXB = ? AND GiaB <= ?";
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, nhaXB);
            ps.setDouble(2, giaBan);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Sach s = new Sach();
                s.setMaSach(rs.getString("MaS"));
                s.setTenSach(rs.getString("TenS"));
                s.setNhaXB(rs.getString("NhaXB"));
                s.setNamXB(rs.getInt("NamXB"));
                s.setGiaBan(rs.getDouble("GiaB"));
                sachList.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sachList;
    }

    public void deleteSA(String nhaXB) {
        try {
            String sql = "DELETE FROM tbSach WHERE NhaXB = ?";
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, nhaXB);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}