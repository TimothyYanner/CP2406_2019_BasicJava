package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class JColourFrame extends JFrame implements ActionListener {

    Random random = new Random();

    java.awt.Color[] colours = {Color.BLACK, Color.BLUE, Color.ORANGE, Color.PINK, Color.RED, Color.YELLOW, Color.CYAN, Color.GREEN};

    JPanel north = new JPanel();
    JPanel east = new JPanel();
    JPanel south = new JPanel();
    JPanel west = new JPanel();
    JButton btn = new JButton("Click to randomise a sections colour");

    javax.swing.JPanel[] panels = {north, south, east, west};

    public JColourFrame() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(1080, 720);
        add(north, BorderLayout.NORTH);
        north.setOpaque(true);
        north.setPreferredSize(new Dimension(680, 200));
        add(east, BorderLayout.EAST);
        east.setOpaque(true);
        east.setPreferredSize(new Dimension(200, 720));
        add(south, BorderLayout.SOUTH);
        south.setOpaque(true);
        south.setPreferredSize(new Dimension(680, 200));
        add(west, BorderLayout.WEST);
        west.setOpaque(true);
        west.setPreferredSize(new Dimension(200, 720));
        add(btn, BorderLayout.CENTER);
        btn.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int randomColourIndex = random.nextInt(8);
        int randomPanelIndex = random.nextInt(4);
        panels[randomPanelIndex].setBackground(colours[randomColourIndex]);
    }

    public static void main(String[] args) {
        JColourFrame jColourFrame = new JColourFrame();
    }
}
