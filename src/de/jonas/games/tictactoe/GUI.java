package de.jonas.games.tictactoe;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;

public class GUI {

    static JButton button[] = new JButton[9];

    static int state[] = new int[9];

    public static int player = 0;

    static int unentschieden = 0;

    static int gewinner = 0;

    public GUI() {
        JFrame frame = new JFrame("Tic Tac Toe - by Jonas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 800, 600);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        for(int i = 0; i<button.length; i++) {
            button[i] = new JButton();
            button[i].setVisible(true);
            button[i].addActionListener(new ActionHandler());
            button[i].setFocusPainted(false);
            button[i].setContentAreaFilled(false);
            button[i].setBorder(null);
            frame.add(button[i]);
        }

        ButtonPlacement.place();

        JButton resetButton = new JButton("Reset");
        resetButton.setBounds(675, 500, 100, 40);
        resetButton.setBackground(new Color(51, 102, 153));
        resetButton.setVisible(true);
        resetButton.setForeground(Color.WHITE);
        resetButton.setFocusPainted(false);
        resetButton.addActionListener(e -> ButtonPlacement.reset());

        frame.add(resetButton);

        Draw draw = new Draw();
        draw.setBounds(0, 0, frame.getWidth(), frame.getHeight());
        draw.setVisible(true);


        frame.add(draw);
        frame.setVisible(true);
    }

}
