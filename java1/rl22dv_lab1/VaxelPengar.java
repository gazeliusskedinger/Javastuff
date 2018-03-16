

/**
 * Created by delorian1986 on 11/10/15.
 */
import java.util.Scanner;
public class VaxelPengar {
    public static void main(String[] args) {
        String[] text = {"1000-Lappar : ", " 500-Lappar : ", " 200-Lappar : ", " 100-Lappar : ", "  50-Lappar : ", "  20-Lappar : ", "  10-Kronor : ", "   5-Kronor : ", "   1-Kronor : "};//sträng array mat pengarvalörer
        int[] delare = {1000, 500, 200, 100, 50, 20, 10, 5, 1};
        int langd = 9;
        int svar;
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Ange kostnaden \n: ");
        int kostnad = Scanner.nextInt();
        System.out.print("Ange erhållet belopp \n: ");
        int betalat = Scanner.nextInt();
        int tillbaka = betalat - kostnad;// räknar ut mellan skillnad
        System.out.print("Tillbaka : " + tillbaka + " Kronor\n");
        for (int i = 0; i < langd; i++)// skriver ut arrayerna plats för plats och skriver dessa ihop med uträkningarna
        {
            svar = tillbaka / delare[i]; //uträkningarna
            System.out.println(text[i] + svar);
            tillbaka = tillbaka % delare[i];
        }
        System.out.print("\n");
        Scanner.close();
    }
}
