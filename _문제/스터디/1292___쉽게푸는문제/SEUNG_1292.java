import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main 
{
	public static void main(String[] args) throws  IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String[] ch = str.split(" ");
		int answer = 0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<=Integer.parseInt(ch[1]); i++)
		{
			for(int j=1; j<=i; j++)
			{
				list.add(i);
			}
		}
		
		for(int i=Integer.parseInt(ch[0])-1; i<=Integer.parseInt(ch[1])-1; i++)
		{
			answer += list.get(i);
		}
		System.out.println(answer);
	}
}