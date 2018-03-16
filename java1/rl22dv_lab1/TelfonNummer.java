
public class TelfonNummer {
	public static void main(String[] args)
	{
		int langd = 11;
		int tal = 0;
		for(int i = 0; i < langd; i++ )
		{
			
			if(i == 0)//>0<xxx-yxxxxx
			{
				System.out.print(tal);
			}
			else if(i == 4)//0xxx>-<yxxxxx
			{				
				System.out.print("-");
			}
			else if(i == 5)//0xxx->y<xxxxx
	 		{
				tal = (int)(Math.random()*9)+1;
				System.out.print(tal);
			}		
			else//0>xxx<-y>xxxxx<
			{
				tal = (int)(Math.random()*10);
				System.out.print(tal);
			}
			
		}
		System.out.print("\n\n");
	}
}
