import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static java.awt.Component.CENTER_ALIGNMENT;

public class Main {

    public static void startGui(){
        JFrame frame = new JFrame();
        JPanel mainMenu = new JPanel();

        JButton startBtn = new JButton();
        JButton settingsBtn = new JButton();
        JButton exitBtn = new JButton();

        try {
            BufferedImage backgroundImage = ImageIO.read(new File("C:\\Users\\clayton\\IdeaProjects\\Tron\\src\\tronMain.png"));
            JLabel background = new JLabel (new ImageIcon(backgroundImage));
            mainMenu.add(background);
        } catch(IOException e) {
            System.out.println(e.toString());
        }

        startBtn.setPreferredSize(new Dimension(60, 40));
        startBtn.setAlignmentX(CENTER_ALIGNMENT);
        startBtn.setAlignmentY(CENTER_ALIGNMENT);

        settingsBtn.setPreferredSize(new Dimension(60, 40));
        settingsBtn.setAlignmentX(CENTER_ALIGNMENT);
        settingsBtn.setAlignmentY(CENTER_ALIGNMENT);

        exitBtn.setPreferredSize(new Dimension(60, 40));
        settingsBtn.setAlignmentX(CENTER_ALIGNMENT);
        settingsBtn.setAlignmentY(CENTER_ALIGNMENT);

        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setSize(600, 400);

        
        frame.add(mainMenu);
        mainMenu.add(startBtn);
        mainMenu.add(settingsBtn);
        mainMenu.add(exitBtn);

    }


    public static void main(String[] args) {
        startGui();
        System.out.println("Hello World!");
    }

}
