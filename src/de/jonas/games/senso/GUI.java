package de.jonas.games.senso;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;
import java.util.HashMap;

public class GUI {

    public static HashMap<Integer, Integer> state = new HashMap<>();

    public static JButton[] button = new JButton[4];

    public static int player = 1;

    public GUI() {
        JFrame frame = new JFrame("Senso - by Jonas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 600, 600);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);

        JButton gelb = new JButton();
        gelb.setBounds(45, 35, 250, 250);
        gelb.setOpaque(true);
        gelb.setBackground(Color.YELLOW);
        gelb.addActionListener(actionEvent -> check(0));

        JButton blau = new JButton();
        blau.setBounds(295, 35, 250, 250);
        blau.setOpaque(true);
        blau.setBackground(Color.BLUE);
        blau.addActionListener(actionEvent -> check(1));

        JButton rot = new JButton();
        rot.setBounds(45, 285, 250, 250);
        rot.setOpaque(true);
        rot.setBackground(Color.RED);
        rot.addActionListener(actionEvent -> check(2));

        JButton gruen = new JButton();
        gruen.setBounds(295, 285, 250, 250);
        gruen.setOpaque(true);
        gruen.setBackground(Color.GREEN);
        gruen.addActionListener(actionEvent -> check(3));

        button[0] = gelb;
        button[1] = blau;
        button[2] = rot;
        button[3] = gruen;

        frame.add(gelb);
        frame.add(blau);
        frame.add(rot);
        frame.add(gruen);
        frame.setVisible(true);
    }

    private void check(int btn) {

    }

}
