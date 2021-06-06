import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = scan.nextLine().split("");
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<str.length; i++)
		{
			if(sb.length() <10)
			{
				sb.append(str[i]);
			}
			else
			{
				System.out.println(sb.toString());
				sb.delete(0, sb.length());
				sb.append(str[i]);
			}
		}
		System.out.println(sb.toString());
	}
}