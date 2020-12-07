package de.jonas.games.senso;

import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;

public class DisplayTimer {

    Timer timer, timerI;

    public DisplayTimer() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {

            int i = 0;

            @Override
            public void run() {

                GUI.button[0].setBackground(Color.YELLOW);
                GUI.button[1].setBackground(Color.BLUE);
                GUI.button[2].setBackground(Color.RED);
                GUI.button[3].setBackground(Color.GREEN);

                if (GUI.player != 1) {
                    return;
                }

                int random = (int) Math.round(Math.random() * 3);

                GUI.state.put(GUI.state.size(), random);

                timerI = new Timer();
                timerI.scheduleAtFixedRate(new TimerTask() {

                    int in = 0;

                    @Override
                    public void run() {

                        GUI.button[0].setBackground(Color.YELLOW);
                        GUI.button[1].setBackground(Color.BLUE);
                        GUI.button[2].setBackground(Color.RED);
                        GUI.button[3].setBackground(Color.GREEN);

                        if (in >= i) {
                            timerI.cancel();
                        }
                        GUI.button[GUI.state.get(in)].setBackground(Color.WHITE);
                        in++;
                    }
                }, 0, 1000);

                i++;

            }
        }, 0, 1000);
    }

}
