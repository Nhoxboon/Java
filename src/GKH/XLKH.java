package GKH;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class XLKH implements IKhachhang {

    private Connection cn;


    @Override
    public Connection getCon() {
        try {
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DLKH", "root", "15062004");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cn;
    }

    @Override
    public Khachhang getbySTK(int SoTK) {
        String sql = "SELECT * FROM tbKH WHERE SoTK = ?";
        Khachhang kh = null;
        try {
            cn = getCon();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, SoTK);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                kh = new Khachhang(rs.getInt("SoTK"),
                        rs.getString("Hoten"),
                        rs.getString("GT"),
                        rs.getString("Diachi"),
                        rs.getDouble("Sodu"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kh;
    }

    @Override
    public void updateKH(Khachhang kh) {
        String sql = "UPDATE tbKH SET Hoten = ?, GT = ?, Diachi = ?, Sodu = ? WHERE SoTK = ?";
        try {
            cn = getCon();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, kh.getHoten());
            ps.setString(2, kh.getGT());
            ps.setString(3, kh.getDiachi());
            ps.setDouble(4, kh.getSodu());
            ps.setInt(5, kh.getSoTK());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}