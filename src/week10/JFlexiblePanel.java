package week10;

import javax.swing.*;
import java.awt.*;

public class JFlexiblePanel extends JPanel {
    public JFlexiblePanel(Color backgroundColour, Color foregroundColour, Font font, String text) {
        setBackground(backgroundColour);
        setFont(font);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel jLabel = new JLabel(text);
        jLabel.setForeground(foregroundColour);
        add(jLabel);
    }
}
