package Pr5;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import javax.swing.*;

public class Window_3 extends JFrame {

    public Window_3(){
        setTitle("Моя программа");
        setSize(909, 480);
        getContentPane().setBackground(new Color(255, 255, 255));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(600, 300);
        setLayout(null);
        setResizable(false);

    }

    public static void main(String[] args) throws InterruptedException{
        Window_3 window = new Window_3();
        ImageIcon img = new ImageIcon("D:\\JavaProj\\PrFrom5\\Chel.jpg");
        JLabel lb = new JLabel();
        lb.setSize(303, 480);
        lb.setIcon(img);
        window.add(lb);
        window.setVisible(true);
        Thread.currentThread().sleep(1000);
        for (int i = 0; i < 2; i ++){
            lb.setLocation(lb.getX()+303, 0);
            window.repaint();
            Thread.currentThread().sleep(1000);
        }

    }
}

