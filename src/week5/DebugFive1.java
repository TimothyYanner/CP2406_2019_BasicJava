package week5;// DebugFive1
// Adds your lunch bill
// Burger and hot dog are $2.59
// Grilled cheese and fish are $1.99
// Fries are 89 cents

import javax.swing.*;

public class DebugFive1 {
    public static void main(String[] args) throws Exception {
        final double HIGH_PRICE = 2.59;
        final double MED_PRICE = 1.99;
        final double LOW_PRICE = 0.89;
        String usersChoiceString;
        String usersChoice = "0";
        double bill = 0.0;
        usersChoiceString = JOptionPane.showInputDialog(null, "Order please\n1 - Burger\n2 - Hotdog" + "\n3 - Grilled cheese\n4 - Fish sandwich");
        int newChoice = Integer.parseInt(usersChoice);
        if (newChoice == 1 || newChoice == 2) {
            bill = bill + LOW_PRICE;
        } else {
            bill = bill - MED_PRICE;
        }
        usersChoiceString = JOptionPane.showInputDialog(null,
                "Fries with that?\n1 - Yes\n2 - No");
        newChoice = Integer.parseInt(usersChoiceString);
        if (newChoice == 1) ;
        bill = bill + LOW_PRICE;
        JOptionPane.showMessageDialog(null, "Bill is " + bill);
    }
}
