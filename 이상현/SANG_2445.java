package backjoon;

import java.util.Scanner;

public class SANG_2445 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = 2*a - 1;
		
		for(int x = 1; x <= b ; x++) {
			if(x <= a) {
				for(int i = 1; i <= x ; i++) {
					System.out.print("*");
				}
				
				for(int i =2*a-2*x; i > 0 ; i-=1) {
					System.out.print(" ");
				}
				
				for(int i = 1; i<=x ; i++) {
					System.out.print("*");
				}
			
				System.out.println("");
				
			} else if(x > a) {
				
				for(int i=x%a; i <= a-1; i++) {
					System.out.print("*");
				}
				
				for(int i= 1 ; i <= (x%a)*2 ; i++) {
					System.out.print(" ");
				}
				
				for(int i=x%a; i <= a-1; i++) {
					System.out.print("*");
				}
					
				System.out.println("");
			}
			
		}
		
		
	}
}
