public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Point otherPoint) {
        double dx = this.x - otherPoint.getX();
        double dy = this.y - otherPoint.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double norm() {
        return Math.sqrt(x * x + y * y);
    }

    
    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(4, 6);

        double distance = point1.distance(point2);
        double norm = point1.norm();

        System.out.println("Distance between points: " + distance);
        System.out.println("Norm of point1: " + norm);
    }
}
