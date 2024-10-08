package GLuong;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public class XLLuong {
    private Connection cn;

    public Connection getCon() {
        try {
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DLLuong", "root", "15062004");
            return cn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Nhanvien getNVbyMa(int maNV) {
        String sql = "SELECT * FROM tbNhanvien WHERE MaNV = " + maNV;
        Nhanvien nv = null;
        try {
            cn = getCon();
            var ps = cn.prepareStatement(sql);
            var rs = ps.executeQuery();
            if (rs.next()) {
                nv = new Nhanvien(rs.getInt("MaNV"),
                        rs.getString("HoTen"),
                        rs.getString("DiaChi"),

                        rs.getDouble("Luong"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nv;
    }

    public Nhanvien updateNV(Nhanvien nv) {
        String sql = "UPDATE tbNhanvien SET HoTen = ?, DiaChi = ?, Luong = ? WHERE MaNV = ?";
        try {
            cn = getCon();
            var ps = cn.prepareStatement(sql);
            ps.setString(1, nv.getHoTen());
            ps.setString(2, nv.getDiaChi());
            ps.setDouble(3, nv.getLuong());
            ps.setInt(4, nv.getMaNV());

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nv;
    }

    public Nhanvien insertNV(Nhanvien nv) {
        String sql = "INSERT INTO tbNhanvien VALUES(?, ?, ?, ?)";
        try {
            cn = getCon();
            var ps = cn.prepareStatement(sql);
            ps.setInt(1, nv.getMaNV());
            ps.setString(2, nv.getHoTen());
            ps.setString(3, nv.getDiaChi());
            ps.setDouble(4, nv.getLuong());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nv;
    }

    public void deleteNV(int maNV) {
        String sql = "DELETE FROM tbNhanvien WHERE MaNV = ?";
        try {
            cn = getCon();
            var ps = cn.prepareStatement(sql);
            ps.setInt(1, maNV);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
