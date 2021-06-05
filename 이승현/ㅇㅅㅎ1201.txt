import java.util.Arrays;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력");
		String str = scan.nextLine();
		System.out.println(str);
		String[] ch = str.split(" ");
		
		int a = Integer.parseInt(ch[0]);
		int b = Integer.parseInt(ch[1]);
		int index = 0;
		int[] arr = new int[a];
		
		for(int i=1; i <= a; i++)
		{
			if(a%i == 0)
			{
				arr[index] = i;
				index++;
			}
		}
		System.out.println(arr[b-1]);
	}
}
