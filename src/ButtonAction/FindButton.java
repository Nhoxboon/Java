package ButtonAction;

import GLuong.Nhanvien;
import GLuong.XLLuong;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FindButton implements ActionListener {
    private JTextField txtMaNV, txtHoTen, txtDiachi, txtLuong;

    public FindButton(JTextField txtMaNV, JTextField txtHoTen, JTextField txtDiachi, JTextField txtLuong) {
        this.txtMaNV = txtMaNV;
        this.txtHoTen = txtHoTen;
        this.txtDiachi = txtDiachi;
        this.txtLuong = txtLuong;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int maNV = Integer.parseInt(txtMaNV.getText());
        XLLuong xl = new XLLuong();
        Nhanvien nv = xl.getNVbyMa(maNV);
        txtHoTen.setText(nv.getHoTen());
        txtDiachi.setText(nv.getDiaChi());
        txtLuong.setText(nv.getLuong() + "");
    }
}

