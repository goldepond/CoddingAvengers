import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		//기차의 하차가 탑승보다 먼저이기때문에 환승구간에서 탑승객과 하차객이 더해질일은없다
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String str;
		int c = 0;
		
		for(int i=1; i<=10; i++)
		{
			str = br.readLine();
			st = new StringTokenizer(str);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			c = c + (b-a);
			list.add(c);
		}
		
		Collections.sort(list);
		System.out.println(list.get(list.size()-1));
	}
}
