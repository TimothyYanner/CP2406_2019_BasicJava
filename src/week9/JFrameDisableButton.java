package week9;

import javax.swing.*;
import java.awt.event.*;

public class JFrameDisableButton{
    public static void main(String[] args) {
        JFrame aFrame = new JFrame("JFrameDisableButton");
        aFrame.setSize(600, 600);
        JButton button = new JButton("Click to disable");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setEnabled(false);
            }
        });
        aFrame.add(button);
        aFrame.setVisible(true);
    }
}
