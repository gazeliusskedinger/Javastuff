package rl22dv_lab3;

import java.util.ArrayList;
import rl22dv_lab3.Card.Farg;
import rl22dv_lab3.Card.Nummer;

public class Deck {
	
	
	private ArrayList<Card> kortLek = new ArrayList<Card>();
	public Deck(){
		int tal = 0;
		for(Farg farg : Farg.values()){ // dessa forloopar skapar ett kort av varje och delar ut dessa till arrayen.  
			
			for(Nummer nummer : Nummer.values()){
				//switch satsen ger en siffra till varje kort nummer. 
				switch(nummer){
				
				case Ett:
					tal = 0;
					break;
				case Tva:
					tal = 1;
					break;
				case Tre:
					tal = 2;
					break;
				case Fyra:
					tal = 3;
					break;
				case Fem:
					tal = 4;
					break;
				case Sex:
					tal = 5;
					break;
				case Sju:
					tal = 6;
					break;
				case Atta:
					tal = 7;
					break;
				case Nio:
					tal = 8;
					break;
				case Tio:
					tal = 9;
					break;
				case Knekt:
					tal = 10;
					break;
				case Dam:
					tal = 11;
					break;
				case Kung:
					tal = 12;
					break;
				}
			kortLek.add(new Card(farg, nummer, tal));
			}
		}
	}
		
		// TODO Auto-generated method stub

	public ArrayList<Card> getDeck(){// returnerar en kortlek
		
			return new ArrayList<Card>(kortLek);
			
	}
	
	public void test(){ // ta bort innan inl
		
		for(int i = 0; i < kortLek.size(); i++ ){
			
			System.out.println(kortLek.get(i).toString());
		
		}
	}
	
	private void shuffle(){
		
		int plats;
		Card tempEttStegUpp;
		Card temp;
		int ran;
		
		for(int i = 0; i < 156; i++){ // så här många ggr skall leken blandas
			
			ran = (int)(Math.random()*13)+1; // genererar ett blandtal
	
			
			
			// för valje gång leken skall blandas, ta blandtalet och byter plats på korten
			// som befinner sig i varje position som blandtalet subtraherat med sig 
			// själv förekommer, tills det totala talet blir störe eller = 0.
			//
			
			if(i % 2 == 0){
				plats = kortLek.size()-1;
				
				while(plats >= 0 && (plats - ran) >= 0){ // stegar nedåt i intervallet ran och byt er plats på kort en ran till ned 

					if((plats - ran) <= 0){
						
						tempEttStegUpp = kortLek.get(plats-ran);
						temp = kortLek.get(plats);
						
						kortLek.set(plats, tempEttStegUpp);
						kortLek.set((plats-ran), temp);
							
					}
					plats = plats - ran;
				}
			}
			// denna gör samma sak fast nedifrån och upp för en jämnare blandning
			
			else{
				plats = 0;
				
				while(plats < kortLek.size()){ // samma sak fast uppåt..
					
					if((plats + ran) < kortLek.size()){
						
						tempEttStegUpp = kortLek.get(plats+ran);
						temp = kortLek.get(plats);
						
						kortLek.set(plats, tempEttStegUpp);
						kortLek.set((plats+ran), temp);
							
					}
					plats = plats + ran;
				}
			}
		}
	}
	
	
	public void givAntal(int ant){
		
		shuffle();
		ArrayList<Card> nyKortlek = getDeck();
		
		if(ant > 52){ // kollar att det inte tas för många kort
			
			while(ant > 52){ // drar bort alla överflöd 
				
				ant = ant-52;
				
			}
			// skriver error
			System.err.println("Du angav mer kort är det finns i en kortlek!\nHar ändrat värdet till närmaste överflöd :"+ ant);;
		}
		
		for(int i = 0; i < ant; i++){// så många kort skall ges
			
			System.out.println(nyKortlek.get(i).toString());
			
		}
		
		int resterandeKort = (kortLek.size() - ant);
		
		System.out.println(resterandeKort);
	}
}