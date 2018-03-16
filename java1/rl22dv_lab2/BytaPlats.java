package rl22dv_lab2;

public class BytaPlats {

	public static void main(String[] args) {
		
		char[] text = {'t','t','ä','l',' ','r','a','v',' ','a','t','t','e','D'};
		int max = text.length - 1;
		String text2 = "";
		
		for(int i = 0; i < text.length; i++){ // skriver ut arrayen 
			System.out.print(text[i]);
		}
		
		System.out.print("\n");
		for(int j = 0; j < text.length; j++){ // läser in arrayen baklänges och sparar detta till en sträng sålägen
			text2 += text[max-j];
		}
		
		for(int k = 0; k < text.length; k++){ //för över strängen tillbaka till arrayen   
			text[k] = text2.charAt(k);
		}
		
		System.out.println(text);//skriver ut arrayen igen 
		// TODO Auto-generated method stub

	}

}
