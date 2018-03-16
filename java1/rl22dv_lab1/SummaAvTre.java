/**
 * Created by delorian1986 on 11/10/15.
 */
import java.util.Scanner;
public class SummaAvTre {
    public static void main(String[] args)
    {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Ange ett tresiffrigt tal \n: ");
        int tal = Scanner.nextInt();
        String len = ""+tal;
        int langd = len.length();
        int summa = 0;
        for(int i = 0; i < langd; i++)
        {
            summa = summa + tal%10;
            tal = tal /10;
        }
        System.out.println("Summan av talen blir : "+summa+"\n");
        Scanner.close();
    }
}
