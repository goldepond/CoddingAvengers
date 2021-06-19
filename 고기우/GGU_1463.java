package test20210619_01;

import java.util.Scanner;

public class GGU_1463 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		int n = scan.nextInt();
		
		
		if(n < 1 || n > 1000000) return;
		// 재귀함수 + Math.min() 사용
		while(n > 1) {
			
			if(n == 2) {
				count++;
				break;
			} else if(n == 3) {
				count ++;
				break;
			} else if(n % 3 == 0) {
				n /= 3;
				count++;
			} else if(n % 3 == 1) {
				n -= 1;
				count++;
			} else if(n % 3 == 2) {
				if(n % 2 == 0) {
					n /= 2;
					count++;
				} else {
					n -= 1;
					count++;
				}
			}
			System.out.println(n);
		}
		System.out.println(count);
	}
	
}
