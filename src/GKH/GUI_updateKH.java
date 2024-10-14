package GKH;

import ButtonAction.FindButton;
import ButtonAction.UpdateButton;

import javax.swing.*;

public class GUI_updateKH extends JFrame {
    private JComboBox<String> cbDiachi;
    private JTextField txtSoTK, txtHoten, txtGT, txtSodu;
    private JButton btnUpdate, btnSearch;
    private XLKH xlkh;

    public GUI_updateKH() {
        xlkh = new XLKH();
        setTitle("DAKH");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lbSoTK = new JLabel("SoTK");
        lbSoTK.setBounds(20, 20, 100, 30);
        add(lbSoTK);

        JLabel lbHoTen = new JLabel("Ho ten");
        lbHoTen.setBounds(20, 60, 100, 30);
        add(lbHoTen);

        JLabel lbGT = new JLabel("Gioi tinh");
        lbGT.setBounds(20, 100, 100, 30);
        add(lbGT);

        JLabel lbDiaChi = new JLabel("Dia chi");
        lbDiaChi.setBounds(20, 140, 100, 30);
        add(lbDiaChi);

        JLabel lbSoDu = new JLabel("So du");
        lbSoDu.setBounds(20, 180, 100, 30);
        add(lbSoDu);

        txtSoTK = new JTextField();
        txtSoTK.setBounds(120, 20, 200, 30);
        add(txtSoTK);

        txtHoten = new JTextField();
        txtHoten.setBounds(120, 60, 200, 30);
        add(txtHoten);

        txtGT = new JTextField();
        txtGT.setBounds(120, 100, 200, 30);
        add(txtGT);

        cbDiachi = new JComboBox<>(new String[]{"Ha Noi", "Da Nang", "Can Tho"});
        cbDiachi.setBounds(120, 140, 200, 30);
        add(cbDiachi);

        txtSodu = new JTextField();
        txtSodu.setBounds(120, 180, 200, 30);
        add(txtSodu);

        btnSearch = new JButton("Search");
        btnSearch.setBounds(20, 220, 100, 30);
        add(btnSearch);

        btnUpdate = new JButton("Update");
        btnUpdate.setBounds(220, 220, 100, 30);
        add(btnUpdate);

        btnSearch.addActionListener(new FindButton(txtSoTK, txtHoten, txtGT, txtSodu, cbDiachi));
        btnUpdate.addActionListener(new UpdateButton(txtSoTK, txtHoten, txtGT, txtSodu, cbDiachi));
        setVisible(true);
    }
}
