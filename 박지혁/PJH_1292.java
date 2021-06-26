package prep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PJH_1292 {
	
	/* 문제:
	 * 동호는 내년에 초등학교를 입학한다. 그래서 동호 어머니는 수학 선행 학습을 위해 쉽게 푸는 문제를 동호에게 주었다.
	 * 이 문제는 다음과 같다. 1을 한 번, 2를 두 번, 3을 세 번 이런 식으로 1 2 2 3 3 3 4 4 4 4 5.. 이러한 수열을 만들고 어느 일정한 구간을 주면 그 구간의 합을 구하는 것이다
	 * 하지만 동호는 현재 더 어려운 문제를 푸느라 바쁘기에 우리가 동호를 도와주자.
	 * 첫째 줄에 구간의 시작과 끝을 나타내는 정수 A,B 가 주어진다. 즉 수열에서 A번째 숫자부터 B번째 숫자까지 합을 구하면 된다.
	 * 구간에 속하는 숫자의 합을 출력한다.
	 */

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//수열 생성
		int n = 1000;
		List<Integer> list = new ArrayList<Integer>();		
		for(int i = 1; i <= n; i ++) {
			for(int j = 1; j <= i; j++) {
				list.add(i);
			}
		}
		
		//1 < a < b <= 1000
		//System.out.println("A와 B값을 입력하세요");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		
		while(a > b || a < 0 || b < 0 || a > 1000 || b > 1000) {
			//System.out.println("조건에 맞게 다시 A와 B값을 입력하세요");
			a = scan.nextInt();
			b = scan.nextInt();
		}
		
		//a - b 구간의 합
		int sum = 0;
		for(int i = a-1; i <= b-1; i++) { //index 0번부터 시작 하기 때문에 a,b 입력 값에서 -1
			sum += list.get(i);
		}
		
		System.out.println(sum);
		
			
		
//		ArrayList 값 출력
//		for(Integer i : list) {
//			System.out.println(i);
//		}
		
	}
}
