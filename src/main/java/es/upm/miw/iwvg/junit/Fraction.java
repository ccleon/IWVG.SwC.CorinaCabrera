package es.upm.miw.iwvg.junit;

/**
 * Conceptos: Las fracciones propias son aquellas cuyo numerador es menor que el
 * denominador
 * 
 * Las fracciones impropias son aquellas cuyo numerador es mayor que el
 * denominador
 * 
 * Dos fracciones son equivalentes cuando el producto de extremos (numerador de
 * la primera por denominador de la segunda) es igual al producto de medios
 * (denominador de la primera por el numerador de la segunda)
 * 
 * Las fracciones irreducibles son aquellas que no se pueden simplificar, esto
 * sucede cuando el numerador y el denominador son primos entre sí
 * 
 * Reducir varias fracciones a común denominador consiste en convertirlas en
 * otras equivalentes que tengan el mismo denominador
 * 
 * Comparar fracciones
 * 
 * Suma fracciones: En primer lugar se reducen los denominadores a común
 * denominador, y se suman o se restan los numeradores de las fracciones
 * equivalentes obtenidas
 * 
 * Multiplicación: La multiplicación de dos fracciones es otra fracción que
 * tiene: Por numerador el producto de los numeradores. Por denominador el
 * producto de los denominadores.
 * 
 * La división de dos fracciones es otra fracción que tiene: Por numerador el
 * producto de los extremos. Por denominador el producto de los medios. Invertir
 * fraccion
 * 
 * @author jbernal
 * 
 */
public class Fraction {

	private int numerator;

	private int denominator;

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public Fraction() {
		this(1, 1);
	}

	public double decimal() {
		return (double) numerator / denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void esPropia() {
		if (this.numerator > this.denominator) {
			System.out.println("No, es impropia");
		} else {
			System.out.println("Si, es propia");
		}
	}

	public static String compareFractions(Fraction a, Fraction b) {
		String message = "";
		if (a.getNumerator() > b.getDenominator())
			message = "Es mayor";
		else if (a.getNumerator() < b.getDenominator())
			message = "Es menor";
		else
			message = "Es igual";
		return message;
	}
	
	public Fraction timesFractions(Fraction times){
		int numeratorResult = times.getNumerator() * this.numerator;
		int denominatorResult = times.getDenominator() * this.denominator;
		return new Fraction(numeratorResult, denominatorResult);
		
	}

}
