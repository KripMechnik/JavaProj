package Pr6;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void MoveUp() {
        this.topLeft.MoveUp();
        this.bottomRight.MoveUp();
    }

    @Override
    public void MoveDown() {
        this.topLeft.MoveDown();
        this.bottomRight.MoveDown();
    }

    @Override
    public void MoveLeft() {
        this.topLeft.MoveLeft();
        this.bottomRight.MoveLeft();
    }
    @Override
    public void MoveRight() {
        this.topLeft.MoveRight();
        this.bottomRight.MoveRight();
    }

}
