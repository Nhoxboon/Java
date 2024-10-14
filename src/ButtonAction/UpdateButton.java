package ButtonAction;

import GKH.Khachhang;
import GKH.XLKH;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateButton implements ActionListener {
    private JTextField txtSoTK, txtHoten, txtGT, txtSodu;
    private JComboBox<String> cbDiachi;

    public UpdateButton(JTextField txtSoTK, JTextField txtHoten, JTextField txtGT, JTextField txtSodu, JComboBox<String> cbDiachi) {
        this.txtSoTK = txtSoTK;
        this.txtHoten = txtHoten;
        this.txtGT = txtGT;
        this.txtSodu = txtSodu;
        this.cbDiachi = cbDiachi;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int SoTK = Integer.parseInt(txtSoTK.getText());
        XLKH xlkh = new XLKH();
        String HoTen = txtHoten.getText();
        String GT = txtGT.getText();
        String DiaChi = (String) cbDiachi.getSelectedItem();
        double SoDu = Double.parseDouble(txtSodu.getText());

        Khachhang kh = new Khachhang(SoTK, HoTen, GT, DiaChi, SoDu);
        xlkh.updateKH(kh);
        JOptionPane.showMessageDialog(null, "Update thanh cong");
    }
}
