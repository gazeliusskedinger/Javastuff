package rl22dv_lab2;
import java.util.Scanner;

public class Triangle {
	public static void main(String[] args){
		Scanner Scanner = new Scanner(System.in);
		System.out.print("Ange ett positivt, udda heltal \n: ");
		int tal = Scanner.nextInt();
		
		if(tal%2 == 0){ 
			System.out.print("TALET DU ANGAV ÄR INTE JÄMT");
		}
		else{ // ritar trianglar
			System.out.println("Rätvinklig triangel:");
			for(int k = tal-1; k >= 0; k--){ 
				
				for(int j = 1; k >= j; j++){ //ritar ut antalet ' ' per rad 
					System.out.print(" ");
				}
				
				for(int i = 0; i < tal-k; i++ ){ //ritar ut antalet '*' per rad
					System.out.print("*");
				}
				
				System.out.print("\n");
			}
			
			int tal2 = tal/2; //antalet rader för likbenta triangeln 
			int star = 1;
			
			System.out.println("Likbent triangel:");
				for( int n = tal2; n >= 0; n-- ){
					
					for(int l = 1; n >= l; l++){ // ritar ut antalet ' ' per rad
						System.out.print(" ");  
					}
					
					for(int o = 1; o <= star; o++){ // ritar ut antalet '*' per rad
						System.out.print("*");
					}
					
					star += 2;
					System.out.print("\n");
				}
		}
		Scanner.close();
	}
}
