package rl22dv_lab3;

public class Point { 
	
	private double x;
	private double y;
	
	Point(){ // std konstruktor
		x = 0;
		y = 0;
	}
	
	Point(double ex, double ye){ // konstruktor punkt variabel input
		x = ex;
		y = ye;
	}
	
	public String toString(){ //gör om punkten till en sträng
		
		String text = ("(" + x +"," + y + ")");
		
		return text;
	}
	
	public boolean isEqualTo(Point punkt){ 
		
		boolean check = false;
		
		if(toString().equals(punkt.toString())){ // gämför om två punkter är lika
			check = true;
		}
		
		return check;
	}
	
	public double getX(){ // returnerar x
		return x;
	}
	
	public double getY(){ // returnerar y 
		return y;
	}

	public double distanceTo(Point punkt) { // räknar ut avstånd mellan två punkter
		double avstand = 0;
		double x1 = x;
		double x2 = punkt.getX(); 
		double y1 = y;
		double y2 = punkt.getY();
		
		avstand = (double)Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)); // avstånds formeln
		
		return avstand;
	}

	public void move(double nyttX, double nyttY) { // flyttar en punkt
		
		x += nyttX;
		y += nyttY;
		
	}

	public void moveToXY(double nyttX, double nyttY) { // ger en punkt ett helt nytt x och y värde
		
		x = nyttX;
		y = nyttY;
		
	}
	
}