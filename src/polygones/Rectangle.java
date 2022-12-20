package polygones;

import java.util.ArrayList;

public class Rectangle extends Polygone {
    public Rectangle(Point superieurGauche, Point inferieurDroit) {
        super(new ArrayList<Point>() {
            {
                add(superieurGauche);
                add(new Point(inferieurDroit.getX(), superieurGauche.getY()));
                add(inferieurDroit);
                add(new Point(superieurGauche.getX(), inferieurDroit.getY()));
            }
        });
    }

    @Override
    public double surface() {
        double a = points.get(0).distance(points.get(1));
        double b = points.get(1).distance(points.get(2));
        return a * b;
    }

    @Override
    public String toString() {
        return "Rectangle à plat : " + texteSommets();
    }
}
