package rl22dv_lab4;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Histogram {

	Histogram(){
		
	}
	
	public static void main(String[] args) {
		
		String data = "";
		double[] array;
		
		try{
			
			data = fileReader(args[0]);
			array = dataToNumberArray(data);
			makeHistogram(array);
			
		}
		catch(Exception e){
			
			System.err.println(e.toString());
			System.exit(0);
			
		}
		
	}
	// Laddar in datafilen och skapar en lång text sträng med data
	public static String fileReader(String args)throws FileNotFoundException{
		
		String data = "";
		String sokvag = "data.dat";
		
		File file = new File(sokvag);
		Scanner inFile = new Scanner(file);
		StringBuilder inputData = new StringBuilder(); 
		
		// adderar data radvis till en sträng
		while(inFile.hasNextDouble()){
			
			inputData.append(inFile.nextDouble()+"\n");
			
		}
		
		data = inputData.toString();
		
		inFile.close();
		
		return data;
		
	}
	
	// konverterar datasträngen till en nummer array 
	private static double[] dataToNumberArray(String text){
		
		String[] dataStringArray = text.split("\n");
		double[] dataDoubleArray = new double[dataStringArray.length];
		
		for(int i = 0; i < dataStringArray.length; i++){
			
			if(isDouble(dataStringArray[i]) == true){
				
				dataDoubleArray[i] = Double.parseDouble(dataStringArray[i]);
				
			}
			else{
				
				throw new IllegalArgumentException("Filen kan vara korrupt!\nFilen har argument med fel format på rad : "+(i+1));
				
			}
			
		}
		
		return dataDoubleArray;
		
	}
	//kollar om talet är en double 
	private static boolean isDouble(String arrayPlace) {
		
		boolean ret = true;
		
		try{
			
			Double.parseDouble(arrayPlace);
			
		}catch(NumberFormatException e){
			
			ret = false;
			
		}
		// TODO Auto-generated method stub
		return ret;
	}
	//skapar histogrammet
	public static void makeHistogram(double[] dataArray){
		
		int inomGransVardena = 0;
		int hogsta = 10;
		int minsta = 1;
		int antInomIntervallet = 0;
		int textArrayPlats = 0;
		String[] intervallTexter = {" 1 - 10  ","11 - 20  ","21 - 30  ","31 - 40  ","41 - 50  ","51 - 60  ","61 - 70  ","71 - 80  ","81 - 90  ","91 - 100 "}; 
		
		for(int i = 0; i < dataArray.length; i++){
			
			if(dataArray[i] <= 100 && dataArray[i] >= 1){
				
				inomGransVardena++;
			
			}
			
		}
		
		System.out.println("Antal tal i intervallet[1,100]: " + inomGransVardena);
		System.out.println("Övriga : " + (dataArray.length-inomGransVardena));
		
		System.out.println("Histogram");
		
		for(int k = 0; k < intervallTexter.length; k++){
			
			for(int i = 0; i < dataArray.length; i++){
				
				if(dataArray[i] <= hogsta && dataArray[i] >= minsta ){
					antInomIntervallet++;
				}
			
			}
			
			System.out.print(intervallTexter[textArrayPlats]+ "|");
			
			for(int j = 0; j < antInomIntervallet; j++){
				System.out.print("*");
			}
			
			System.out.println();
			
			antInomIntervallet = 0;
			hogsta += 10;
			minsta += 10;
			textArrayPlats++;
			
		}
	}
	
	

}
