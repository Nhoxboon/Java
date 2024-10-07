package QLCB;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuilnsertCB extends JFrame {
    private JTextField txtSoTK, txtHoTen, txtGT, txtDiachi, txtLuong;
    private JButton btnInsert;

    public GuilnsertCB() {
        setTitle("Thêm Cán Bộ");
        setSize(400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblSoTK = new JLabel("Số tài khoản:");
        lblSoTK.setBounds(20, 20, 100, 25);
        add(lblSoTK);

        txtSoTK = new JTextField();
        txtSoTK.setBounds(130, 20, 200, 25);
        add(txtSoTK);

        JLabel lblHoTen = new JLabel("Họ tên:");
        lblHoTen.setBounds(20, 60, 100, 25);
        add(lblHoTen);

        txtHoTen = new JTextField();
        txtHoTen.setBounds(130, 60, 200, 25);
        add(txtHoTen);

        JLabel lblGT = new JLabel("Giới tính:");
        lblGT.setBounds(20, 100, 100, 25);
        add(lblGT);

        txtGT = new JTextField();
        txtGT.setBounds(130, 100, 200, 25);
        add(txtGT);

        JLabel lblDiachi = new JLabel("Địa chỉ:");
        lblDiachi.setBounds(20, 140, 100, 25);
        add(lblDiachi);

        txtDiachi = new JTextField();
        txtDiachi.setBounds(130, 140, 200, 25);
        add(txtDiachi);

        JLabel lblLuong = new JLabel("Lương:");
        lblLuong.setBounds(20, 180, 100, 25);
        add(lblLuong);

        txtLuong = new JTextField();
        txtLuong.setBounds(130, 180, 200, 25);
        add(txtLuong);

        btnInsert = new JButton("Thêm");
        btnInsert.setBounds(150, 220, 100, 25);
        add(btnInsert);

        btnInsert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String soTK = txtSoTK.getText();
                String hoTen = txtHoTen.getText();
                String GT = txtGT.getText();
                String diachi = txtDiachi.getText();
                float luong = Float.parseFloat(txtLuong.getText());

                CanBo canBo = new CanBo(soTK, hoTen, GT, diachi, luong);
                QLCB qlcb = new QLCB();
                if (qlcb.insertCB(canBo)) {
                    JOptionPane.showMessageDialog(null, "Thêm thành công");
                } else {
                    JOptionPane.showMessageDialog(null, "Thêm không thành công");
                }
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GuilnsertCB();
    }
}