package GSach;

import ButtonAction.DeleteButton;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class GUI_findSA extends JFrame {
    JTextField tfGiaB;
    JComboBox<String> cbNhaXB;
    JButton btnDel, btnFind;
    JTable sachTable;
    XLSach xls;

    public GUI_findSA() {
        xls = new XLSach();
        setTitle("DASach");
        setSize(800, 600);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cbNhaXB = new JComboBox<>(new String[]{"Kim Đồng", "Giáo dục", "Thanh niên"});
        tfGiaB = new JTextField(10);
        btnDel = new JButton("Delete");
        btnFind = new JButton("Find");
        sachTable = new JTable();
        JScrollPane scrollPane = new JScrollPane(sachTable);

        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Nha XB:"));
        topPanel.add(cbNhaXB);
        topPanel.add(new JLabel("Gia Ban:"));
        topPanel.add(tfGiaB);
        topPanel.add(btnFind);
        topPanel.add(btnDel);

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);


        btnDel.addActionListener(new DeleteButton(cbNhaXB, this::loadTableData));
        btnFind.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nhaXB = (String) cbNhaXB.getSelectedItem();
                double giaBan = Double.parseDouble(tfGiaB.getText());
                loadTableData(nhaXB, giaBan);
            }
        });

        loadTableData();
        setVisible(true);
    }

    private void loadTableData() {
        List<Sach> sachList = xls.getSA();
        updateTableData(sachList);
    }

    private void loadTableData(String nhaXB, double giaBan) {
        List<Sach> sachList = xls.getSAbyNXBGB(nhaXB, giaBan);
        updateTableData(sachList);
    }

    private void updateTableData(List<Sach> sachList) {
        String[] columns = {"MaSach", "TenSach", "NhaXB", "NamXB", "GiaBan", "KhuyenMai"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        for (Sach sach : sachList) {
            Object[] row = {
                    sach.getMaSach(),
                    sach.getTenSach(),
                    sach.getNhaXB(),
                    sach.getNamXB(),
                    sach.getGiaBan(),
                    sach.KhuyenMai()
            };
            model.addRow(row);
        }
        sachTable.setModel(model);
    }
}
