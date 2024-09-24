package bTap;

public class MyCircle {
    private MyPoint center = new MyPoint();
    private int radius = 1;

    public MyCircle(int x, int y, int radius) {
        center.setXY(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return center.getX();
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterXY(int x, int y) {
        center.setXY(x, y);
    }

    @Override
    public String toString() {
        return "Circle @ " + center.toString() + " radius=" + radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
