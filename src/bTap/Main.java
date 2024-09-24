package bTap;

public class Main {

    public static void TestMyCycle() {
        MyPoint p1 = new MyPoint(3, 0);
        MyPoint p2 = new MyPoint(0, 4);

        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(5, 6));

        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
        }

        for (MyPoint point : points) {
            System.out.println(point);
        }
    }

    public static void TestMyTriangle() {
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(3, 0);
        MyPoint p3 = new MyPoint(0, 4);

        MyTriangle t1 = new MyTriangle(p1, p2, p3);
        System.out.println(t1);
        System.out.println(t1.getPerimeter());
    }

    public static void main(String[] args) {

        //Test MyCircle
        TestMyCycle();

        //Test MyTriangle
        TestMyTriangle();
    }
}
