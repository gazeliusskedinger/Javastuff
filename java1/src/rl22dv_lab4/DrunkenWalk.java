package rl22dv_lab4;

import java.util.Scanner;

public class DrunkenWalk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	int fallenInTheOcean = 0;
	
	// user interaction
	System.out.print("Ange storlek på ytan: ");
	int storlek = scanner.nextInt();
	System.out.print("Ange max antal steg: ");
	int max = scanner.nextInt();
	System.out.print("Ange antalet slumpvandringar: ");
	int antal = scanner.nextInt();
	
	RandomWalk[] array = new RandomWalk[antal];
	
	//för varje walker gå, kolla om dem är på land, räkna om dem faller i vattnet.
	for(int i = 0; i < antal; i++){
		array[i] = new RandomWalk(max, storlek);
		array[i].walk();
		if(array[i].inBounds()){
			fallenInTheOcean++;
		}
	}
	
	System.out.println("Av "+antal+" onyktra pesoner, föll "+fallenInTheOcean+" ("+((((double)fallenInTheOcean/(double)antal))*100)+" %) i vattnet!.");
	
	scanner.close();
	}

}
