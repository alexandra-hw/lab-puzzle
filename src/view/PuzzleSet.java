package view;

import model.PuzzlePiece;

import java.awt.image.BufferedImage;

public class PuzzleSet {
    private PuzzlePiece[][] puzzleSetArray = null;
    private BufferedImage image;

    public PuzzleSet(BufferedImage image, int piecesX, int piecesY) {
        this.image = image;
        puzzleSetArray = new PuzzlePiece[piecesX][piecesY];

        int pieceWight = image.getWidth() / piecesX;
        int pieceHeight = image.getHeight() / piecesY;
        int lastPieceWight = image.getWidth() - (piecesX - 1) * pieceWight;
        int lastPieceHeight = image.getHeight() - (piecesY - 1) * pieceHeight;

        for (int i = 0; i < piecesX; ++i) {
            for (int j = 0; j < piecesY; ++j) {
                int wight = (i == piecesX - 1) ? lastPieceWight : pieceWight;
                int height = (j == piecesY - 1) ? lastPieceHeight : pieceWight;


            }
        }
    }
}
