package ButtonAction;

import GLuong.Nhanvien;
import GLuong.XLLuong;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsertButton implements ActionListener {

    private JTextField txtMaNV, txtHoTen, txtDiachi, txtLuong;

    public InsertButton(JTextField txtMaNV, JTextField txtHoTen, JTextField txtDiachi, JTextField txtLuong) {
        this.txtMaNV = txtMaNV;
        this.txtHoTen = txtHoTen;
        this.txtDiachi = txtDiachi;
        this.txtLuong = txtLuong;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int maNV = Integer.parseInt(txtMaNV.getText());
        String hoTen = txtHoTen.getText();
        String diaChi = txtDiachi.getText();
        double luong = Double.parseDouble(txtLuong.getText());

        Nhanvien nv = new Nhanvien(maNV, hoTen, diaChi, luong);
        XLLuong xl = new XLLuong();
        xl.insertNV(nv);
    }
}
