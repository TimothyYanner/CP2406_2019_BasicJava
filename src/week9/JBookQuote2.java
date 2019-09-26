package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JBookQuote2  extends JFrame implements ActionListener{
    JLabel quote = new JLabel("Welcome to Java Programming");
    JButton pressMe = new JButton("Click to view book title");
    JLabel bookTitle = new JLabel("");
    public JBookQuote2() {
        super("JBookQuote2");
        setSize(600, 600);
        setLayout(new FlowLayout());
        pressMe.addActionListener(this);
        add(quote);
        add(pressMe);
        add(bookTitle);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        bookTitle.setText("Java Programming");
    }
}

class Main {
    public static void main(String[] args) {
        JBookQuote2 jBookQuote2 = new JBookQuote2();
    }
}

