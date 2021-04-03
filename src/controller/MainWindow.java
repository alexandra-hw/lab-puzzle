package controller;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private static final Dimension WINDOW_SIZE = new Dimension(800, 800);

    public MainWindow(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WINDOW_SIZE);
        this.setJMenuBar(new WindowMenu(this));
        this.setVisible(true);
    }
}
