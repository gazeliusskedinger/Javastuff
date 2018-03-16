/**
 * Created by delorian1986 on 11/9/15.
 */
import java.util.Scanner;
public class Bmi {
    public static void main(String[] args)
    {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Ange din längd i meter\n:");
        double meter = Scanner.nextDouble();
        System.out.print("Ange din vikt i kilogram\n:");
        double vikt = Scanner.nextDouble();
        int bmi = (int) Math.round(vikt / Math.pow(meter,2.0));
        //System.out.println(b_m_i); //Test out
        System.out.println("Ditt BMI är: "+bmi+"\n");
        Scanner.close();
    }
}
