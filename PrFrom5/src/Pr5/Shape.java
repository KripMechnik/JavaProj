package Pr5;
import javax.swing.*;
import java.awt.*;

public abstract class Shape {
    protected Color color;
    protected int positionX;
    protected int positionY;

    public abstract void Draw(Graphics g);

    public Shape(Color color, int positionX, int positionY) {
        this.color = color;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
}
