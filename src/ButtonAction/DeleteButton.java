package ButtonAction;

import GSach.XLSach;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteButton implements ActionListener {
    private JComboBox<String> cbNhaXB;
    private Runnable refreshTable;

    public DeleteButton(JComboBox<String> cbNamXB, Runnable refreshTable) {
        this.cbNhaXB = cbNamXB;
        this.refreshTable = refreshTable;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        XLSach xls = new XLSach();
        String nhaXB = (String) cbNhaXB.getSelectedItem();
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete books published in " + nhaXB + "?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            xls.deleteSA(nhaXB);
            JOptionPane.showMessageDialog(null, "Deleted successfully!");
            refreshTable.run();
        }
    }
}
