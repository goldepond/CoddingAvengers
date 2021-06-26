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
	public static void main(String[] args) throws  IOException 
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String str;
		
		int cycle = Integer.parseInt(br.readLine());
		int count = 0;
		int check = 0;
		
		str = br.readLine();
		st = new StringTokenizer(str);
		while(st.hasMoreTokens())
		{
			int n = Integer.parseInt(st.nextToken());
			{
				if(n==3 || n==2) count++;
				else if( n >3)
				{
					for(int j=2; j<=n/2; j++)
					{
						if(n%j == 0)
							{
								check++;
								break;
							}
						if(j == n/2 && check ==0)
							{
								count++;
							}
					}
				}
				check = 0;
			}
		}
		System.out.println(count);
	}
}
