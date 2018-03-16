package rl22dv_lab3;

public class Card {
	// alla typer av kort som finns
	public enum Farg{Hjarter, Spader, Ruter, Klover}
	public enum Nummer{
		Ett,
		Tva, 
		Tre, 
		Fyra, 
		Fem, 
		Sex, 
		Sju, 
		Atta, 
		Nio, 
		Tio,
		Knekt, 
		Dam, 
		Kung
		}
	
	private final Farg farg;
	private final Nummer nummer;
	private final int siffra;
	
	public Card(Farg fargen, Nummer nummret, int tal ){
		
		farg = fargen;
		nummer = nummret;
		siffra = tal;
		
	}
	
	public Farg getFarg(){
		
		return farg;
		
	}
	
	public Nummer getNummer(){
		
		return nummer;
		
	}
	
	public int getSiffra(){
		
		return siffra;
		
	}
	
	public String toString(){
		
		String text = farg+" "+nummer;
		return text;
	}
}