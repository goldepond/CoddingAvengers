package test20210612_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class quiz4_2309_GGU {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int count = 0;
		
		for(int i = 0; i < 9; i++) {
			int n = scan.nextInt();
			list.add(n);
			count += n;
		}
		int height = count - 100;
		
		end : for(int i = 0; i < list.size(); i++) {
			
			int num1 = list.get(i);
			
			for(int j = 0; j < list.size(); j++) {
				
				int num2 = list.get(j);
				
				if(i == j) continue;
				
				if(num1 + num2 == height && i!=j) {
					
					list.remove(i);
					list.remove(j-1);

					break end;
					
				}
			}
		}
		Collections.sort(list);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
}
