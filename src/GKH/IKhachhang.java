package GKH;

import java.sql.Connection;

public interface IKhachhang {
    Connection getCon();

    Khachhang getbySTK(int SoTK);

    void updateKH(Khachhang kh);
}