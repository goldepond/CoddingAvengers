package backjoon;

import java.util.Scanner;

public class SANG_2442 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int count = 2 * a - 1;
		
		for(int i = 1; i <= a ; i++) {
			for(int j = a-i ; j > 0 ; j--) {
				System.out.print(" ");
			}

			for(int k = 1 ; k <= i*2-1 ; k++) {
				System.out.print("*"); 
				
			}
			
			System.out.println("");
		}
	}
}
