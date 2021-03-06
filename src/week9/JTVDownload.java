package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTVDownload extends JFrame implements ActionListener {
    String[] TVSHOWS = {"FRIENDS", "SEINFELD", "GAME OF THRONES", "BREAKING BAD", "LOST"};
    String[] SYNOPSES = {
            "Follows the personal and professional lives of six twenty to thirty-something-year-old friends living in "
                    + "Manhattan. ... In 1994, the idea was created for \"Friends\": a show about six friends in " +
                    "New York as they navigate their way through life and learn to grow up as they approach the " +
                    "third decade of their life", "The continuing misadventures of neurotic New York City stand-up " +
            "comedian Jerry Seinfeld and his equally neurotic New York City friends. Jerry Seinfeld stars in this " +
            "television comedy series as himself, a comedian. ... Jerry's neighbor Kramer often barges into his " +
            "apartment and imposes onto his life.", "The series chronicles the violent dynastic struggles among the " +
            "realm's noble families for the Iron Throne, while other families fight for independence from it.", "A " +
            "once loyal father and chemistry teacher, Walter White, turns to a life of crime due to developing stage" +
            " 3 terminal lung cancer. He is told he has two years to live. ... Breaking Bad follows protagonist " +
            "Walter White, a chemistry teacher who lives in New Mexico with his wife and teenage son who has " +
            "cerebral palsy.", "The show contains elements of supernatural and science fiction, and follows the " +
            "survivors of a commercial jet airliner flying between Sydney and Los Angeles, after the plane crashes " +
            "on a mysterious island somewhere in the South Pacific Ocean."};
    JComboBox tvShows = new JComboBox(TVSHOWS);
    JLabel synopsis = new JLabel();

    JTVDownload() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 600);
        setVisible(true);
        setLayout(new FlowLayout());
        tvShows.addActionListener(this);
        add(tvShows);
        add(synopsis);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int selectedShow = tvShows.getSelectedIndex();
        synopsis.setText(SYNOPSES[selectedShow]);
    }
}
