import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	static ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		list.add(0);
		list.add(1);
		
		int n = scan.nextInt();
		
		System.out.println(pibo(n));
		
	}
	
	public static int pibo (int n)
	{
		for(int i=2; i<=n; i++)
		{
			list.add(list.get(i-1)+list.get(i-2));
		}
		
		return list.get(n);
	}
}
