package junit.monprojet;
public class SommeArgent
{
private int quantite;
private String unite;
public SommeArgent(int amount, String currency)
{ quantite = amount;
unite = currency;
}
public int getQuantite() {
return quantite;
}
public String getUnite() {
return unite;
}
public SommeArgent add(SommeArgent m) throws UniteDistincteException {
    if (!this.unite.equals(m.unite)) {
        throw new UniteDistincteException("Les unites des sommes d'argent sont differentes.");
    }
    return new SommeArgent(this.quantite + m.quantite, this.unite);
}
@Override
public boolean equals(Object anObject) {
    if (this == anObject) {
        return true;
    }
    if (anObject == null || getClass() != anObject.getClass()) {
        return false;
    }
    SommeArgent somme = (SommeArgent) anObject;
    return quantite == somme.quantite &&
            unite.equals(somme.unite);
}

public static void main(String [] args) {
	System.out.println("test");}
}
