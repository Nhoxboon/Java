package ButtonAction;

import GLuong.Nhanvien;
import GLuong.XLLuong;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateButton implements ActionListener {
    private JTextField txtMaNV, txtHoTen, txtDiachi, txtLuong;

    public UpdateButton(JTextField txtMaNV, JTextField txtHoTen, JTextField txtDiachi, JTextField txtLuong) {
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
        XLLuong xl = new XLLuong();
        Nhanvien nv = new Nhanvien(maNV, hoTen, diaChi, luong);
        xl.updateNV(nv);
    }
}
