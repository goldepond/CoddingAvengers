package prep;

import java.util.Arrays;
import java.util.Scanner;

public class 10818_PJH {
	/* 문제:
	 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
	 * 첫째 줄에 정수의 개수 N이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
	 * 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수의 개수를 입력하세요.");
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i ++) {
			
			arr[i] = scan.nextInt();
			
		}
		
		scan.close();
		
		Arrays.sort(arr);
		
		System.out.print(arr[0] + " " + arr[n-1]);
	
		
		
		
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		 
//		Integer.parseInt(br.readLine());	//첫 줄 N 은 안쓰이므로 입력만 받는다.
//		StringTokenizer st = new StringTokenizer(br.readLine()," ");
//		
//		int max = -1000001;
//		int min = 1000001;
//		
//		while(st.hasMoreTokens()) {
//			int val = Integer.parseInt(st.nextToken());
//			if(val>max) {
//				max = val;
//			}
//			if(val<min) {
//				min = val;
//			}
//		}
//		System.out.println(min + " " + max);
		
	}
}
