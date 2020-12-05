package de.jonas.games.tictactoe;

import javax.imageio.ImageIO;

import java.awt.Image;
import java.io.IOException;

public class ImageLoader {

    static Image imgX, imgO;

    public ImageLoader() {
        try {
            imgX = ImageIO.read(getClass().getResource("/de/jonas/games/data/x.png"));
            imgO = ImageIO.read(getClass().getResource("/de/jonas/games/data/o.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
