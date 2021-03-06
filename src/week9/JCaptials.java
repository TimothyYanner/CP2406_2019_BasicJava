package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

public class JCaptials extends JFrame implements ActionListener {
    final String[] COUNTRIES = {"Australia", "USA", "France", "Germany", "Canada", "Russia", "Brazil"};
    final String[] CAPITALS = {"Canberra", "Washington DC", "Paris", "Berlin", "Ottawa", "Moscow", "Rio"};

    JComboBox countries = new JComboBox(COUNTRIES);
    JLabel capital = new JLabel("Canberra");
    int countriesIndex;

    JCaptials() {
        super("JCapitals");
        setVisible(true);
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 600);
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        add(countries, gridBagConstraints);
        gridBagConstraints.gridy = 1;
        add(capital, gridBagConstraints);
        countries.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        countriesIndex = countries.getSelectedIndex();
        capital.setText(CAPITALS[countriesIndex]);
    }

}
