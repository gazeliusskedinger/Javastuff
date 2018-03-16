package rl22dv_lab2;

public class FrekvensTabell {
	// Statiska varibler 
	final static int DICETROWS = 6000;
	final static int SIDES = 6;

	public static void main(String[] args) {
		// variabel deklaration
		int tal;
		int[] array = {0,0,0,0,0,0};
		
		
		for(int i = 0; i < DICETROWS; i++){ // för 6000 kast 
			
			tal = (int)(Math.random()*6)+1; // Skapa ett ran tal
			
			switch(tal) // se vilket tal det är mellan 1-6
			{
				case 1:
					array[0]++;
					break;
				case 2:
					array[1]++;
					break;
				case 3:
					array[2]++;
					break;
				case 4:
					array[3]++;
					break;
				case 5:
					array[4]++;
					break;
				default:
					array[5]++;
					break;
			}
		}
		
		for(int j = 0; j < SIDES; j++){ // för varje sida
			
			System.out.println((j+1)+ ": "+array[j]); //skriv ut sidan och antal värden 
			
		}
		// TODO Auto-generated method stub

	}

}
