package rl22dv_lab2;

import java.util.Scanner;
public class HighLow {

	public static void main(String[] args) {
		// var deklarationer
		Scanner Scanner = new Scanner(System.in);
		int tal = (int)(Math.random()*101);
		int gissning;
		int antGissning = 0;
		boolean kommentar = false;
		
		do{ // medans man inte gissat rätt eller har gjort tio gissningar
			
			System.out.print("Ange en gissning \n: ");
			gissning = Scanner.nextInt(); //plocka gissning
			
			if(gissning > tal){ // om gisningen är större än tal
				System.out.print("Talet du angav är större än talet du skall gissa på.");
				
			}else if(gissning < tal){ // om gissningen är mindre än tal
				System.out.println("Talet du angav är mindre ä talet du skall gissa på.");
			}
			
			if(tal == gissning){ // om gissning är rätt
				kommentar = true; // för vilken kommentar som blir lämplig
			}
			
			antGissning++;
			System.out.println(antGissning);
			
		}while(gissning != tal && antGissning < 10);
		
		if(kommentar == true){
			System.out.println("Du har gissat rätt efter "+ antGissning + " gånger."); //om talet är true
		}
		
		else{
			System.out.print("Du har gissat över tio gånger, du får försöka igen"); // om talet är false 
		}
		
		Scanner.close();
		// TODO Auto-generated method stub

	}

}
