package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class PasswordGenerator extends JFrame {
    private JTextField a;
    private JCheckBox b, c, d, e;
    private JTextArea f;
    private JButton g;

    public PasswordGenerator() {
        setTitle("Password Generator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        a = new JTextField(10);
        b = new JCheckBox("Include Uppercase (A-Z)");
        c = new JCheckBox("Include Lowercase (a-z)");
        d = new JCheckBox("Include Numbers (0-9)");
        e = new JCheckBox("Include Special (!@#$...)");
        f = new JTextArea(3, 30);
        f.setLineWrap(true);
        f.setWrapStyleWord(true);
        f.setEditable(false);
        g = new JButton("Generate Password");

        JPanel h = new JPanel();
        h.setLayout(new GridLayout(6, 1));
        h.add(new JLabel("Enter Password Length:"));
        h.add(a);
        h.add(b);
        h.add(c);
        h.add(d);
        h.add(e);

        JPanel i = new JPanel();
        i.setLayout(new BorderLayout());
        i.add(g, BorderLayout.NORTH);
        i.add(new JScrollPane(f), BorderLayout.CENTER);

        add(h, BorderLayout.NORTH);
        add(i, BorderLayout.CENTER);

        g.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                j();
            }
        });
    }

    private void j() {
        String k = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String l = "abcdefghijklmnopqrstuvwxyz";
        String m = "0123456789";
        String n = "!@#$%^&*()-_=+<>?/";

        StringBuilder o = new StringBuilder();
        Random p = new Random();

        if (b.isSelected()) o.append(k);
        if (c.isSelected()) o.append(l);
        if (d.isSelected()) o.append(m);
        if (e.isSelected()) o.append(n);

        if (o.length() == 0) {
            f.setText("Please select at least one character set.");
            return;
        }

        int q;
        try {
            q = Integer.parseInt(a.getText().trim());
            if (q <= 0) throw new NumberFormatException();
        } catch (NumberFormatException ex) {
            f.setText("Invalid password length. Please enter a positive number.");
            return;
        }

        StringBuilder r = new StringBuilder();
        for (int i = 0; i < q; i++) {
            int s = p.nextInt(o.length());
            r.append(o.charAt(s));
        }

        f.setText("Generated Password:\n" + r.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PasswordGenerator().setVisible(true);
        });
    }
}
