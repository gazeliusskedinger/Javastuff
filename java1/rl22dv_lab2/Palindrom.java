package rl22dv_lab2;
import java.util.Scanner;
public class Palindrom {
final static int ANTBOK=29; 
	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		System.out.print("Ange en textsträng \n: ");
		String textFormatted = "";
		String textFormattedReversed = "";
		String text = Scanner.nextLine();
		int antalRattBok = 0;
		
		
		
		
		for(int i = 0; i < text.length(); i++){ // för längden av texten  
			
			if(Character.isLetter(text.charAt(i))){ //sorterar ut bokstäver till en annan array
				textFormatted += Character.toLowerCase(text.charAt(i)); // gör alla bokstäver till små
			}
		}
		
		for(int j = textFormatted.length(); j > 0; j--){ // reversing string  
			textFormattedReversed += textFormatted.charAt(j-1);
		}
		
		for(int k = 0; k < textFormatted.length(); k++){ // Kollar hur många bokstäver som är lika i reverserad och vanliga frórmaterade arrayen
			if((textFormatted.charAt(k)) == (textFormattedReversed.charAt(k))){
				antalRattBok++; 
			} 
		}
		
		if(antalRattBok == textFormatted.length()){ // om antalet bokstäver är lika med längden av texten
			System.out.println("Det är ett palindrom!");
		}
		else{
			System.out.println("Det är inte ett palindrom!");
		}
		
		Scanner.close();
		// TODO Auto-generated method stub

	}

}
