package backjoon;

import java.util.Scanner;

public class SANG_2446 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i=1; i<=n*2-1 ; i++) {
			if(i <= n) {
				
				for(int j=1; j < i; j++) {
					System.out.print(" ");
				}
				
				for(int j=i ; j <= n*2-i ; j++) {
					System.out.print("*");
				}
				System.out.println("");
			} else {
				for(int j=i ; j < n*2-1; j++) {
					System.out.print(" ");
				}
				
				for(int j=i+1 ; j > n*2-i ; j--) {
					System.out.print("*");
				}
				
				System.out.println("");
			}

		}
		
	}

}
