package rl22dv_lab2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Lonerevision {

	public static void main(String[] args) {
		Scanner Scanner =new Scanner(System.in);
		ArrayList<String> inputs = new ArrayList<String>();
		
		int sumLon = 0;
		int loneSkillnad = 0;
		int styck = 0;
		int hogsta = 0;
		int minsta = 1000000000;
		System.out.print("Ange Löner (avsluta med 'X'): ");
		do{ // medans input värdet inte är lika med X fortsätt att lägga till listan
			inputs.add(Scanner.next());
			styck++;
		}while(!(inputs.get(styck-1)).equals("X"));
		
		int[] loner = new int[inputs.size()-1]; // jag lägger till en statisk array minus x avslutningen
		Collections.sort(inputs); // sorterar listan; 
		
		for(int i = 0; i < inputs.size()-1; i++){ // för längden av listan minus x-värdet
			
			loner[i] = Integer.parseInt(inputs.get(i)); // konvertera till int och stoppa in i arrayen alla tal utom x-värdet
			
			if(loner[i] > hogsta){ // 
				hogsta = loner[i]; //
			}					   // plockar ut största och minsta värdet i arrayen för uträkning av lönespridningen.
								   // ett igentligen onödigt steg kom jag på i efterhand då listan sorterades innan jag
			if(loner[i] < minsta){ // konverterade till arrayen och det minsta och högsta värdet är i varsin ända av denna
				minsta = loner[i]; //
			}
			
			sumLon += loner[i];	// räknar ut summan av all lön för medellönen värdet
		}
		
		loneSkillnad = hogsta - minsta; // räknar ut löneskillnaden 
		
		if(loner.length%2 == 0){ //om antalet löner är jämt
			// formel för medianlön och medellön
			System.out.print("Medianlön: "+ (loner[loner.length/2-1]+loner[loner.length/2])/2+"\nMedellön: "+ sumLon/loner.length+"\nLönespridning: "+loneSkillnad);
													
		}
		else{
			// formel för medianlön och medellön		    
			System.out.print("Medianlön: "+ loner[loner.length/2]+"\nMedellön: "+ sumLon/loner.length+"\nLönespridning: "+loneSkillnad);
		
		}
		Scanner.close();
		// TODO Auto-generated method stub
	}

}
