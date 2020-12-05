package de.jonas.games.tictactoe;

import java.util.Timer;
import java.util.TimerTask;

public class Computer {

    /**
     * Es wird erst geschaut, ob man irgendwo gewinnen kann, dann
     * wird geschaut, ob man dem Spieler irgendwo den Zug vermiesen kann
     * und sonst wird einfach an einer zufälligen Position gesetzt.
     */
    public Computer() {
        final Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                // schauen wer dran ist
                if(GUI.player != 1) {
                    return;
                }

                // gucken, dass es noch keinen Gewinner gibt
                if(GUI.gewinner != 0) {
                    return;
                }

                // gucken, dass es nicht unentschieden steht
                if(GUI.unentschieden != 0) {
                    return;
                }

                // schauen ob man irgendwo gewinnen kann
                if(GUI.state[0] == 0 && GUI.state[1] == 2 && GUI.state[2] == 2) {
                    GUI.state[0] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[0] == 2 && GUI.state[1] == 2 && GUI.state[2] == 0) {
                    GUI.state[2] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[0] == 2 && GUI.state[1] == 0 && GUI.state[2] == 2) {
                    GUI.state[1] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[3] == 0 && GUI.state[4] == 2 && GUI.state[5] == 2) {
                    GUI.state[3] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[3] == 2 && GUI.state[4] == 2 && GUI.state[5] == 0) {
                    GUI.state[5] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[3] == 2 && GUI.state[4] == 0 && GUI.state[5] == 2) {
                    GUI.state[4] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[6] == 0 && GUI.state[7] == 2 && GUI.state[8] == 2) {
                    GUI.state[6] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[6] == 2 && GUI.state[7] == 2 && GUI.state[8] == 0) {
                    GUI.state[8] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[6] == 2 && GUI.state[7] == 0 && GUI.state[8] == 2) {
                    GUI.state[7] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[0] == 0 && GUI.state[3] == 2 && GUI.state[6] == 2) {
                    GUI.state[0] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[0] == 2 && GUI.state[3] == 2 && GUI.state[6] == 0) {
                    GUI.state[6] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[0] == 2 && GUI.state[3] == 0 && GUI.state[6] == 2) {
                    GUI.state[3] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[1] == 0 && GUI.state[4] == 2 && GUI.state[7] == 2) {
                    GUI.state[1] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[1] == 2 && GUI.state[4] == 2 && GUI.state[7] == 0) {
                    GUI.state[7] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[1] == 2 && GUI.state[4] == 0 && GUI.state[7] == 2) {
                    GUI.state[4] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[2] == 0 && GUI.state[5] == 2 && GUI.state[8] == 2) {
                    GUI.state[2] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[2] == 2 && GUI.state[5] == 2 && GUI.state[8] == 0) {
                    GUI.state[8] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[2] == 2 && GUI.state[5] == 0 && GUI.state[8] == 2) {
                    GUI.state[5] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[0] == 0 && GUI.state[4] == 2 && GUI.state[8] == 2) {
                    GUI.state[0] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[0] == 2 && GUI.state[4] == 2 && GUI.state[8] == 0) {
                    GUI.state[8] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[0] == 2 && GUI.state[4] == 0 && GUI.state[8] == 2) {
                    GUI.state[4] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[2] == 0 && GUI.state[4] == 2 && GUI.state[6] == 2) {
                    GUI.state[2] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[2] == 2 && GUI.state[4] == 2 && GUI.state[6] == 0) {
                    GUI.state[6] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[2] == 2 && GUI.state[4] == 0 && GUI.state[6] == 2) {
                    GUI.state[4] = 2;
                    GUI.player = 0;
                    return;
                }

                // dem Spieler das Gewinnen vermiesen
                if(GUI.state[0] == 0 && GUI.state[1] == 1 && GUI.state[2] == 1) {
                    GUI.state[0] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[0] == 1 && GUI.state[1] == 1 && GUI.state[2] == 0) {
                    GUI.state[2] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[0] == 1 && GUI.state[1] == 0 && GUI.state[2] == 1) {
                    GUI.state[1] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[3] == 0 && GUI.state[4] == 1 && GUI.state[5] == 1) {
                    GUI.state[3] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[3] == 1 && GUI.state[4] == 1 && GUI.state[5] == 0) {
                    GUI.state[5] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[3] == 1 && GUI.state[4] == 0 && GUI.state[5] == 1) {
                    GUI.state[4] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[6] == 0 && GUI.state[7] == 1 && GUI.state[8] == 1) {
                    GUI.state[6] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[6] == 1 && GUI.state[7] == 1 && GUI.state[8] == 0) {
                    GUI.state[8] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[6] == 1 && GUI.state[7] == 0 && GUI.state[8] == 1) {
                    GUI.state[7] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[0] == 0 && GUI.state[3] == 1 && GUI.state[6] == 1) {
                    GUI.state[0] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[0] == 1 && GUI.state[3] == 1 && GUI.state[6] == 0) {
                    GUI.state[6] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[0] == 1 && GUI.state[3] == 0 && GUI.state[6] == 1) {
                    GUI.state[3] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[1] == 0 && GUI.state[4] == 1 && GUI.state[7] == 1) {
                    GUI.state[1] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[1] == 1 && GUI.state[4] == 1 && GUI.state[7] == 0) {
                    GUI.state[7] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[1] == 1 && GUI.state[4] == 0 && GUI.state[7] == 1) {
                    GUI.state[4] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[2] == 0 && GUI.state[5] == 1 && GUI.state[8] == 1) {
                    GUI.state[2] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[2] == 1 && GUI.state[5] == 1 && GUI.state[8] == 0) {
                    GUI.state[8] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[2] == 1 && GUI.state[5] == 0 && GUI.state[8] == 1) {
                    GUI.state[5] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[0] == 0 && GUI.state[4] == 1 && GUI.state[8] == 1) {
                    GUI.state[0] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[0] == 1 && GUI.state[4] == 1 && GUI.state[8] == 0) {
                    GUI.state[8] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[0] == 1 && GUI.state[4] == 0 && GUI.state[8] == 1) {
                    GUI.state[4] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[2] == 0 && GUI.state[4] == 1 && GUI.state[6] == 1) {
                    GUI.state[2] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[2] == 1 && GUI.state[4] == 1 && GUI.state[6] == 0) {
                    GUI.state[6] = 2;
                    GUI.player = 0;
                    return;
                }

                if(GUI.state[2] == 1 && GUI.state[4] == 0 && GUI.state[6] == 1) {
                    GUI.state[4] = 2;
                    GUI.player = 0;
                    return;
                }

                // in ein random Feld setzen
                randomField();

            }
        }, 0, 1000);
    }

    private void randomField() {
        // gucken, dass es nicht unentschieden steht
        if(GUI.unentschieden != 0) {
            return;
        }
        int zahl = (int)((Math.random()) * 8);
        if(GUI.state[zahl] == 0) {
            GUI.state[zahl] = 2;
            GUI.player = 0;
        } else {
            randomField();
        }
    }

}
