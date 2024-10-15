package Ktra;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private JTable orderTable;
    private DefaultTableModel tableModel;
    private JTextField orderIdField, customerIdField, customerNameField, itemField, priceField;
    private JButton updateButton;

    public GUI() {
        setTitle("Quan Ly Don Hang");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        JPanel tablePanel = new JPanel(new BorderLayout());
        tableModel = new DefaultTableModel(new String[]{"Order ID", "Customer ID", "Customer Name", "Items", "Total Cost"}, 0);
        orderTable = new JTable(tableModel);
        tablePanel.add(new JScrollPane(orderTable), BorderLayout.CENTER);


        JPanel formPanel = new JPanel(new GridLayout(6, 2));
        formPanel.add(new JLabel("Order ID:"));
        orderIdField = new JTextField();
        formPanel.add(orderIdField);

        formPanel.add(new JLabel("Customer ID:"));
        customerIdField = new JTextField();
        formPanel.add(customerIdField);

        formPanel.add(new JLabel("Customer Name:"));
        customerNameField = new JTextField();
        formPanel.add(customerNameField);

        formPanel.add(new JLabel("Item:"));
        itemField = new JTextField();
        formPanel.add(itemField);

        formPanel.add(new JLabel("Price:"));
        priceField = new JTextField();
        formPanel.add(priceField);

        updateButton = new JButton("Update Order");
        formPanel.add(updateButton);

        add(tablePanel, BorderLayout.CENTER);
        add(formPanel, BorderLayout.SOUTH);

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        setVisible(true);
    }

    public void loadOrders() {

    }
}