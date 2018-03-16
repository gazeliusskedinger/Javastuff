package rl22dv_lab3;


public class TextAnalyser {
	
	String text = "";
	
	TextAnalyser(String inputText){
		text = inputText;
	}

	public int charCount() {
		int langd = text.length();
		return langd;
	}

	public int upperCaseCount() {
		
		int bokstavAscii = 0;
		int uppercases = 0;
		
		for(int i = 0; i < text.length(); i++){
			
			bokstavAscii = (int)text.charAt(i);
			
			if((bokstavAscii <= 90 && bokstavAscii >= 65) || (bokstavAscii == 197) || (bokstavAscii == 196) || (bokstavAscii == 214) ){
				uppercases++;
			}
		}	
		return uppercases;
	}

	public int whitespaceCount() {
		
		int platsAscii = 0;
		int whiteSpaces = 0;
		
		for(int i = 0; i < text.length(); i++ ){
			platsAscii = (int)text.charAt(i);
			if(platsAscii == 32){
				whiteSpaces++;
			}
		} 
		
		return whiteSpaces;
		
	}

	public int digitCount() {
		
		int numbers = 0;
		int isNumberAscii;
		
		for(int i = 0;  i < text.length(); i++){
			isNumberAscii = (int)text.charAt(i);
			if(isNumberAscii <= 57 && isNumberAscii >= 48 ){
				numbers++;
			}
		} 
		return numbers;
	}

	public boolean containsChar(char test) {
		
		boolean check = false;
		int plats = 0;
		
		while(plats < text.length() && check != true){
			if(text.charAt(plats) == test){
				check = true;
			}
			plats++;
		}
		return check;
	}

	public boolean containsString(String del) {
		
		boolean check = false;
		int langd = del.length();
		int plats = 0;
		String delText = "";
		
		while(plats < text.length() && check != true && (plats + langd) < text.length() ){
			
			delText = text.substring(plats, (plats + langd));
			
			if(delText.equals(del)){
				check = true;
			}
			
			plats++;
			
		}
		return check;
	}
}

