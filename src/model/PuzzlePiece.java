package model;

import java.awt.image.BufferedImage;

public class PuzzlePiece {
    private int centerX, centerY;
    private int i, j;
    private BufferedImage image;

    public PuzzlePiece(int centerX, int centerY, int i, int j, BufferedImage image) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.i = i;
        this.j = j;
        this.image = image;
    }

    public void changeLocation(int x, int y) {
        centerX = x;
        centerY = y;
    }
}
