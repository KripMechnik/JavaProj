package Pr3;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
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
