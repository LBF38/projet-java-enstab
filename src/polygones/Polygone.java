package polygones;

import java.util.ArrayList;

public class Polygone {
    protected ArrayList<Point> points;

    public Polygone(ArrayList<Point> points) {
        this.points = points;
    }

    public ArrayList<Point> getSommets() {
        return points;
    }

    public double perimetre() {
        double perimetre = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            perimetre += points.get(i).distance(points.get(i + 1));
        }
        perimetre += points.get(points.size() - 1).distance(points.get(0));
        return perimetre;
    }

    public double surface() {
        // A implémenter. Pas calculable pour le moment.
        return -1;
    }

    public String texteSommets() {
        String texte = "";
        for (Point point : points) {
            texte += point.toString() + " ";
        }
        return texte;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }
        if (!(object instanceof Polygone)) {
            return false;
        }
        Polygone p = (Polygone) object;
        return p.getSommets().equals(points);
    }

    @Override
    public String toString() {
        return "Polygone à " + points.size() + " sommets : " + texteSommets();
    }
}
