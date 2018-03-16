package rl22dv_lab2;
import java.util.Scanner;
import java.util.ArrayList;
public class OmvandOrdning {

	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		ArrayList<String> inputs = new ArrayList<String>();
		int plats = 0;
		
		do{ // medans input är positivt. Lägg till tal i lista
			
			System.out.print("tal "+(plats+1)+": "  );
			
			inputs.add(Scanner.nextLine()); 
			plats++;
			
		}while(Integer.parseInt(inputs.get(plats-1)) >= 0); 
		
		System.out.println("Antal positiva tal: "+ (plats-1));
		System.out.println("Baklänges: ");
		
		for(int j = 0; j < plats-1; j++){ //skriver ut arrayen baklänges
			
			System.out.print(inputs.get(plats-2 - j));
			
			if(j != plats-2){ // så länge det inte finns något mer tal i arrayen  gör ett , mellan talen
				System.out.print(", ");
			}
		}
		
		Scanner.close();
		// TODO Auto-generated method stub

	}

}
