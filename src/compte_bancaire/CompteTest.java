package compte_bancaire;

import org.junit.*;
import static org.junit.Assert.*;

public class CompteTest {
    Compte compte1;
    Compte compte2;

    @Before
    public void setup() {
        System.out.println("Début des tests");
        compte1 = new Compte("J. DUPONT");
        compte1.setSolde(1000);
        compte2 = new Compte("C. DURANT", 50000, 6000, 5000);
    }

    @After
    public void teardown() {
        System.out.println("Fin des tests");
    }

    @Test
    public void ConstructeurCompte() {
        System.out.println("Test des constructeurs de la classe Compte");
        Compte compte = new Compte("DUPONT");
        assertNotNull(compte.getID());
        assertEquals("DUPONT", compte.getTitulaire());
        assertEquals(0, compte.getSolde(), 0);
        assertEquals(800, compte.getDecouvertMax(), 0);
        assertEquals(1000, compte.getDebitMax(), 0);

        Compte compte2 = new Compte("GOLDMAN", 50, 1000, 1000);
        assertNotNull(compte.getID());
        assertEquals("GOLDMAN", compte2.getTitulaire());
        assertEquals(50, compte2.getSolde(), 0);
        assertEquals(1000, compte2.getDecouvertMax(), 0);
        assertEquals(1000, compte2.getDebitMax(), 0);
    }

    @Test
    public void affichageCompte() {
        System.out.println("Test de l'affichage de la classe Compte");
        System.out.println("Compte 1: " + compte1);
        System.out.println("Compte 2: " + compte2);
    }

    @Test
    public void debiterComptes() {
        System.out.println("Débit du compte 1 de 300€");
        compte1.debiter(300);
        System.out.println("Débit du compte 2 de 600€");
        compte2.debiter(600);
    }

    @Test
    public void crediterComptes() {
        System.out.println("Crédit du compte 1 de 500€");
        compte1.crediter(500);
        affichageCompte();
    }

    @Test
    public void virement(){
        System.out.println("Virement de 1000€ du compte 1 vers le compte 2");
        compte1.effectuerVirement(1000, compte2);
        affichageCompte();
    }
}
