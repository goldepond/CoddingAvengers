package backjoon;

import java.util.Scanner;

public class SANG_2441 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		for(int i = 1; i <= a ; i++) {
			for(int j = 2; j <= i ; j++ ) {
				System.out.print(" ");
			}
				
			for(int k = a-i+1; k > 0 ; k--) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}
}
