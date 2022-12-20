package polygones;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Polygone polygone1 = new Polygone(new ArrayList<Point>() {
            {
                add(new Point(0, 0));
                add(new Point(0, 1));
                add(new Point(1, 1));
                add(new Point(1, 0));
            }
        });

        System.out.println(polygone1);
        System.out.println("Périmètre : " + polygone1.perimetre());
        System.out.println("Surface : " + polygone1.surface());

        Triangle triangle = new Triangle(new Point(0, 0), new Point(0, 1), new Point(1, 0));
        System.out.println(triangle);
        System.out.println("Périmètre : " + triangle.perimetre());
        System.out.println("Surface : " + triangle.surface());

        Rectangle rectangle = new Rectangle(new Point(0, 0), new Point(1, 1));
        System.out.println(rectangle);
        System.out.println("Périmètre : " + rectangle.perimetre());
        System.out.println("Surface : " + rectangle.surface());

        Carre carre = new Carre(new Point(0, 0), 2);
        System.out.println(carre);
        System.out.println("Périmètre : " + carre.perimetre());
        System.out.println("Surface : " + carre.surface());
    }
}
