package rl22dv_lab2;
import java.util.Scanner;
public class NastStorsta {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.print("Ange ett tio stycken heltal'\n: ");
		int nastStorsta = 0;
		int storsta = 0;
		int tal; 
		
		for(int i = 0; i < 10; i++){ // går så många varv som det skall vara tal.
			
			tal = Scanner.nextInt(); 
			
			if(storsta < tal){ 		// kollar vilket tal som är störst 
				nastStorsta = storsta; // flyttar nuvarande största till nastStorsta;
				storsta = tal; 		// byter ut storsta tal mot nya största
			}
			
		}
		
		System.out.println("Näst största tal är = "+nastStorsta);
		Scanner.close();
		
		// TODO Auto-generated method stub

	}

}
