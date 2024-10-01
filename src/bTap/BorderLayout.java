package bTap;

import javax.swing.*;
import java.awt.*;

public class BorderLayout extends JFrame {
    private JButton
            bn = new JButton("North"),
            bs = new JButton("South"),
            bw = new JButton("West"),
            be = new JButton("East"),
            bc = new JButton("Center");

    public BorderLayout() {

        // setResizable(false);


        bn.setBackground(Color.red);
        bn.setForeground(Color.blue);
        bn.setOpaque(true);
        bn.setBorderPainted(false);

        be.setBackground(Color.blue);
        be.setForeground(Color.yellow);
        be.setOpaque(true);
        be.setBorderPainted(false);

        bw.setBackground(Color.green);
        bw.setForeground(Color.cyan);
        bw.setOpaque(true);
        bw.setBorderPainted(false);

        bs.setBackground(Color.yellow);
        bs.setForeground(Color.blue);
        bs.setOpaque(true);
        bs.setBorderPainted(false);
        
        bc.setBackground(Color.black);
        bc.setForeground(Color.pink);
        bc.setOpaque(true);
        bc.setBorderPainted(false);


        add(java.awt.BorderLayout.NORTH, bn);
        add(java.awt.BorderLayout.SOUTH, bs);
        add(java.awt.BorderLayout.WEST, bw);
        add(java.awt.BorderLayout.EAST, be);
        add(java.awt.BorderLayout.CENTER, bc);

        setTitle("Border Layout");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }
}
