package rl22dv_lab3;

public class FractionMain {

	public static void main(String[] args) {
		
		Fraction f1 = new Fraction(6,4); // sätter bråket f1 till sex fjärdedelar.
		Fraction f2 = new Fraction(2,-3); // sätter bråket f2 till två tredjedelar.
		
		System.out.println(f1.toString()); // skriver ut en sträng av bråktalen 
		System.out.println(f2.toString());
		
		System.out.println(f1.getNumerator()); // Hämtar täljaren
		System.out.println(f1.getDenominator()); // hämtar nämnaren
		
		Fraction f3 = f1.add(f2); //adderar f1 och f2 till f3 = 5/6
		System.out.println(f3.toString());
		
		Fraction f4 = f1.divide(f2); // delar f1 och f2 till f4 = 9/-4 
		System.out.println(f4.toString());
		
		Fraction f5 = f1.subtract(f2); // subtraherar f2 från f3  till f5 = 13/6
		System.out.println(f5.toString());
		
		Fraction f6 = f1.multiply(f2); // multiplicerar f1 och f3 till f6 = 1/-1
		System.out.println(f6.toString());
		
		Fraction f7 = new Fraction(3,12); // skapar två lika bråk
		Fraction f8 = new Fraction(6,24);
		
		System.out.println(f7.toString()); // skriver ut och ser att den förenklar.
		System.out.println(f8.toString());
		
		System.out.println(f7.isEqual(f8)); //kollar om två bråk är lika
		System.out.println(f7.isEqual(f5)); //kollar om tå andra bråk är lika
		
		 
		
	}
}
