package rl22dv_lab3;

public class Pnr {
	
	public static void main(String[] args) {
		
		String pnr1 = "850615-1234"; // påhittat 
		String pnr2 = "671012-4321"; // påhittat
		String pnr3 = "671012-4321"; // påhittat lika med ovan 
		String pnr4 = "811218-9876"; // Wikipedia testen som är true
		String pnr5 = "811218-9876"; // samma so ovan som är lika
		
		boolean female = false;
		boolean male = false;
		boolean isEqual = false;
		boolean validDate = false;
		
		String fodelseDatum = getFirstPart(pnr1); //hämtar ut första delen av person nummret
		System.out.println("Födelse datum: "+ fodelseDatum);
		
		String kontrollNummer = getSecondPart(pnr1);// hämtar ut andra delen av pers nummret
		System.out.println("Kontroll nummer: "+ kontrollNummer);
		
		female = isFemaleNumber(kontrollNummer); //Kollar om nummret är kvinligt
		male = isMaleNumber(kontrollNummer); // kollar om nummret är manligt
		
		System.out.println("Is female: "+female); 
		System.out.println("Is male: "+male);
		
		isEqual = isEqual(pnr2, pnr3); // är nummren lika
		System.out.println("Is Equal: "+isEqual);
		
		validDate = isCorrect(pnr3); // validerar nummret
		System.out.println("Person nummret år Godkännt: "+validDate);
	}
	
	

	private static String getFirstPart(String pnr){ //hämtar datum delen.
		String fodelseDatum = pnr.substring(0, 6);
		return fodelseDatum;
	}
	
	private static String getSecondPart(String pnr) { //hämtar kontrollsiffror
		String kontrollNummer = pnr.substring(7, 11);
		return kontrollNummer;
	}
	
	private static int[] toArrayConv(String pnr){ // Converterar en string till int array 
		
		String[] arr = pnr.split("");
		int[] talArr = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++){
			talArr[i] = Integer.parseInt(arr[i]);
		}
		return talArr;
	}
	
	private static boolean isFemaleNumber(String kontroll){ //Kollar om personen i fråga är kvinna
		
		int[] arr = toArrayConv(kontroll);
		
		if(arr[2] % 2 == 0){
			return false;
		}
		else{
			return true;
		}
	}
	
	private static boolean isMaleNumber(String kontroll){ //Kollar om personen i fråga är man
		
		int[] arr = toArrayConv(kontroll);
		
		if(arr[2] % 2 == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	private static boolean isEqual(String p1, String p2) { // kollar om två person nummer är lika
		
		if(p1.equals(p2)){
			return true;
		}
		else{
			return false;
		}
	}
	
	private static boolean isCorrect(String persNr) {
		
		String forSkottAr = "20"+ getFirstPart(persNr);// +20 är för skottår varje jämt århundrade
		String dateToDivide = getFirstPart(persNr);
		String persNummer = dateToDivide + getSecondPart(persNr);
		String kontrollTal = "";
		
		boolean validDate = false;
		boolean valid = false;
		boolean skottAr = false;
		boolean validPnr = false; 
		
		int summering = 0;
		
		int[] date = new int[3];
		int[] dateSkottAr = new int[3];
		int[] kontrollPNr = toArrayConv(persNummer);
		int[] validKontrollNr = toArrayConv(getSecondPart(persNr));
		
		// delar upp strängen i år, mån dag för datum validering 
		date[0] = Integer.parseInt(dateToDivide.substring(0, 2));
		date[1] = Integer.parseInt(dateToDivide.substring(2, 4));
		date[2] = Integer.parseInt(dateToDivide.substring(4, 6));
		
		// delar upp strängen i år, mån, dag för skottårsverifieringen
		dateSkottAr[0] = Integer.parseInt(forSkottAr.substring(0, 4));
		dateSkottAr[1] = Integer.parseInt(forSkottAr.substring(4, 6));
		dateSkottAr[2] = Integer.parseInt(forSkottAr.substring(6, 8));
		 
		// kollar om året är ett skottår
		if (((dateSkottAr[0] % 4 == 0) && (dateSkottAr[0] % 100 != 0)) || dateSkottAr[0] % 400 == 0) {
			skottAr = true;
		} else {
			skottAr = false;
		}

		// validerar månader och antal dagar per månad.
		switch (date[1]) 
		{
		case 1:
			if (date[2] <= 31) {
				validDate = true;
			}
			break;
		case 2:
			if (skottAr == true) {
				if (date[2] <= 29) {
					validDate = true;
				}
			} else {
				if (date[2] <= 28) {
					validDate = true;
				}
			}
			break;
		case 3:
			if (date[2] <= 31) {
				validDate = true;
			}
			break;
		case 4:
			if (date[2] <= 30) {
				validDate = true;
			}
			break;
		case 5:
			if (date[2] <= 31) {
				validDate = true;
			}
			break;
		case 6:
			if (date[2] <= 30) {
				validDate = true;
			}
			break;
		case 7:
			if (date[2] <= 31) {
				validDate = true;
			}
			break;
		case 8:
			if (date[2] <= 31) {
				validDate = true;
			}
			break;
		case 9:
			if (date[2] <= 30) {
				validDate = true;
			}
			break;
		case 10:
			if (date[2] <= 31) {
				validDate = true;
			}
			break;
		case 11:
			if (date[2] <= 30) {
				validDate = true;
			}
			break;
		case 12:
			if (date[2] <= 31) {
				validDate = true;
			}
			break;
		default:
			validDate = false;
		}
		
		//kollar att personnummeret i sig är godkänt
		
		
		for(int i = 0; i < kontrollPNr.length-1; i++){
			if(i%2 == 0){                           // pendlar mellan att multiplicera med 2 och 1 till en ny array 
				kontrollTal += (kontrollPNr[i]*2);    
			}
			else{
				kontrollTal += (kontrollPNr[i]*1);
			}
		}
		
		int[] summeringsArray = toArrayConv(kontrollTal);
		
		// summerar all tal i nya arrayen.
		for(int i = 0; i < summeringsArray.length; i++){
			 summering += summeringsArray[i]; 
		}
		
		// kollar att pnr är korrekt.
		if((10-(summering % 10)) == validKontrollNr[3]){ 
			validPnr = true;
		}
		
		// kollar om hela metoden är true
		if((validDate && validPnr) == true){ 
			valid = true;
		}
		
		return valid;
	}
}