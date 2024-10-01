package bTap;

import javax.swing.*;

public class FlowLayout extends JFrame {
    public FlowLayout() {
        setTitle("FlowLayout");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        setLayout(new java.awt.FlowLayout());

        for (int i = 1; i <= 20; i++) {
            add(new JButton("Button " + i));
        }
    }
}
