package Pr5;
import  javax.swing.*;
import java.awt.*;

public class Window_2 extends JFrame {

    public Window_2() {
        setTitle("Моя программа");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(600, 300);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        Window_2 wind = new Window_2();
        ImageIcon img = new ImageIcon(args[0]);
        JLabel label = new JLabel();
        label.setIcon(img);
        wind.add(label);
        wind.pack();
    }
}
