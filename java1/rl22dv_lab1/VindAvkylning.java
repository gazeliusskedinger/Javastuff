import java.util.Scanner; 
public class VindAvkylning {
	public static void main(String[] args){
		Scanner Scanner = new Scanner(System.in);
		System.out.print("Ange temperatur och vindhastigheten på formen 'tt vv'.\n: ");
		String varden = Scanner.nextLine();
		String[] vardenarray = varden.split(" ");
		double[] conversionarray = new double[2];
		int langd = vardenarray.length;
		for(int i =0; i < langd; i++) // Sträng till int konvertering intarray[0]=temp intarray[1]=hastighet
		{
			conversionarray[i] = Integer.parseInt(vardenarray[i]);
		}
		int vindavkylning = (int)Math.round( 13.126667+0.6215*conversionarray[0]-13.924748*Math.pow(conversionarray[1],
				0.16)+0.4875195*conversionarray[0]*Math.pow(conversionarray[1],0.16));// formeln för vindavkylning
		System.out.println("Svaret är : "+vindavkylning+"\n");
		Scanner.close();
	} 

}
