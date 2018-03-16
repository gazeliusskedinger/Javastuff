package rl22dv_lab2;
import java.util.Scanner;

public class StorstaK {
 public static void main(String[] args) {
	 
	 Scanner Scanner = new Scanner(System.in);
	 System.out.println("Ange ett nummer \n: ");
	 
	 int tal = Scanner.nextInt();
	 int kTal = 0;
	 
	 for( int kTot = 0; kTot < tal;){ //för sålänge som ktot är mindre än tal  
		 
		 kTal = kTal + 2;
		 kTot = kTot + kTal;
		 if(kTot > tal){ //kolla av om talet är större är k, isåfall ta bort två.
			 kTal = kTal - 2;
		 }
	 }
	 
	 System.out.println( "Största tal K sådant att 0+2+4+6+...+K < " +tal+" => K = " + kTal);
	 
	 Scanner.close();
		
		/* TODO Auto-generated method stub
		 * Bool method Som kollar svaret. eller do while 
		 */

	}

}
