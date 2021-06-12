package test20210605_01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String arr = scan.nextLine();
		String arr2[] = arr.split(" ");
		
		int n = Integer.parseInt(arr2[0]);
		int k = Integer.parseInt(arr2[1]);
		
		int i = 1;
		int j = 0;
		ArrayList narr = new ArrayList<>();
		while(i <= n / 2) {
			if(n % i == 0) {
				narr.add(i);
			}
			i++;
		}
		narr.add(n);
		
		System.out.println(k > narr.size() ? 0 : narr.get(k - 1));
		
		scan.close();
	}
	
}
