import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{	
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		for(int i=0; i<input; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int j=(i*2); j<input*2-1; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=2; i<=input; i++)
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