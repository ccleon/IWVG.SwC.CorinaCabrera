package es.upm.miw.iwvg.junit;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


public class FractionTest {
	
    private Fraction f;

    @Before
    public void before() {
        f = new Fraction(2, 3);
    }
   
    @Test
    public void testFractionIntInt() {
        assertEquals(2, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }
    

    @Test
    public void testFraction() {
        f = new Fraction();
        assertEquals(1, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testDecimal() {
        assertEquals((double)0.6667, f.decimal(), 10e-5);
    }    
}
