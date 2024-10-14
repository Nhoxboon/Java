package ButtonAction;

import GKH.Khachhang;
import GKH.XLKH;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FindButton implements ActionListener {
    private JTextField txtSoTK, txtHoten, txtGT, txtSodu;
    private JComboBox<String> cbDiachi;

    public FindButton(JTextField txtSoTK, JTextField txtHoten, JTextField txtGT, JTextField txtSodu, JComboBox<String> cbDiachi) {
        this.txtSoTK = txtSoTK;
        this.txtHoten = txtHoten;
        this.txtGT = txtGT;
        this.txtSodu = txtSodu;
        this.cbDiachi = cbDiachi;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int SoTk = Integer.parseInt(txtSoTK.getText());
        XLKH xlkh = new XLKH();
        Khachhang kh = xlkh.getbySTK(SoTk);
        if (kh != null) {
            txtHoten.setText(kh.getHoten());
            txtGT.setText(kh.getGT());
            cbDiachi.setSelectedItem(kh.getDiachi());
            txtSodu.setText(String.valueOf(kh.getSodu()));
        } else {
            JOptionPane.showMessageDialog(null, "Khong tim thay khach hang");
        }
    }
}
