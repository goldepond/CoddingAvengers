import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		String[] str2 = str.split(" ");
		
		int a = Integer.parseInt(str2[0]);
		int b = Integer.parseInt(str2[1]);
		
		System.out.println(a+b);
	}
}
