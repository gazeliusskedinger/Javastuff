package rl22dv_lab3;

public class Arrays {
	
	public static void main(String[] args){
		
		int[] arrayen = {3,4,5,6,7};
		boolean bool = false;
		
		int summa = sum(arrayen); // summerar alla värden lagrade i arrayen 
		System.out.println(summa);
		
		String text = toString(arrayen); //skriver ut arrayen som en sträng
		System.out.println(text);
		
		int[] array = addN(arrayen, 4); // Adderar ett tal till varje tal i arrayen 
		text = toString(array);
		System.out.println("n + 4 = "+text);
		
		int[] array2 = reverse(arrayen); // reverserar arrayen 
		text = toString(array2);
		System.out.println("n omvänd = " + text);
		
		bool = hasN(arrayen, 4); // om ett tal 4 finns i arrayen
		System.out.println(bool);
		
		replaceAll(arrayen, 4, 8); // byter ut alla 4 med 8
		
		int[] array3 = sort(arrayen); // sorterar arrayen
		text = toString(array3);
		System.out.println("n sorterad = "+text);
		
		int[] subSecuence = {6,7,8}; // kollar om en sekvens finns i arrayen
		bool = hasSubSequence(arrayen,subSecuence);
		System.out.println(bool);
		
	}
	
	private static int sum( int[] arr){  // summerar alla värden i arrayen
		
		int summa = 0;
		
		for(int i = 0; i < arr.length; i++){ //tar varje värde i arrayen och summerar dessa 
			summa += arr[i];
		}
		
		return summa;
	}
	
	private static String toString( int[] arr){ // gör om arrayen till en string
		
		String text = "";
		
		for(int i = 0; i < arr.length; i++){// skriver ut talen
			text += arr[i];
		
			if(i != arr.length-1){ // för vilka i som det skall vara punkter mellan
				text += ", ";
			}
		} 
		
		return text;
	}

	private static int[] addN(int[] arr, int n){ // addaerar ett tal till arrayen
		
		int[] enAnnanArray = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++){ // adderar den gamla arrayen till en ny array
			enAnnanArray[i] = arr[i] + n; 
		}
		
	
		return enAnnanArray;
	}
	
	private static int[] reverse(int[] arr){ // reverserar arrayen
		
		int[] enAnnanArray = new int[arr.length];
		int plats = 0;
		
		for(int i = arr.length-1; i >= 0; i--){ // läser input arrayen bakifrån och sätter värdena till den nya arrayyen frammåt  
			
			enAnnanArray[plats] = arr[i];
			plats++;
			
		}
		
		return enAnnanArray;
	}

	private static boolean hasN(int[] arr, int n ){ // kollar effter ett värde i arrayen
		
		boolean find = false;
		int plats = 0;
		
		while( find != true && plats != arr.length-1){ // söker igenom arrayen efter ett tal som är lita med det sökta talet och returnerar true.
			
			if(arr[plats] == n){ 
				find = true;
			}
			
			plats ++;
		}
		
		return find;
	} 
	
	private static void replaceAll(int[] arr, int old, int nw){ // byter ut ett tal mot ett annat
		
		String text = "";

		for(int i = 0; i < arr.length; i++){ // kollar omm talen är lika med de sökta talet och byter ut detta
			
			if(old == arr[i]){
				
				arr[i] = nw;
				
			}  
		}
	}
	
	private static int[] sort(int[] arr){ // sorterar arrayen med urvals sortering 
		
		for(int i = 0; i <= arr.length-2; i++ ){ // kollar varge tal 
			
			int minsta = arr[i];
			int plats = i;
			
			for(int j = i+1; j < arr.length; j++){ // kollar i resten av arayen efter det minsta talet
				
				if(arr[j] < minsta){
					
					minsta = arr[j];
					plats = j;
					
				}
			}
			
			arr[plats] = arr[i]; // sätter det minsta på första platsen
			arr[i] = minsta; 
		}
		
		return arr;
	}
	
	private static boolean hasSubSequence(int[] arr, int[] subSequence){ //kollar en delsekvens
		
		boolean subSekFinns = false;
		int hurLika = 0;
		
		for(int i = 0; i < arr.length; i++){ // kollar igenom arrayen efter det första talet i sekvensen
			
			if(arr[i] == subSequence[0] && (i + subSequence.length) <= arr.length ){
				
				for(int j = 0; j < subSequence.length; j++ ){// när den hittat det kollar den hur många av de efterföljande talen som är lika.
					
					if(arr[i + j] == subSequence[j] ){
						hurLika++;
					}
				} 
			}
		}
		if(hurLika == subSequence.length){ // är alla lika så finns sekvensen
			subSekFinns = true;
		}
		
		return subSekFinns;
		
	}
}
