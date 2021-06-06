import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{	
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		for(int i=1; i<=input; i++)
		{
			for(int j=input-i; j >0; j--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<(2*i); j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
