package sortera_orter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class OrtMain {

	public static void main(String[] args) {
		
		ArrayList<Ort> lista;
		
		try{
			
			 lista = loadData(args[0]);
			 Ort[] ortArray = listToArray(lista);
			 Arrays.sort(ortArray);
			 
			 for(int i = 0; i < ortArray.length; i++){
				 System.out.println(ortArray[i].getPostNum()+" "+ortArray[i].getPostOrt());
			 }
			 
		}
		catch(Exception e){
			
			System.err.println(e.toString());
			System.exit(0);
			
		}
		
		
		
		
		// TODO Auto-generated method stub

	}
	//laddar data från fil
	public static ArrayList<Ort> loadData(String sokvag)throws FileNotFoundException{
		
		ArrayList<Ort> lista = new ArrayList<Ort>();
		String[] varden = new String[2];
		
		String salange;
		int postNummer;
		
		File file = new File(sokvag);
		Scanner inFile = new Scanner(file);
		
		// adderar data radvis till en sträng
		while(inFile.hasNextLine()){
			
			salange = inFile.nextLine();
			varden = salange.split(";");
			postNummer = Integer.parseInt(varden[0]);
			lista.add(new Ort(postNummer, varden[1]));
			
		}
		
		inFile.close();
		
		return lista;
		
	}
	//gör om ArrayList till Array
	public static Ort[] listToArray(ArrayList<Ort> array){
		Ort[] ortArray = new Ort[array.size()];
		
		for(int i = 0; i < array.size(); i++){
			ortArray[i] = array.get(i);
		}
		
		return ortArray;
	}
	
}
