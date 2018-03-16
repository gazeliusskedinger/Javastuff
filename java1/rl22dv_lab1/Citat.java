/**
 * Created by delorian1986 on 11/9/15.
 */
import java.util.Scanner;
public class Citat {
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Ange ett citat!\n: ");
        String citat = Scanner.nextLine();
        System.out.print(citat);
        Scanner.close();
    }
}
