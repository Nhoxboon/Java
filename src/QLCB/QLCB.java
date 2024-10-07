package QLCB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class QLCB implements ICanBo {
    private Connection cn;

    @Override
    public Connection getCon() {
        try {
            if (cn == null || cn.isClosed()) {
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/QLCB", "root", "15062004");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cn;
    }

    @Override
    public boolean insertCB(CanBo canBo) {
        String sql = "INSERT INTO tbCanBo (SoTK, Hoten, GT, Diachi, Luong) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = getCon().prepareStatement(sql)) {
            ps.setString(1, canBo.getSoTK());
            ps.setString(2, canBo.getHoTen());
            ps.setString(3, canBo.getGT());
            ps.setString(4, canBo.getDiachi());
            ps.setFloat(5, canBo.getLuong());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}