package de.jonas.games;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import de.jonas.games.pong.MainPong;
import de.jonas.games.senso.SensoMain;
import de.jonas.games.tictactoe.Computer;
import de.jonas.games.tictactoe.GUI;
import de.jonas.games.tictactoe.GewinnAlgorythmus;
import de.jonas.games.tictactoe.ImageLoader;

public class CheckoutGame {

    public static int anfaenger;

    public CheckoutGame() {
        JFrame frame = new JFrame("Wähle dein Spiel aus!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 500, 850);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        JButton tictactoe = new JButton("Tic Tac Toe");
        tictactoe.setBounds(50, 50, 400, 50);
        tictactoe.addActionListener(actionEvent -> {
            frame.dispose();
            checkoutGameTicTacToe();
        });

        JButton pong = new JButton("Pong");
        pong.setBounds(50, 120, 400, 50);
        pong.addActionListener(actionEvent -> {
            frame.dispose();
            checkoutGamePong();
        });

        JButton senso = new JButton("Senso");
        senso.setBounds(50, 190, 400, 50);
        senso.addActionListener(actionEvent -> new SensoMain());

        frame.add(tictactoe);
        frame.add(pong);
        frame.add(senso);
        frame.setVisible(true);
    }

    private void checkoutGamePong() {
        try {
            new MainPong();
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    private void checkoutGameTicTacToe() {
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
            startGamePong(0);
        });

        computer.addActionListener(actionEvent -> {
            frame.dispose();
            startGamePong(1);
        });

        frame.add(player);
        frame.add(computer);
        frame.setVisible(true);
    }



    private void startGamePong(final int beginner) {
        GUI.player = beginner;
        anfaenger = beginner;
        new GUI();
        new GewinnAlgorythmus();
        new ImageLoader();
        new Computer();
    }

}
