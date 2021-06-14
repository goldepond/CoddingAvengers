package test20210612_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class quiz_10818_GGU {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<Integer>();
		
		int n = scan.nextInt();
		for(int i = 0; i < n; i++) {
			int k = scan.nextInt();
			list.add(k);
		}
		
		Collections.sort(list);
		
		System.out.println(list);
		
		System.out.println(list.get(0) + " " + list.get(list.size() - 1));
	}
}
