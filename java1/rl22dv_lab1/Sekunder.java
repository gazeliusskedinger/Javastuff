/**
 * Created by delorian1986 on 11/9/15.
 */

import java.util.Scanner;
public class Sekunder {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Ange tiden i formen 'tt:mm:ss'\n: ");
        String tid = Scanner.nextLine();
        String[] salangearray = tid.split(":");
        int langd = salangearray.length;
        int antal_sek = 60; // antal sek per min.
        int[] talconv = new int[3];
        int sekunder = 0;
        for (int i = 0; i < langd; i++) // loop för konvertering från string till int.
        {
            talconv[i] = Integer.parseInt(salangearray[i]);
        }
        int plats = 2;
        for (int j = 0; j < langd; j++) // loop för sekund addition.
        {
            sekunder = sekunder + (int) (talconv[plats] * Math.pow(antal_sek, j));
            plats--;
        }
        System.out.println("Antalet sekunder är : " + sekunder + "\n");
        Scanner.close();
    }
}
