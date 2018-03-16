import java.util.Scanner;

public class Avstand {
	public static void main(String[] args)
	{
		Scanner Scanner = new Scanner(System.in);
		int langd = 2;
		double avstand;
		// Variabler ena punkten
		System.out.print("Ange en punkt i formen 'x,y'.\n: ");
		double[] punktett = new double[2]; 
		String punkt1 = Scanner.nextLine();
		String[] punkt1spl = punkt1.split(",");
		// Variabler andra punkten
		System.out.print("Ange en annan punkt i formen 'x,y'. \n: ");
		double[] punkttva = new double[2];
		String punkt2 = Scanner.nextLine();
		String[] punkt2spl = punkt2.split(","); 
		//konvertering till int båda punkter.
		for(int i = 0; i < langd; i++) // loop för konvertering från string till double.
		{
			punktett[i] = Double.parseDouble(punkt1spl[i]);
			punkttva[i] = Double.parseDouble(punkt2spl[i]);
		}
		avstand = Math.sqrt(Math.pow((punktett[0]-punkttva[0]),2.0)+ Math.pow((punktett[1]-punkttva[1]),2.0));// Avstånds formeln
		System.out.printf("%.3f",avstand);
		System.out.print("\n\n");
		Scanner.close();
	} 

}
