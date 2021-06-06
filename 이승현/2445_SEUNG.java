import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{	
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		for(int i=0; i<input; i++)
		{
			for(int j=0; j<i+1;j++)
			{
				System.out.print("*");
			}
			for(int j=(i+1)*2; j<input*2; j++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=1; i<=input-1; i++)
		{
			for(int j=0; j<input-(i); j++)
			{
				System.out.print("*");
			}
			for(int j=0; j<i*2; j++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<input-(i); j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
