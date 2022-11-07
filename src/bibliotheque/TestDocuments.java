package bibliotheque;

public class TestDocuments {
    public static void main(String[] args) {
        Novel leRougeEtLeNoir = new Novel(1, "Le rouge et le noir", "Stendhal", 563, null);
        Novel leursEnfantsApresEux = new Novel(2, "Leurs enfants après eux", "Nicolas Matthieu", 354,
                Novel.LiteraryPrice.GONCOURT);
        Manual histoire6eme = new Manual(7, "Histoire-Géographie-EMC 6e", "Émilie Blanchard", 154,
                Manual.Level.COLLEGE);
        Magazine geoJuin2019 = new Magazine(56, "Géo", 6, 2019);
        Dictionary harrapsDePoche = new Dictionary(82, "Harrap's de poche", Dictionary.Language.ENGLISH);
        System.out.println("leRougeEtLeNoir=" + leRougeEtLeNoir.toString());
        System.out.println("leursEnfantsApresEux=" + leursEnfantsApresEux.toString());
        System.out.println("histoire6eme=" + histoire6eme.toString());
        System.out.println("geoJuin2019=" + geoJuin2019.toString());
        System.out.println("harrapsDePoche=" + harrapsDePoche.toString());
    }
}
