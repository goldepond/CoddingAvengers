import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dd");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = (a<b?a:b);
		
		
		int max =0;
		int min =1;
		
		
		
		for(int i=1; i<=c; i++)
		{
			 if(a%i==0 && b%i==0)
			 {
				 min = i;
			 }
		}
		System.out.println(min);
		System.out.println(a*(b/min));
	}
}
