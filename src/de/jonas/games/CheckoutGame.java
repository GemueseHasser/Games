package de.jonas.games;

import javax.swing.JButton;
import javax.swing.JFrame;

import de.jonas.games.tictactoe.Computer;
import de.jonas.games.tictactoe.GUI;
import de.jonas.games.tictactoe.GewinnAlgorythmus;
import de.jonas.games.tictactoe.ImageLoader;

public class CheckoutGame {

    public static int anfaenger;

    public CheckoutGame() {
        CheckoutGameTicTacToe();
    }

    public static void CheckoutGameTicTacToe() {
        JFrame frame = new JFrame("Wer soll beginnen?");
        frame.setBounds(0, 0, 350, 160);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        JButton player = new JButton("Ich möchte beginnen");
        player.setBounds(15, 20, 310, 40);
        JButton computer = new JButton("Der Computer soll beginnen!");
        computer.setBounds(15, 70, 310, 40);

        player.addActionListener(actionEvent -> {
            frame.dispose();
            startGame(0);
        });

        computer.addActionListener(actionEvent -> {
            frame.dispose();
            startGame(1);
        });

        frame.add(player);
        frame.add(computer);
        frame.setVisible(true);
    }

    private static void startGame(final int beginner) {
        GUI.player = beginner;
        anfaenger = beginner;
        new GUI();
        new GewinnAlgorythmus();
        new ImageLoader();
        new Computer();
    }

}
