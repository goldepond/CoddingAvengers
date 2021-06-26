package test20210626_01;

import java.util.ArrayList;
import java.util.Scanner;

public class GGU_2581 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int m = scan.nextInt();
		int n = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		es:for(int i = m; i <= n; i++) {
			
			if(i == 1) continue;
			else if(i == 2 || i == 3 || i == 5 || i == 7) {
				list.add(i);
				continue;
			}
			else if(i % 2 == 0) continue;
			else if(i % 3 == 0) continue;
			else if(i % 5 == 0) continue;
			else if(i % 7 == 0) continue;
			
			for(int j = 11; j < i; j++) {
				if(i % j == 0) continue es;
			}
			
			list.add(i);
			
		}
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		if(list.size() == 0) {
			System.out.println(-1);
			return;
		}
		
		System.out.println(sum);
		System.out.println(list.get(0));
	}
	
}
