package Pr6;

public class MovableCircle implements Movable{
    private MovablePoint center;
    private int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void MoveUp() {
        this.center.MoveUp();
    }

    @Override
    public void MoveDown() {
        this.center.MoveDown();
    }

    @Override
    public void MoveLeft() {
        this.center.MoveLeft();
    }

    @Override
    public void MoveRight() {
        this.center.MoveRight();
    }
}
