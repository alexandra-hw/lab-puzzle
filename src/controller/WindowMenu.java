package controller;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.File;

public class WindowMenu extends JMenuBar {
    private static final String PNG = "PNG", JPG = "JPG";
    private static final String prefixPNG = "png", prefixJPG = "jpg";

    private final MainWindow parentWindow;

    public WindowMenu(MainWindow parentWindow) {
        super();
        this.parentWindow = parentWindow;
        this.add(createFileMenu());
    }

    private JMenu createFileMenu() {
        Font font = new Font(Font.DIALOG, Font.BOLD, 15);

        JMenu fileJMenu = new JMenu("File");
        JMenuItem openMenuItem = new JMenuItem("Open...");

        fileJMenu.setFont(font);
        openMenuItem.setFont(font);

        fileJMenu.add(openMenuItem);

        openMenuItem.addActionListener(e -> {
            JFileChooser fileChooser = createFileChooser();
            int result = fileChooser.showOpenDialog(parentWindow);

            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();

//                    try {
//                        parentWindow.setOpenImage(ImageIO.read(selectedFile));
//                    } catch (IOException exception) {
//                        JOptionPane.showMessageDialog(parentWindow, "File could not be opened",
//                                "IOException", JOptionPane.WARNING_MESSAGE);
//                    }
            }
        });

        return fileJMenu;
    }

    private JFileChooser createFileChooser() {
        JFileChooser fileChooser = new JFileChooser();

        FileNameExtensionFilter filterPNG = new FileNameExtensionFilter(PNG, prefixPNG);
        FileNameExtensionFilter filterJPG = new FileNameExtensionFilter(JPG, prefixJPG);

        // remove type "All Files"
        fileChooser.removeChoosableFileFilter(fileChooser.getAcceptAllFileFilter());

        // add types PNG and JPG
        fileChooser.addChoosableFileFilter(filterPNG);
        fileChooser.addChoosableFileFilter(filterJPG);

        fileChooser.setFileFilter(filterPNG);
        return fileChooser;
    }
}
