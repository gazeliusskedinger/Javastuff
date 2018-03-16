package rl22dv_lab4;

import java.io.File;
import java.util.Scanner;

public class RaknaTecken {

	// Laddar in datafilen och skapar en lång text sträng med data
	public static String fileReader(String args)throws Exception{
		
		String data = "";
		String sokvag = args;
		
		File file = new File(sokvag);
		Scanner inFile = new Scanner(file);
		StringBuilder inputData = new StringBuilder(); 
		
		
		
		// adderar data radvis till en sträng
		while(inFile.hasNextLine()){
			
			inputData.append(inFile.nextLine()+"\n");
			
		}
		
		data = inputData.toString();
		inFile.close();
		
		return data;
		
	}
		
	public static void rakna(String text){
		
		int asciiBokstav;
		int storBok = 0;
		int litenBok = 0;
		int blank = 0;
		int ovriga = 0;
		
		for(int i = 0; i < text.length();i++){
			
			asciiBokstav = text.charAt(i);
			System.out.println(asciiBokstav+" "+ text.charAt(i));
			
			if((asciiBokstav < 91 && asciiBokstav > 64) || (asciiBokstav < 215 && asciiBokstav > 191) || (asciiBokstav < 224 && asciiBokstav > 215)){
				storBok++;
			}
			else if((asciiBokstav < 123 && asciiBokstav > 96) || (asciiBokstav < 247  && asciiBokstav > 225) || (asciiBokstav <= 255 && asciiBokstav > 247)){
				litenBok++;
			}
			else if(asciiBokstav == 9 || asciiBokstav == 13 || asciiBokstav == 32 || asciiBokstav == 10){
				blank++;
			}
			else{
				ovriga++;
			}
			
		}
		
		System.out.println("Antal Stora bokstäver: "+storBok + "\n" +"Antal Små Bokstäver: "+ litenBok + "\n" + "Antal 'whitespaces': " + blank + "\n"+ "Antal övriga: " + ovriga +"\n"+text.length());
		
	} 
		
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try{
			String data = fileReader(args[0]);
			System.out.println(data);
			rakna(data);
				
			
			
		}
		catch(Exception e){
			System.err.print(e.toString());
			System.exit(0);
			
		}
	}

}
