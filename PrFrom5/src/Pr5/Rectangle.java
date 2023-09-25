package Pr5;

import java.awt.*;

public class Rectangle extends Shape {
    private int leftUpx;
    private int leftUpy;
    private int rightDownx;
    private int rightDowny;

    public Rectangle(Color color, int positionX, int positionY) {
        super(color, positionX, positionY);
        this.leftUpx = positionX - 30;
        this.leftUpy = positionY - 20;
        this.rightDownx = positionX + 30;
        this.rightDowny = positionY + 20;
    }

    @Override
    public void Draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(this.color);
        g2.drawRect(leftUpx, leftUpy, rightDownx - leftUpx, leftUpy - rightDowny);
    }

}
