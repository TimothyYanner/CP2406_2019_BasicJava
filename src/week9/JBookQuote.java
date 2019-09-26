package week9;

import javax.swing.*;

public class JBookQuote {
    public static void main(String[] args) {
        JFrame aFrame = new JFrame("JBookQuote");
        aFrame.setSize(600, 600);
        JLabel quote = new JLabel("Welcome to Java Programming");
        aFrame.add(quote);
        aFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        aFrame.setVisible(true);
    }
}
