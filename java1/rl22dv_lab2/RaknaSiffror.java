package rl22dv_lab2;
import java.util.Scanner;
public class RaknaSiffror {

	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		
		int sense = 0;
		int jamna = 0;
		int ojamna = 0;
		int nolla = 0;
		
		System.out.println("Ange ett tal! \n: ");
		String tal = Scanner.nextLine();
		String[] array = tal.split("");
		
		for(int i = 0; i < array.length; i++){ // för textens längd, konverterar till int räkna nolla jämt och ojämt 
			
			sense = Integer.parseInt(array[i]);
			
			if(sense == 0){ 
				nolla++;
			}
			
			else if(sense%2 == 0){
				jamna++;
			}
			
			else{
				ojamna++;
			}
			
		}
		
		System.out.print("jämna: "+jamna +"\nOjämna: "+ ojamna + "\nNollor: " + nolla);
		
		Scanner.close();
		
		// TODO Auto-generated method stub

	}

}
