import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


//해당 문제는 혼자푸는데 어려움이있어  DP함수를 풀이한 블로그를 참조하여 작성했다 , DP문제의경우 재귀함수의 중요성을 느끼자

public class Main 
{
	
	static Integer[] dp; // 자바의 특성을살려 클래스형태로 만들었다
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int n = Integer.parseInt(br.readLine());
		
		dp = new Integer[n+1]; // 배열이길이가 인덱스보다 1더크니 n+1만큼생성
		dp[0] = dp[1] = 0; // 0,1은 값지정
		
		System.out.println(re(n)); // 재귀함수를 통해 그값을 출력
		
	}
	
	static int re(int n)
	{
		if(dp[n] == null) 
		{
			if( n % 6 == 0) // 재귀함수는 모든경우의수를 생각해야한다
			{
				dp[n] = Math.min(re(n/3),Math.min(re(n/2), re(n-1)))+1; //min의 최소값 비교는2개지만 중첩을 응용하면 계속하여 최소비교가 가능하다
			}else if( n % 3 ==0)
			{
				dp[n] = Math.min(re(n/3), re(n-1))+1; // if문을 탄다는것자체가 한번의연산이 일어나는것이니 모두 +1을 해준다
			}else if (n % 2 ==0)
			{
				dp[n] =  Math.min(re(n/2), re(n-1))+1;
			}else
			{
				dp[n] = re(n-1) +1;
			}
		}
			return dp[n]; // 0과1 은 연산이 필요없으니 지정한값을 리턴한다
		
	}
}