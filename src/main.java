import junit.monprojet.PorteMonnaie;
import junit.monprojet.SommeArgent;

public class Main {
    public static void main(String[] args) {
        PorteMonnaie porteMonnaie = new PorteMonnaie();

        SommeArgent sa1 = new SommeArgent(7, "EUR");
        SommeArgent sa2 = new SommeArgent(7, "EUR");
        SommeArgent sa3 = new SommeArgent(19, "EUR");

        porteMonnaie.ajouteSomme(sa1);
        porteMonnaie.ajouteSomme(sa2);

        System.out.println("Contenu du porte-monnaie apres ajout de sa1 et sa2:");
        System.out.println(porteMonnaie);

        PorteMonnaie expected = new PorteMonnaie();
        expected.ajouteSomme(sa3);

        System.out.println("Contenu attendu du porte-monnaie:");
        System.out.println(expected);

        System.out.println("Le porte-monnaie est-il correct ? " + porteMonnaie.equals(expected));
    }
}
