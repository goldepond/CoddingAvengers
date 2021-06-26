package test20210626_01;

import java.util.ArrayList;
import java.util.Scanner;

public class GGU_1292 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count = 1;
		
		while(list.size() < 1000) {
			for(int i = 0; i < count; i++) {
				if(list.size() == 1000) break;
				list.add(count);
			}
			count++;
		}
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int sum = 0;
		for(int i = a - 1; i < b; i++) {
			sum += list.get(i);
		}
		System.out.println(sum);
	}
	
}
