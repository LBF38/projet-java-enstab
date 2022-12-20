package shapes;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Génération de N entre [5, 10]
        double N = new Random().nextDouble(5) + 5;
        // Liste des cercles
        ArrayList<Circle> circles = new ArrayList<Circle>();
        for (double i = 0; i < N; i++) {
            // Génération de rayon entre [1.0, 3.0]
            double radius = new Random().nextDouble(2) + 1;
            // Génération du centre aléatoirement : x et y entre [2.0, 5.0]
            double x = new Random().nextDouble(3) + 2;
            double y = new Random().nextDouble(3) + 2;
            Circle circle = new Circle(radius, x, y);
            circles.add(circle);
            System.out.println("Cercle " + i + " : " + circle);
        }
        // Affichage du cercle avec la plus petite surface et celui le plus éloigné de
        // l'origine
        int maxIndex = 0;
        int minIndex = 0;
        double maxDistance = circles.get(maxIndex).distanceToOrigin();
        double minArea = circles.get(minIndex).area();
        for (Circle circle : circles) {
            if (circle.area() < minArea) {
                minIndex = circles.indexOf(circle);
                minArea = circle.area();
            }
            if (circle.distanceToOrigin() > maxDistance) {
                maxIndex = circles.indexOf(circle);
                maxDistance = circle.distanceToOrigin();
            }
        }
        System.out.println("Cercle " + minIndex + " a la plus petite surface : " + minArea);
        System.out.println("Cercle " + maxIndex + " est le plus éloigné de l'origine : " + maxDistance);
    }
}
