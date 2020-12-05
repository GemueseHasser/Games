package de.jonas.games.tictactoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (GUI.gewinner != 0) {
            return;
        }

        if (actionEvent.getSource() == GUI.button[0]) {
            if (GUI.state[0] == 0 && GUI.player == 0) {
                GUI.state[0] = 1;
                GUI.player = 1;
            }
        } else if (actionEvent.getSource() == GUI.button[1]) {
            if (GUI.state[1] == 0 && GUI.player == 0) {
                GUI.state[1] = 1;
                GUI.player = 1;
            }
        } else if (actionEvent.getSource() == GUI.button[2]) {
            if (GUI.state[2] == 0 && GUI.player == 0) {
                GUI.state[2] = 1;
                GUI.player = 1;
            }
        } else if (actionEvent.getSource() == GUI.button[3]) {
            if (GUI.state[3] == 0 && GUI.player == 0) {
                GUI.state[3] = 1;
                GUI.player = 1;
            }
        } else if (actionEvent.getSource() == GUI.button[4]) {
            if (GUI.state[4] == 0 && GUI.player == 0) {
                GUI.state[4] = 1;
                GUI.player = 1;
            }
        } else if (actionEvent.getSource() == GUI.button[5]) {
            if (GUI.state[5] == 0 && GUI.player == 0) {
                GUI.state[5] = 1;
                GUI.player = 1;
            }
        } else if (actionEvent.getSource() == GUI.button[6]) {
            if (GUI.state[6] == 0 && GUI.player == 0) {
                GUI.state[6] = 1;
                GUI.player = 1;
            }
        } else if (actionEvent.getSource() == GUI.button[7]) {
            if (GUI.state[7] == 0 && GUI.player == 0) {
                GUI.state[7] = 1;
                GUI.player = 1;
            }
        } else if (actionEvent.getSource() == GUI.button[8]) {
            if (GUI.state[8] == 0 && GUI.player == 0) {
                GUI.state[8] = 1;
                GUI.player = 1;
            }
        }
    }
}
