import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		br.readLine();
		String str =br.readLine();
		int sum = 0;
		
		String[] num = str.split();
		
		for(int i=0; inum.length; i++)
		{
			sum += Integer.parseInt(num[i]);
		}
		System.out.println(sum);
	}
}
