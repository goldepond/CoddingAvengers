import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int cycle = Integer.parseInt(br.readLine());
		for(int n=0; n<cycle; n++)
		{
			int num = Integer.parseInt(br.readLine());
			while( num != 0)
			{
				list.add(num%2);
				num = num/2;
			}
			for(int i =0; i<list.size(); i++)
			{
				if(list.get(i) == 1 && i != list.size()-1)
				{
					System.out.print(i+" ");
				}else if(list.get(i) ==1 && i == list.size()-1)
				{
					System.out.println(i);
				}
			}
			list.clear();
		}
	}
}