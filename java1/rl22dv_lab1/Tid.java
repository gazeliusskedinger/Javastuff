/**
 * Created by delorian1986 on 11/9/15.
 */
import java.util.Scanner;
public class Tid {
    public static void main(String[] args)
    {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Ange hur många sek du vill konvertera\n: ");
        int sekunder = Scanner.nextInt();
        int dagar = sekunder / (24*60*60);//dagar
        sekunder = sekunder%(24*60*60);
        int timmar = sekunder / (60*60);//timmar
        sekunder = sekunder%(60*60);
        int minuter = sekunder / 60;//minuter
        sekunder = sekunder%60;
        System.out.print("Sekunderna konverterades till: \n"+dagar+" Dagar.\n"+timmar+" Timmar.\n"+minuter+" Minuter. \n"+sekunder+" Sekunder.\n\n");
        Scanner.close();
    }
}
