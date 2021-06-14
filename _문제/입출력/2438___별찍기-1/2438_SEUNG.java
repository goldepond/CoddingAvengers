import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{	
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		for(int i=0; i<input; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
