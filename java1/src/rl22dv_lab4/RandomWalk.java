package rl22dv_lab4;

public class RandomWalk {
	
	// Klass variabler
	private int x;
	private int y;
	private int maxSteps;
	private int size;
	private int takenSteps = 0;
	private int planePosX;
	private int planeNegX;
	private int planePosY;
	private int planeNegY;
	
	
	RandomWalk(int max, int storlek){
		x= 0;
		y = 0;
		maxSteps = max;
		size = storlek; 
		plane();
	}
	
	// skapar riktning i for slumptal
	private int randomDirection(){
		return (int)(Math.random()*4); 
	}
	
	//väljer riktning att gå
	private void takeStep(){
		int tal = randomDirection();
		if(tal == 0){
			x++;
		}
		else if(tal == 1){
			x--;
		}
		else if(tal == 2){
			y--;
		}
		else{
			y++;
		}
		
		takenSteps++;
	}  
	
	// skriver info i strängform
	public String toString(){
		return "Anatalet steg Hitentills: "+takenSteps+" Krdinaten är: X="+x+", Y="+y; 
	}
	
	// kollar om man kan ta fler steg
	public boolean moreSteps(){
		if(takenSteps < maxSteps){
			return true;
		}
		else{
			return false;
		}
	}
	
	//skapar plan
	private void plane(){
		
		planePosX = size;
		planeNegX = -size;
		planePosY = size;
		planeNegY = -size;
		
	}
	
	// kollar om walkern är på ön
	public boolean inBounds(){
		
		if(x <= planePosX && x >= planeNegX && y <= planePosY && y >= planeNegY){
			return false;
		}
		else{
			return true;
		}
		
	}
	//tar antal steg
	public void walk(){
		
		for(int i = 0; i < maxSteps; i++){
			takeStep();
		}	
	}
}
