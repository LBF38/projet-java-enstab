package bibliotheque;

import java.util.*;

public class Bibliotheque {
    private final List<Document> biblio;

    public Bibliotheque(int capacite) {
        biblio = new ArrayList<Document>(capacite);
    }

    public void afficherDocuments() {
        for (int i = 0; i < biblio.size(); i++) {
            System.out.println(biblio.get(i));
        }
    }

    public Document document(int i) {
        return biblio.get(i);
    }

    public boolean ajouter(Document doc) {
        return biblio.add(doc);
    }

    public boolean supprimer(Document doc) {
        return biblio.remove(doc);
    }

    public void afficherAuteurs() {
        for (int i = 0; i < biblio.size(); i++) {
            if (biblio.get(i) instanceof Book) {
                System.out.println(((Book) biblio.get(i)).getAuthor());
            }
        }
    }
}
