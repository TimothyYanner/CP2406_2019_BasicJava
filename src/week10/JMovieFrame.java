package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMovieFrame extends JFrame implements ActionListener {

    JButton nb = new JButton("Norm of the North");
    JButton eb = new JButton("The East");
    JButton sb = new JButton("South Park: Bigger, Longer and Uncut");
    JButton wb = new JButton("West Side Story");
    JButton cb = new JButton("Journey to the Center of the Earth");
    JPanel centerPanel = new JPanel();
    JTextArea information = new JTextArea("");

    public JMovieFrame() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1080, 720);
        setVisible(true);
        setLayout(new BorderLayout());
        add(nb, BorderLayout.NORTH);
        add(eb, BorderLayout.EAST);
        add(sb, BorderLayout.SOUTH);
        add(wb, BorderLayout.WEST);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weighty = 0.5;
        gbc.weightx = 1;
        centerPanel.add(cb, gbc);
        gbc.gridy = 1;
        centerPanel.add(information, gbc);
        nb.addActionListener(this);
        eb.addActionListener(this);
        sb.addActionListener(this);
        wb.addActionListener(this);
        cb.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == nb) {
            information.setText("Year of Release: 2016\nStarring: Rob Schneider");
        } else if (source == eb) {
            information.setText("Year of Release: 2013\nStarring: Ellen Page");
        } else if (source == sb) {
            information.setText("Year of Release: 1999\nStarring: Trey Parker");
        } else if (source == wb) {
            information.setText("Year of Release: 2020\nStarring: Ansel Elgort");
        } else if (source == cb) {
            information.setText("Year of Release: 2008\nStarring: Brendan Fraser");
        }
    }

    public static void main(String[] args) {
        JMovieFrame jMovieFrame = new JMovieFrame();
    }
}
