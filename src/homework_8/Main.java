package homework_8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        // Окно с случайными фигурами
        JFrame randomShapesFrame = new JFrame("Random Shapes");
        randomShapesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        randomShapesFrame.add(new RandomShapesWindow());
        randomShapesFrame.setSize(500, 500);
        randomShapesFrame.setVisible(true);

        // Окно с изображением из аргументов командной строки
        if (args.length > 0) {
            JFrame imageFrame = new JFrame("Image");
            imageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            imageFrame.add(new ImageWindow(args[0]));
            imageFrame.setSize(500, 500);
            imageFrame.setVisible(true);
        }

        // Окно с анимацией
        ImageIcon[] animationFrames = {
                new ImageIcon("C:\\Users\\Psabyda\\Downloads\\hasbulla.jpg"),
                //new ImageIcon("C:\\Users\\Psabyda\\Downloads\\pudge.jpg"),
                //new ImageIcon("C:\\Users\\Psabyda\\Downloads\\ronaldo.jpg"),
        };
        JFrame animationFrame = new JFrame("Animation");
        animationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        animationFrame.add(new AnimationWindow(animationFrames));
        animationFrame.setSize(500, 500);
        animationFrame.setVisible(true);
    }
}