package polygones;

import java.util.ArrayList;

public class ListePolygone {
    private ArrayList<Polygone> listePolygone;

    public ListePolygone() {
        listePolygone = new ArrayList<Polygone>();
    }

    public boolean ajoutPolygone(Polygone polygone) {
        return listePolygone.add(polygone);
    }

    public void afficheInfos() {
        for (Polygone polygone : listePolygone) {
            System.out.println(polygone);
            System.out.println("\tPérimètre : " + polygone.perimetre());
            System.out.println("\tSurface : " + polygone.surface());
        }
    }

    @Override
    public String toString() {
        return "Liste de " + listePolygone.size() + " polygones";
    }
}
