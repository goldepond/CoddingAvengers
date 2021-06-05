package group_study;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);

			System.out.println("N: ");
			int n = scan.nextInt();
			System.out.println("K: ");
			int k = scan.nextInt();
			
			int[] arr = new int[n];
			int ch = 0;
			
			for(int i = 1; i <= n; i++) {		
			
				if(n % i == 0) {
					arr[ch] = i;
					ch++;
				}				
			}
//			System.out.println(Arrays.toString(arr));
			System.out.println(arr[k-1]);
		}
}
