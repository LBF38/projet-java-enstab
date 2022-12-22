package polygones;

import java.util.ArrayList;

public class Triangle extends Polygone {
    public Triangle(Point p1, Point p2, Point p3) {
        super(new ArrayList<Point>() {
            {
                add(p1);
                add(p2);
                add(p3);
            }
        });
    }

    /**
     * Calcule la surface du triangle avec la formule de Heron.
     */
    @Override
    public double surface() {
        double a = points.get(0).distance(points.get(1));
        double b = points.get(1).distance(points.get(2));
        double c = points.get(2).distance(points.get(0));
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String toString() {
        String typeTriangle = "";
        if (points.get(0) == points.get(1) && points.get(1) == points.get(2))
            typeTriangle = "Triangle équilatéral";
        else if (points.get(0) == points.get(1) || points.get(1) == points.get(2) || points.get(2) == points.get(0))
            typeTriangle = "Triangle isocèle";
        else
            typeTriangle = "Triangle scalène";
        return typeTriangle + " : " + texteSommets();
    }
}
