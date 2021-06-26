import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main 
{
	static ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) throws  IOException 
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String str;
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		for(int i=a; i<=b; i++)
		{
			pimeNumber(i);
		}
		
		if(list.size() == 0) System.out.println("-1");
		else
		{
			Collections.sort(list);
			System.out.println(list.stream().mapToInt(Integer::intValue).sum());
			System.out.println(list.get(0));
		}
	}
	
	static void pimeNumber(int num)
	{
		int n = num;
		{
			if(n==3 || n==2) list.add(n);
			else if( n >3)
			{
				for(int j=2; j<=n/2; j++)
				{
					if(n%j == 0)
					{
						break;
					}
					if(j == n/2)
					{
						list.add(n);
					}
				}
			}
		}
		return;
	}
}