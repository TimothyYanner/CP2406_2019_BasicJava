package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

public class JHistoricalFacts extends JFrame implements ActionListener {
    final String[] HISTORICAL_FACTS = {
            "Turkeys Were Once Worshipped Like Gods",
            "Paul Revere Never Actually Shouted, “The British Are Coming!”",
            "The Olympics Used to Award Medals for Art",
            "Napoleon Was Once Attacked By a Horde of Bunnies",
            "Captain Morgan Actually Existed"
    };

    JButton button = new JButton("New fact");
    JLabel displayedFact = new JLabel("");
    int factNumber = 0;

    JHistoricalFacts() {
        super("JHistoricalFacts");
        button.addActionListener(this);
        add(button);
        add(displayedFact);
        displayedFact.setHorizontalAlignment(SwingConstants.CENTER);
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        displayedFact.setText(HISTORICAL_FACTS[factNumber]);
        factNumber += 1;
        if (factNumber == 5) {
            factNumber = 0;
        }
    }
}
