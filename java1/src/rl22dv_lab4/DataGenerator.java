package rl22dv_lab4;

import java.io.PrintWriter;

// bara för att enkelt skapa en data fil

public class DataGenerator {
	
	private int antalTal;
	
	DataGenerator(){
		
		antalTal = 100;
		
	}
	
	DataGenerator(int antal){
		
		antalTal = antal;
		
	}
	
	private int dataGenerator(){
		
		int tal = (int)(Math.random()*115);
		
		return tal;
		
	}
	
	public void saveToFile()throws Exception{
		
		int tal;
		
		String fileName = "data.dat";
		PrintWriter out = new PrintWriter(fileName);
		
		for(int i = 0; i < antalTal; i++){
			
			tal = dataGenerator();
			out.println(tal);
			System.out.println(tal);
			
		}
		
		out.close();
		
	}
	
	public static void main(String[] args) {
		
		DataGenerator generate = new DataGenerator(50);
		
		try{
			generate.saveToFile();
		}
		catch(Exception e){
			System.err.println(e);
		}
		
		// TODO Auto-generated method stub

	}
	
	
}
