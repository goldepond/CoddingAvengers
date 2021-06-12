
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		
		ArrayList<Integer> list = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		String str;
		
		int max = 0;
		int min = 0;
		
		str = br.readLine(); // 처음 입력의미없는거같아 첫구문 처리용도로만든 코드
		
		str = br.readLine();
		st = new StringTokenizer(str);
		
		while(st.hasMoreTokens())
		{
			list.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(list);
		System.out.println(list.get(0)+" "+list.get(list.size()-1));
	}
}
