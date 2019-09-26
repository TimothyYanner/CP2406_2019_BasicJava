package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JVacationRental extends JFrame implements ActionListener {
    JLabel titleLabel = new JLabel("Lambert's Vacation Rental");

    JLabel locationLabel = new JLabel("Select a location");
    JButton parkside = new JButton("ParkSide");
    JButton poolside = new JButton("PoolSide");
    JButton lakeside = new JButton("LakeSide");

    JLabel numberBedroomLabel = new JLabel("Select a number of bedrooms");
    JButton oneBedroom = new JButton("1 Bedroom");
    JButton twoBedroom = new JButton("2 Bedrooms");
    JButton threeBedroom = new JButton("3 Bedrooms");

    JLabel includeMealsLabel = new JLabel("Include meals?");
    JButton includeMeals = new JButton("Yes");
    JButton dontIncludeMeals = new JButton("No");

    JLabel priceLabel = new JLabel("Total price:");
    JLabel priceField = new JLabel("$0");

    int price = 0;

    boolean parksideClicked = false;
    boolean poolsideClicked = false;
    boolean lakesideClicked = false;
    boolean oneClicked = false;
    boolean twoClicked = false;
    boolean threeClicked = false;


    JVacationRental() {
        super("JVacationRental");
        setVisible(true);
        setLayout(new GridBagLayout());
        setSize(900, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        GridBagConstraints gridBagConstraints = new GridBagConstraints();

        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;

        Font bigFont = new Font("Arial", Font.BOLD, 16);

        setConstraints(0, 0, 3, 1, gridBagConstraints);
        add(titleLabel, gridBagConstraints);
        titleLabel.setFont(bigFont);

        setConstraints(0, 1, 1, 1, gridBagConstraints);
        add(locationLabel, gridBagConstraints);

        setConstraints(1, 1, 1, 1, gridBagConstraints);
        add(parkside, gridBagConstraints);
        parkside.addActionListener(this);

        setConstraints(2, 1, 1, 1, gridBagConstraints);
        add(poolside, gridBagConstraints);
        poolside.addActionListener(this);

        setConstraints(3, 1, 1, 1, gridBagConstraints);
        add(lakeside, gridBagConstraints);
        lakeside.addActionListener(this);

        setConstraints(0, 2, 1, 1, gridBagConstraints);
        add(numberBedroomLabel, gridBagConstraints);

        setConstraints(1, 2, 1, 1, gridBagConstraints);
        add(oneBedroom, gridBagConstraints);
        oneBedroom.addActionListener(this);

        setConstraints(2, 2, 1, 1, gridBagConstraints);
        add(twoBedroom, gridBagConstraints);
        twoBedroom.addActionListener(this);

        setConstraints(3, 2, 1, 1, gridBagConstraints);
        add(threeBedroom, gridBagConstraints);
        threeBedroom.addActionListener(this);

        setConstraints(0, 3, 1, 1, gridBagConstraints);
        add(includeMealsLabel, gridBagConstraints);

        setConstraints(1, 3, 1, 1, gridBagConstraints);
        add(includeMeals, gridBagConstraints);
        includeMeals.addActionListener(this);

        setConstraints(2, 3, 1, 1, gridBagConstraints);
        add(dontIncludeMeals, gridBagConstraints);
        dontIncludeMeals.addActionListener(this);
        dontIncludeMeals.setEnabled(false);

        setConstraints(0, 4, 1, 1, gridBagConstraints);
        add(priceLabel, gridBagConstraints);

        setConstraints(1, 4, 1, 1, gridBagConstraints);
        add(priceField, gridBagConstraints);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == parkside) {
            price += 600;
            parkside.setEnabled(false);
            poolside.setEnabled(true);
            lakeside.setEnabled(true);
            if (poolsideClicked) {
                price -= 750;
                poolsideClicked = false;
            } else if (lakesideClicked) {
                price -= 825;
                lakesideClicked = false;
            }
            parksideClicked = true;
        }
        if (source == poolside) {
            price += 750;
            poolside.setEnabled(false);
            parkside.setEnabled(true);
            lakeside.setEnabled(true);
            if (parksideClicked) {
                price -= 600;
                parksideClicked = false;
            } else if (lakesideClicked) {
                price -= 825;
                lakesideClicked = false;
            }
            poolsideClicked = true;
        }
        if (source == lakeside) {
            price += 825;
            lakeside.setEnabled(false);
            parkside.setEnabled(true);
            poolside.setEnabled(true);
            if (parksideClicked) {
                price -= 600;
                parksideClicked = false;
            } else if (poolsideClicked) {
                price -= 750;
                poolsideClicked = false;
            }
            lakesideClicked = true;
        }
        if (source == oneBedroom) {
            price += 75;
            oneBedroom.setEnabled(false);
            twoBedroom.setEnabled(true);
            threeBedroom.setEnabled(true);
            if (twoClicked) {
                price -= 150;
                twoClicked = false;
            } else if (threeClicked) {
                price -= 225;
                threeClicked = false;
            }
            oneClicked = true;
        }
        if (source == twoBedroom) {
            price += 150;
            twoBedroom.setEnabled(false);
            oneBedroom.setEnabled(true);
            threeBedroom.setEnabled(true);
            if (oneClicked) {
                price -= 75;
                oneClicked = false;
            } else if (threeClicked) {
                price -= 225;
                threeClicked = false;
            }
            twoClicked = true;
        }
        if (source == threeBedroom) {
            price += 225;
            threeBedroom.setEnabled(false);
            oneBedroom.setEnabled(true);
            twoBedroom.setEnabled(true);
            if (oneClicked) {
                price -= 75;
                oneClicked = false;
            } else if (twoClicked) {
                price -= 150;
                twoClicked = false;
            }
            threeClicked = true;
        }
        if (source == includeMeals) {
            price += 200;
            includeMeals.setEnabled(false);
            dontIncludeMeals.setEnabled(true);
        }
        if (source == dontIncludeMeals) {
            price -= 200;
            includeMeals.setEnabled(true);
            dontIncludeMeals.setEnabled(false);
        }
        priceField.setText(createPriceString(price));
    }

    void setConstraints(int xPos, int yPos, int width, int height, GridBagConstraints gbc) {
        gbc.gridx = xPos;
        gbc.gridy = yPos;
        gbc.gridwidth = width;
        gbc.gridheight = height;
    }

    String createPriceString(int price) {
        String finalString = "$ " + Integer.toString(price);
        return finalString;
    }
}
