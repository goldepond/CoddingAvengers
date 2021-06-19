package test20210619_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GGU_2609 {
	
	static HashMap<Integer, ArrayList<Integer>> data = new HashMap<>();
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> brr = new ArrayList<>();
		
		int i = 1;
		while(i <= a / 2) {
			
			if(a % i == 0) {
				arr.add(i);
			} 
			
			i++;
		}
		arr.add(a);
		data.put(a, arr);
		
//		System.out.println(data.toString());
//		arr.clear();
//		===================
		
		i = 1;
		while(i <= b / 2) {
			if(b % i == 0) {
				brr.add(i);
			}
			i++;
		}
		brr.add(b);
		data.put(b, brr);
//		System.out.println(data.toString());
//		===================
		
		ArrayList<Integer> crr = new ArrayList<>();
		if(a >= b) {
			for(int j = 0; j < brr.size(); j++) {
				if(data.get(a).contains(data.get(b).get(j))) {
					crr.add(data.get(b).get(j));
				}
			}
		} else {
			for(int j = 0; j < arr.size(); j++) {
				if(data.get(b).contains(data.get(a).get(j))) {
					crr.add(data.get(a).get(j));
				}
			}
		}
//		System.out.println(crr.get(crr.size() - 1));
		//===============================
		
		int c = crr.get(crr.size() - 1); // 최대공약수
		
		int ac = a / c;
		int bc = b / c;
		
		int d = c * ac * bc;
		System.out.println(c + "\n" + d);
	}
	
}
