package de.jonas.games.tictactoe;

import java.util.Arrays;

import de.jonas.games.CheckoutGame;

public class ButtonPlacement {

    public static void place() {
        //Reihe 1
        GUI.button[0].setBounds(175, 50, 150, 150);
        GUI.button[1].setBounds(325, 50, 150, 150);
        GUI.button[2].setBounds(475, 50, 150, 150);
        //Reihe 2
        GUI.button[3].setBounds(175, 200, 150, 150);
        GUI.button[4].setBounds(325, 200, 150, 150);
        GUI.button[5].setBounds(475, 200, 150, 150);
        //Reihe 3
        GUI.button[6].setBounds(175, 350, 150, 150);
        GUI.button[7].setBounds(325, 350, 150, 150);
        GUI.button[8].setBounds(475, 350, 150, 150);
    }

    public static void reset() {
        Arrays.fill(GUI.state, 0);

        GUI.player = CheckoutGame.anfaenger;
        GUI.gewinner = 0;
        GUI.unentschieden = 0;
    }

}
