package junit.monprojet.test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import junit.monprojet.PorteMonnaie;
import junit.monprojet.SommeArgent;

public class TestPorteMonnaie {
	@Test
    public void testAjouteSomme() {
        PorteMonnaie porteMonnaie = new PorteMonnaie();
        SommeArgent somme1 = new SommeArgent(5, "EUR");
        porteMonnaie.ajouteSomme(somme1);
        assertEquals(5, (int) porteMonnaie.getContenu().get("EUR"));
        SommeArgent somme2 = new SommeArgent(5, "EUR");
        porteMonnaie.ajouteSomme(somme2);
        assertEquals(10, (int) porteMonnaie.getContenu().get("EUR"));
    }
}
