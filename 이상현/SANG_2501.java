import java.util.Scanner;

public class SANG_2501 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N ;
		int K;
		int count = 0;
			
		while(true) {
			System.out.println("1이상 10000이하의 값을 입력하세요"); 
			System.out.print("자연수 입력");
			N = scan.nextInt();
			if(N >= 1 && N <= 10000) break;
		}
		
		while(true) {
			System.out.println("1이상" + N + "이하의 값을 입력하세요");
			System.out.print("몇번째로 작은 약수?");
			K = scan.nextInt();
			if(K>=1 && K <= N) break;
		}
		
		for(int q = 1; q <= N ; q++) {
			if(N % q == 0) {
				count++;
				if(count == K) {
					System.out.println(q);
				} 
			}
		}
			
			if (count < K) {
				System.out.println("0");
			}
		}
	}

