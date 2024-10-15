package GSach;

import ButtonAction.DeleteButton;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import java.util.Objects;

public class GUI_delSA extends JFrame {
    JComboBox<Integer> cbNamXB;
    JButton btnDel;
    JTable sachTable;
    XLSach xls;

    public GUI_delSA() {
        xls = new XLSach();
        setTitle("DASach");
        setSize(600, 400);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cbNamXB = new JComboBox<>(new Integer[]{2019, 2020, 2021});
        btnDel = new JButton("Delete");
        sachTable = new JTable();
        JScrollPane scrollPane = new JScrollPane(sachTable);

        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("NamXB:"));
        topPanel.add(cbNamXB);
        topPanel.add(btnDel);

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        loadTableData();
        btnDel.addActionListener(new DeleteButton(cbNamXB, this::loadTableData));

        setVisible(true);
    }

    private void loadTableData() {
        List<Sach> sachList = xls.getSA();
        String[] columns = {"MaSach", "TenSach", "NamXB", "GiaBan", "ThanhTien"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        for (Sach sach : sachList) {
            Object[] row = {
                    sach.getMaSach(),
                    sach.getTenSach(),
                    sach.getNamXB(),
                    sach.getGiaBan(),
                    sach.thanhTien()
            };
            model.addRow(row);
        }
        sachTable.setModel(model);
    }
}
