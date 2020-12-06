package de.jonas.games.senso;

import javax.swing.JFrame;

public class GUI {

    public GUI() {
        JFrame frame = new JFrame("Senso - by Jonas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 600, 600);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);

        DrawSenso draw = new DrawSenso();
        draw.setBounds(0, 0, frame.getWidth(), frame.getHeight());
        draw.setVisible(true);

        frame.add(draw);
        frame.setVisible(true);
    }

}
