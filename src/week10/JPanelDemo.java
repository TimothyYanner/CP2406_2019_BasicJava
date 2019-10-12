package week10;

import javax.swing.*;
import java.awt.*;

public class JPanelDemo extends JFrame {

    JFlexiblePanel jFlexiblePanel1 = new JFlexiblePanel(Color.BLACK, Color.WHITE, new Font("Arial", Font.PLAIN, 12), "First Panel");
    JFlexiblePanel jFlexiblePanel2 = new JFlexiblePanel(Color.WHITE, Color.BLACK, new Font("Comic Sans MS", Font.PLAIN, 12), "Second Panel");
    JFlexiblePanel jFlexiblePanel3 = new JFlexiblePanel(Color.BLUE, Color.YELLOW, new Font("Times New Roman", Font.PLAIN, 12), "Third Panel");
    JFlexiblePanel jFlexiblePanel4 = new JFlexiblePanel(Color.DARK_GRAY, Color.CYAN, new Font("Wingdings", Font.PLAIN, 12), "Fourth Panel");

    public JPanelDemo() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1080, 720);
        setVisible(true);
        setLayout(new GridLayout(1, 4));
        add(jFlexiblePanel1);
        add(jFlexiblePanel2);
        add(jFlexiblePanel3);
        add(jFlexiblePanel4);
    }

    public static void main(String[] args) {
        JPanelDemo jPanelDemo = new JPanelDemo();
    }

}
