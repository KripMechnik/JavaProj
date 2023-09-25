package Pr5;
import java.awt.*;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Triangle extends Shape {
    private int upPointx;
    private int upPointy;
    private int leftPointx;
    private int leftPointy;
    private int rightPointx;
    private int rightPointy;

    public Triangle(Color color, int positionX, int positionY) {
        super(color, positionX, positionY);
        this.upPointx = positionX;
        this.upPointy = positionY - 40;
        this.leftPointx = positionX - 30;
        this.leftPointy = positionY + 30;
        this.rightPointx = positionX + 30;
        this.rightPointy = positionY + 30;
    }

    @Override
    public void Draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(this.color);
        g2.drawLine(upPointx, upPointy, leftPointx, leftPointy);
        g2.drawLine(upPointx, upPointy, rightPointx, rightPointy);
        g2.drawLine(leftPointx, leftPointy, rightPointx, rightPointy);
    }
}
