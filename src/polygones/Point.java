package polygones;

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

    public double getY() {
        return y;
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(p.getX() - x, 2) + Math.pow(p.getY() - y, 2));
    }

    public static boolean memeReel(double a, double b) {
        double epsilon = Math.pow(10, -10);
        return Math.abs(a - b) < epsilon;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }
        if (!(object instanceof Point)) {
            return false;
        }
        Point p = (Point) object;
        return memeReel(p.getX(), x) && memeReel(p.getY(), y);
    }

    @Override
    public String toString() {
        return "<" + x + ", " + y + ">";
    }
}
