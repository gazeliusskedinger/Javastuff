package rl22dv_lab2;

import java.util.Scanner;  
public class RaknaA {

	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		System.out.print("Skri en text \n: ");
		String text = Scanner.nextLine();
		
		int storaA = 0;
		int lillaA = 0;
		
		for (int i=0; i < text.length(); i++){ // räknar an och stora An igenom texten
			
			if(text.charAt(i) == 'A'){
				storaA++;
			}
			
			if(text.charAt(i) == 'a'){
				lillaA++;
			}	
		}
		
		System.out.println("Antal A: "+storaA+"\nAntal a: "+lillaA);
		
		Scanner.close();
		
		
		// TODO Auto-generated method stub

	}

}
