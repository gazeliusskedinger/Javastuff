package rl22dv_lab2;

public class TartLjus {
	
	final static int ANTPERPACK = 24; 
	final static int ANTAR = 100;
	
	public static void main(String[] args){
		
		int antLjus = 0;
		int antPaket = 0;
		int antPackDag = 0;
		
		// 
		for(int i = 1; i <= ANTAR; i++){
			
			if(antLjus < i){// Lägger till ett paket till antLjus så länge som ant ljus är mindre än år.  
				antPackDag = 0;
				
				while(antLjus < i){ 
					antLjus = antLjus + ANTPERPACK;
					antPaket++;
					antPackDag++;
				}
				
				System.out.println("before birthday "+i+" buy "+antPackDag+" box(es)");
			}
			
			antLjus = antLjus - i; // drar bort antalet år från ljus
				
		}
		System.out.println("Total number of boxes: "+antPaket+ ", remaining candles: "+ antLjus);
		// TODO Auto-generated method stub
	}

}
