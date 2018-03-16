package rl22dv_lab3;

public class Fraction {
	
	private int taljare;
	private int namnare;
	
	Fraction(int numerator, int denominator){//konstruktor två input värden
		
		if(denominator == 0){ //ger error om nämnaren är noll och om den är noll räkna med ett
			
			System.err.print("Only Chuck Norris can divide by Zero...\nDenumerator is set to one!!!\n");
			
			taljare = numerator;
		 	namnare = 1;
		 	
		}
		else{
			
			taljare = numerator;
			namnare = denominator;
			
		}
		simplify(); // den förenklar vid objektets skapande
	}

	public int getNumerator(){ // returnera täljare
		
		return taljare;
		
	}
	
	public int getDenominator(){ // returnerar nämnare
		return namnare;
	}
	
	private boolean isNegative(int var){ // kollar om in värdet är negativt
		
		if(var < 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public String toString(){ // ändrar bråket till en sträng
	    
		if(isNegative(taljare) && isNegative(namnare)){
			
			return ((taljare)-(taljare*2))+"/"+((namnare)-(namnare*2)); // gör om talet till positivt
			
		}
		else{
			
			return taljare+"/"+namnare;
			
		}
	}
	
	public Fraction add(Fraction tal){ // adderar bråk
		
		int talj2 = tal.getNumerator();
		int namn2 = tal.getDenominator();
		
		int talj = getNumerator();
		int namn = getDenominator();

		int newNamn;
		int newTalj;
		
		if(namn == namn2){ // adderar bara täljare om nämmnare är samma
			
			newTalj = talj + talj2;
			newNamn = namn;
			
		}
		else{ // adderar om nämnarna är olika
			
			talj = talj * namn2;
			talj2 = talj2 * namn;
			newNamn = namn * namn2;
			newTalj = talj + talj2;
			
		}
		
		Fraction nyFraction = new Fraction(newTalj, newNamn);
		
		return nyFraction;
		
	}
	
	public Fraction subtract(Fraction tal){ // subtraherar bråk
		
		int talj2 = tal.getNumerator();
		int namn2 = tal.getDenominator();
		
		int talj = getNumerator();
		int namn = getDenominator();

		int newNamn;
		int newTalj;
		
		if(namn == namn2){ //subtraherar bara täljare om nämnare är samma 
			
			newTalj = talj - talj2;
			newNamn = namn;
			
		}
		else{ // adderar om nämnarna är olika
			
			talj = talj * namn2;
			talj2 = talj2 * namn;
			newNamn = namn * namn2;
			newTalj = talj - talj2;
			
		}
		
		Fraction nyFraction = new Fraction(newTalj, newNamn);
		
		return nyFraction;
		
	}
	
	public Fraction divide(Fraction f){ // dividerar bråk

		int talj = taljare;
		int talj2 = f.getNumerator();
		int namn = namnare;
		int namn2 = f.getDenominator();

		int talj3 = talj * namn2; //divisions steget
		int namn3 = namn * talj2;
		
		Fraction fNew = new Fraction(talj3, namn3);
		return fNew;
	}

	public Fraction multiply(Fraction f){ // multiplicerar bråk

		int talj = taljare;
		int talj2 = f.getNumerator();
		int namn = namnare;
		int namn2 = f.getDenominator();

		int talj3 = talj * talj2; // multiplikations steget
		int namn3 = namn * namn2;
		
		Fraction fNew = new Fraction(talj3, namn3);
		return fNew;
	}

	private int euklides(int taljare, int namnare){//euklides algoritm
		
		int storsta = namnare;
		int minsta = taljare;
		
		if(minsta > storsta){ // kollar att rätt tal är ströst innan euklides 
			
			int temp = minsta;
			minsta = storsta;
			storsta = temp;
			
		}
		
		while(minsta != 0){ // euklides algoritm
			
			int temp = storsta % minsta;
			storsta = minsta;
			minsta = temp;
			
		}
		
		return storsta;
		
	}
	
	private void simplify(){ // denna förenklar från SGD till tälj och nämn 
		
		int SGD =  euklides(taljare, namnare);

		int newTaljare = taljare / SGD;
		int newNamnare = namnare / SGD;
		
		taljare = newTaljare;
		namnare = newNamnare;

	}

	public boolean isEqual(Fraction f){ //kollar om bråken är lika 

		int varde1 = taljare / namnare;
		int varde2 = f.getNumerator() / f.getDenominator();

		if(varde1 == varde2 ){
			
			return true;
			
		}
		else{
			
			return false;
			
		}
	}
}
