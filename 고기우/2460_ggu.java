package test20210612_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class quiz2_2460_ggu {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<Integer> people = new ArrayList<>();
		int ans = 0;
		people.add(ans);

		for(int i = 0; i < 10; i++) {
			
			List<Integer> station = new ArrayList<>();
			
			while(true) {
				
				int n = scan.nextInt();
				
				station.add(n);
				
				if(station.size() == 2) {
					ans = people.get(people.size() - 1) - station.get(0) + station.get(1);
					
					people.add(ans);
//					System.out.println(ans);
					break;
				}
			} //while end
		} // for end
		
		Collections.sort(people);
		System.out.println(people.get(people.size() - 1));
		
	}
	
}
