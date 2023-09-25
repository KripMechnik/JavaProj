package Pr5;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Window extends JFrame{
    Shape [] shapes = new Shape[20];
    public Window() {
        setSize(1400, 1000);
        setTitle("Моя программа");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        Random rand = new Random();
        for (int i = 0; i < 20; i++){
            int val = Math.abs(rand.nextInt()%2);
            switch (val){
                case 0->{
                    shapes[i] = new Triangle(new Color(Math.abs(rand.nextInt()%255), Math.abs(rand.nextInt()%255), Math.abs(rand.nextInt()%255)), Math.abs(rand.nextInt()%1100) + 40, Math.abs(rand.nextInt()%800)+100);

                }
                case 1 ->{
                    shapes[i] = new Rectangle(new Color(Math.abs(rand.nextInt()%255), Math.abs(rand.nextInt()%255), Math.abs(rand.nextInt()%255)), Math.abs(rand.nextInt()%1100) + 40, Math.abs(rand.nextInt()%800)+100);

                }
            }
        }
        setVisible(true);
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for(int i = 0; i < shapes.length; i++){
            shapes[i].Draw(g);
        }
    }
    public static void main(String[] args) {
        new Window();
    }
}


