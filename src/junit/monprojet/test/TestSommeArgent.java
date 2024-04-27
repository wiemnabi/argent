package junit.monprojet.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import junit.monprojet.SommeArgent;
import junit.monprojet.UniteDistincteException;

class SommeTest {
  private SommeArgent m12CHF;
  private SommeArgent m14CHF;
  private SommeArgent m14USD;
  private static int count = 0;
  @BeforeEach
  public void setUp() {
	  count++;
      System.out.println(count + "ime passage Avant exécution d'une méthode de test");

      m12CHF = new SommeArgent(12, "CHF");
      m14CHF = new SommeArgent(14, "CHF");
      m14USD = new SommeArgent(14, "USD");
  }
  
	   @Test
	    public void testAddition() throws UniteDistincteException{
	        SommeArgent somme1 = new SommeArgent(10, "USD");
	        SommeArgent somme2 = new SommeArgent(20, "USD");
	        SommeArgent expected = new SommeArgent(30, "USD");
	        SommeArgent result = somme1.add(somme2);
	        assertEquals(expected, result);
	    }
	   @Test
	    public void Testequals() {
	   Assert.assertTrue(!m12CHF.equals(null)); 
	   Assert.assertEquals(m12CHF, m12CHF); 
	   Assert.assertEquals(m12CHF, new SommeArgent(12, "CHF"));  
	   Assert.assertTrue(!m12CHF.equals(m14CHF)); 
	   Assert.assertTrue(!m14USD.equals(m14CHF));}
	   @AfterEach
	   public void tearDown() {
	      System.out.println(count + "ime passage APRES exécution d'une méthode de test");
	   }
	   
 
   @Test
   public void testAdditionWithDistinctUnits() {
       SommeArgent somme1 = new SommeArgent(10, "USD");
       SommeArgent somme2 = new SommeArgent(20, "EUR");
       assertThrows(UniteDistincteException.class, () -> somme1.add(somme2));
   }
   
   
   
   
   
   
   
   
   
//
//   @Test
//   public void testEquals() {
//       assertNotNull(m12CHF);
//       assertNotNull(m14CHF);
//       assertNotNull(m14USD);
//
//       assertFalse(m12CHF.equals(null));
//       assertEquals(m12CHF, m12CHF);
//       assertEquals(m12CHF, new SommeArgent(12, "CHF"));
//       assertFalse(m12CHF.equals(m14CHF));
//       assertFalse(m14USD.equals(m14CHF));
//   }

}