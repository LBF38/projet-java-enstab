package polygones;

public class Carre extends Rectangle {
    public Carre(Point superieurGauche, double longueurCote) {
        super(superieurGauche, new Point(superieurGauche.getX() + longueurCote, superieurGauche.getY() + longueurCote));
    }

    @Override
    public double surface() {
        double a = points.get(0).distance(points.get(1));
        return a * a;
    }

    @Override
    public String toString() {
        return "Carré à plat : " + texteSommets();
    }
}
