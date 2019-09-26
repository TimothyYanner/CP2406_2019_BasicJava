package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton2 {
    public static void main(String[] args) {
        JFrame aFrame = new JFrame("JFrameDisableButton");
        aFrame.setLayout(new FlowLayout());
        aFrame.setSize(600, 600);
        JButton button = new JButton("Click to disable");
        aFrame.add(button);
        JLabel label = new JLabel("");
        aFrame.add(label);
        final int[] pressCount = {0};
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pressCount[0] += 1;
                if (pressCount[0] > 8) {
                    button.setEnabled(false);
                    label.setText("That's enough!");
                }
            }
        });
        aFrame.setVisible(true);
    }
}
