package rl22dv_lab2;
import java.util.Scanner;

public class Baklanges {

	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		System.out.print("Skriv en text \n: ");
		
		String text = Scanner.nextLine();
		System.out.print("Baklänges: " );
		
		for (int i = text.length()-1; i >= 0; i--){ // reverserar längden av strängen och skriver ut allt baklänges
			System.out.print(text.charAt(i));
		}
		
		Scanner.close();
		
		// TODO Auto-generated method stub

	}

}
