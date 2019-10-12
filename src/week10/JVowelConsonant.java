package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

public class JVowelConsonant extends JFrame implements ActionListener {

    Random random = new Random();

    private JButton a = new JButton("A"), b = new JButton("B"), c = new JButton("C"), d = new JButton("D"),
    e = new JButton("E"), f = new JButton("F"), g = new JButton("G"), h = new JButton("h"),
    i = new JButton("I"), j = new JButton("J"), k = new JButton("K"), l = new JButton("L"),
    m = new JButton("M"), n = new JButton("n"), o = new JButton("O"), p = new JButton("P"),
    q = new JButton("Q"), r = new JButton("R"), s = new JButton("S"), t = new JButton("T"),
    u = new JButton("U"), v = new JButton("V"), w = new JButton("W"), x = new JButton("X"),
    y = new JButton("Y"), z = new JButton("Z");

    JButton[] alphabet = {a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z};
    JButton[] vowels = {a, e, i, o, u};
    JButton[] consonants = {b, c, d, f, g, h, j, k, l, m, n, p, q, r, s, t, v, w, x, y, z};
    JButton[] visibleButtons = new JButton[8];

    JPanel letters = new JPanel();
    JPanel information = new JPanel();

    JLabel displayType = new JLabel();

    public JVowelConsonant() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1080, 720);
        setVisible(true);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // format buttons
        a.addActionListener(this); b.addActionListener(this); c.addActionListener(this);
        d.addActionListener(this); e.addActionListener(this); f.addActionListener(this);
        g.addActionListener(this); h.addActionListener(this); i.addActionListener(this);
        j.addActionListener(this); k.addActionListener(this); l.addActionListener(this);
        m.addActionListener(this); n.addActionListener(this); o.addActionListener(this);
        p.addActionListener(this); q.addActionListener(this); r.addActionListener(this);
        s.addActionListener(this); t.addActionListener(this); u.addActionListener(this);
        v.addActionListener(this); w.addActionListener(this); x.addActionListener(this);
        y.addActionListener(this); z.addActionListener(this);

        // format letters panel
        letters.setLayout(new GridLayout(2, 2));

        letters.add(a); letters.add(b); letters.add(c); letters.add(d); letters.add(e); letters.add(f); letters.add(g);
        letters.add(h); letters.add(i); letters.add(j); letters.add(k); letters.add(l); letters.add(m); letters.add(n);
        letters.add(o); letters.add(p); letters.add(q); letters.add(r); letters.add(s); letters.add(t); letters.add(u);
        letters.add(v); letters.add(w); letters.add(x); letters.add(y); letters.add(z);

        a.setVisible(false); b.setVisible(false); c.setVisible(false); d.setVisible(false); e.setVisible(false);
        f.setVisible(false); g.setVisible(false); h.setVisible(false); i.setVisible(false); j.setVisible(false);
        k.setVisible(false); l.setVisible(false); m.setVisible(false); n.setVisible(false); o.setVisible(false);
        p.setVisible(false); q.setVisible(false); r.setVisible(false); s.setVisible(false); t.setVisible(false);
        u.setVisible(false); v.setVisible(false); w.setVisible(false); x.setVisible(false); y.setVisible(false);
        z.setVisible(false);

        int index;
        for (index = 0; index < 8; index++) {
            int randomIndex;
            do {
                randomIndex = random.nextInt(26);
                visibleButtons[index] = alphabet[randomIndex];
            } while (!Arrays.asList(visibleButtons).contains(alphabet[randomIndex]));
        }
        for (index = 0; index < 8; index++) {
            visibleButtons[index].setVisible(true);
        }

        // format information panel
        information.setLayout(new GridBagLayout());
        information.add(displayType);

        // format main panel
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(letters);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        add(information);
    }

    @Override
    public void actionPerformed(ActionEvent action) {
        Object source = action.getSource();
        if (source == a) {
            handleButton(a);
        } else if (source == b) {
            handleButton(b);
        } else if (source == c) {
            handleButton(c);
        } else if (source == d) {
            handleButton(d);
        } else if (source == e) {
            handleButton(e);
        } else if (source == f) {
            handleButton(f);
        } else if (source == g) {
            handleButton(g);
        } else if (source == h) {
            handleButton(h);
        } else if (source == i) {
            handleButton(i);
        } else if (source == j) {
            handleButton(j);
        } else if (source == k) {
            handleButton(k);
        } else if (source == l) {
            handleButton(l);
        } else if (source == m) {
            handleButton(m);
        } else if (source == n) {
            handleButton(n);
        } else if (source == o) {
            handleButton(o);
        } else if (source == p) {
            handleButton(p);
        } else if (source == q) {
            handleButton(q);
        } else if (source == r) {
            handleButton(r);
        } else if (source == s) {
            handleButton(s);
        } else if (source == t) {
            handleButton(t);
        } else if (source == u) {
            handleButton(u);
        } else if (source == v) {
            handleButton(v);
        } else if (source == w) {
            handleButton(w);
        } else if (source == x) {
            handleButton(x);
        } else if (source == y) {
            handleButton(y);
        } else if (source == z) {
            handleButton(z);
        }
    }

    public void handleButton(JButton btn) {
        btn.setVisible(false);
        int index;
        int deleteIndex = 0;
        int randomIndex;
        for (index = 0; index < 8; index++) {
            if (visibleButtons[index] == btn) {
                deleteIndex = index;
            }
        }
        do {
            randomIndex = random.nextInt(26);
            visibleButtons[deleteIndex] = alphabet[randomIndex];
        } while(!Arrays.asList(visibleButtons).contains(alphabet[randomIndex]));
        visibleButtons[deleteIndex].setVisible(true);
        for (index = 0; index < 5; index++) {
            if (vowels[index] == btn) {
                displayType.setText("Vowel");
            }
        }
        for (index = 0; index < 21; index++) {
            if (consonants[index] == btn) {
                displayType.setText("Consonant");
            }
        }
    }

    public static void main(String[] args) {
        JVowelConsonant jVowelConsonant = new JVowelConsonant();
    }

}
