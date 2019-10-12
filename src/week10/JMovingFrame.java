package week10;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Random;

public class JMovingFrame extends JFrame implements ActionListener {

    Random random = new Random();

    JPanel left = new JPanel(), middle = new JPanel(), right = new JPanel();
    JButton moveBtn = new JButton("Move Label");
    JLabel movableLabel1 = new JLabel("Move me");
    JLabel movableLabel2 = new JLabel("Move me");
    JLabel movableLabel3 = new JLabel("Move me");

    JLabel[] labels = {movableLabel1, movableLabel2, movableLabel3};

    public JMovingFrame() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        setSize(900, 720);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.gridwidth = 3;
        add(moveBtn, gbc);
        moveBtn.addActionListener(this);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        add(left, gbc);
        left.setOpaque(true);
        left.setBackground(Color.BLUE);
        gbc.gridx = 1;
        add(middle, gbc);
        gbc.gridx = 2;
        add(right, gbc);
        right.setOpaque(true);
        right.setBackground(Color.BLUE);
        setVisible(true);
        left.setLayout(new GridBagLayout());
        middle.setLayout(new GridBagLayout());
        right.setLayout(new GridBagLayout());
        gbc.fill = GridBagConstraints.NONE;
        gbc.gridx = 0;
        gbc.gridy = 0;
        left.setPreferredSize(new Dimension(300, 360));
        middle.setPreferredSize(new Dimension(290, 360));
        right.setPreferredSize(new Dimension(290, 360));
        left.add(movableLabel1, gbc);
        middle.add(movableLabel2, gbc);
        right.add(movableLabel3, gbc);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        movableLabel1.setVisible(false);
        movableLabel2.setVisible(false);
        movableLabel3.setVisible(false);
        int randomIndex = random.nextInt(3);
        labels[randomIndex].setVisible(true);
    }

    public static void main(String[] args) {
        JMovingFrame jMovingFrame = new JMovingFrame();
    }
}
