/**
 * Created by delorian1986 on 11/10/15.
 */
import java.util.Scanner;

public class Konvertera{

    public static void main(String[] args)
    {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Ange temperatur i FahrenHeit\n: ");
        double fahrenheit = Scanner.nextDouble();
        double celsius = (5*(fahrenheit - 32)) / 9; // Formel för fahrenheight to celsius
        System.out.printf("Temperaturen är : %.1f Celsius" , celsius);
        Scanner.close();
    }
}
