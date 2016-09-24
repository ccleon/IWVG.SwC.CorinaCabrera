package es.upm.miw.iwvg.junit;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;


public class FractionTest {
	
    private Fraction f;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void before() {
        f = new Fraction(2, 3);
    }

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
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

    @Test
    public void testEsPropia() {
    	f.esPropia();
    	assertEquals("Si, es propia".trim(), outContent.toString().trim());
    }
 
    @Test
    public void testEsPropiaImpropia() {
    	Fraction f2 = new Fraction(3, 2);
    	f2.esPropia();
    	assertEquals("No, es impropia".trim(), outContent.toString().trim());
    }
    
    @Test
    public void compareFractions(){
    	assertEquals("Es mayor", Fraction.compareFractions(new Fraction(2,1), new Fraction(1,1)));
    	assertEquals("Es menor", Fraction.compareFractions(new Fraction(1,1), new Fraction(2,2)));
    	assertEquals("Es igual", Fraction.compareFractions(new Fraction(1,1), new Fraction(1,1))); 	
    }

    @Test
    public void testTimesFractions(){
    	Fraction timesFraction = new Fraction(5, 2);
    	Fraction result = f.timesFractions(timesFraction);
        assertEquals(10, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

}
