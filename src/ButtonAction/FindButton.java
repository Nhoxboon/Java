package ButtonAction;

import GSach.XLSach;
import GSach.Sach;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class FindButton implements ActionListener {
    private JComboBox<String> cbNhaXB;
    private JTextField tfGiaB;
    private Runnable refreshTable;

    public FindButton(JComboBox<String> cbNhaXB, JTextField tfGiaB, Runnable refreshTable) {
        this.cbNhaXB = cbNhaXB;
        this.tfGiaB = tfGiaB;
        this.refreshTable = refreshTable;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nhaXB = (String) cbNhaXB.getSelectedItem();
        double giaBan = Double.parseDouble(tfGiaB.getText());
        XLSach xls = new XLSach();
        List<Sach> sachList = xls.getSAbyNXBGB(nhaXB, giaBan);
        //refreshTable.run(sachList);
    }
}