package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFontSelector extends JFrame implements ActionListener {
    JButton arial = new JButton("Arial");
    JButton comicSans = new JButton("Comic Sans MS");
    JButton helvetica = new JButton("Helvetica");
    JButton timesNewRoman = new JButton("Times New Roman");
    JButton wingdings = new JButton("Wingdings");
    JLabel text = new JLabel("The current font is Arial");
    JButton increaseSize = new JButton("Increase Size");
    JButton decreaseSize = new JButton("Decrease Size");
    int textSize;
    String currentFont;

    JFontSelector() {
        textSize = 30;
        currentFont = "Arial";
        setSize(800, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.gridy = 0;
        gbc.gridx = 0;
        add(arial, gbc);
        gbc.gridx = 1;
        add(comicSans, gbc);
        gbc.gridx = 2;
        add(helvetica, gbc);
        gbc.gridx = 3;
        add(timesNewRoman, gbc);
        gbc.gridx = 4;
        add(wingdings, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.gridwidth = 5;
        gbc.weighty = 2;
        add(text, gbc);
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        add(increaseSize, gbc);
        gbc.gridx = 2;
        gbc.gridwidth = 3;
        add(decreaseSize, gbc);
        text.setFont(new Font(currentFont, Font.PLAIN, textSize));
        arial.addActionListener(this);
        comicSans.addActionListener(this);
        helvetica.addActionListener(this);
        timesNewRoman.addActionListener(this);
        wingdings.addActionListener(this);
        increaseSize.addActionListener(this);
        decreaseSize.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == arial) {
            currentFont = "Arial";
            text.setFont(new Font(currentFont, Font.PLAIN, textSize));
            text.setText("The current font is Arial");
        } else if (source == comicSans) {
            currentFont = "Comic Sans MS";
            text.setFont(new Font(currentFont, Font.PLAIN, textSize));
            text.setText("The current font is Comic Sans MS");
        } else if (source == helvetica) {
            currentFont = "Helvetica";
            text.setFont(new Font(currentFont, Font.PLAIN, textSize));
            text.setText("The current font is Helvetica");
        } else if (source == timesNewRoman) {
            currentFont = "Times New Roman";
            text.setFont(new Font(currentFont, Font.PLAIN, textSize));
            text.setText("The current font is Times New Roman");
        } else if (source == wingdings) {
            currentFont = "Wingdings";
            text.setFont(new Font(currentFont, Font.PLAIN, textSize));
            text.setText("The current font is Wingdings");
        } else if (source == increaseSize) {
            textSize += 5;
            text.setFont(new Font(currentFont, Font.PLAIN, textSize));
        } else if (source == decreaseSize) {
            textSize -= 5;
            text.setFont(new Font(currentFont, Font.PLAIN, textSize));
        }
    }

    public static void main(String[] args) {
        JFontSelector jFontSelector = new JFontSelector();
    }
}
