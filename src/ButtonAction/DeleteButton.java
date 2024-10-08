package ButtonAction;

import GLuong.XLLuong;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteButton implements ActionListener {

    private JTextField txtMaNV;

    public DeleteButton(JTextField txtMaNV) {
        this.txtMaNV = txtMaNV;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int maNV = Integer.parseInt(txtMaNV.getText());
        XLLuong xl = new XLLuong();
        xl.deleteNV(maNV);
    }
}
