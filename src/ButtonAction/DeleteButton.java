package ButtonAction;

import GSach.XLSach;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteButton implements ActionListener {
    private JComboBox<Integer> cbNamXB;
    private Runnable refreshTable;

    public DeleteButton(JComboBox<Integer> cbNamXB, Runnable refreshTable) {
        this.cbNamXB = cbNamXB;
        this.refreshTable = refreshTable;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        XLSach xls = new XLSach();
        int namXB = (int) cbNamXB.getSelectedItem();
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete books published in " + namXB + "?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            xls.deleteSA(namXB);
            JOptionPane.showMessageDialog(null, "Deleted successfully!");
            refreshTable.run();
        }
    }
}
