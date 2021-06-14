package prep;

import java.util.Scanner;

public class 2438_PJH {
	
	/* 문제:
	 * 첫째 줄에는 별 1 개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 프로그램을 작성하시오.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) { //i번만큼 *을 찍어야 하기 때문에, i번만큼 도는 for문 
				System.out.print("*");
			}
			System.out.println(""); //줄바꿈
		}
		
	}
}
