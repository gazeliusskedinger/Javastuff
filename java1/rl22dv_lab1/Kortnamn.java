import java.util.Scanner;
public class Kortnamn {
	public static void main(String[] args)
	{
		Scanner Scanner = new Scanner(System.in);
		System.out.print("Ange ditt förnamn.\n: ");
		String fornamn = Scanner.nextLine();
		System.out.print("Ange ditt efternamn.\n: ");
		String efternamn = Scanner.nextLine();
		char kortnamn = fornamn.charAt(0);
		int langd = efternamn.length();
		if(langd > 3)// La till denna ifsats eftersom den skall kunna ta kortare namn med. I det andra fallet så gennereras ett logiskt fel då plats 4 inte finns i namnet Ahl.
		{
			String kefter = efternamn.substring(0,3);
			System.out.println(kortnamn+". "+kefter);			
		}
		else
		{
			char ckefter = efternamn.charAt(0);
			System.out.println(kortnamn+". "+ckefter+"\n");
		}
		Scanner.close();
	}
}
