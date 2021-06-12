package test20210612_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class quiz1_3460_ggu {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();
//		scan.nextLine();
//		String str = scan.nextLine();
		
		int[] arr = new int[t];
		
		for(int i = 0; i < t; i++) {
			arr[i] = scan.nextInt();
		}
//		System.out.println(Arrays.toString(arr));
//		System.out.println(t);
//		System.out.println(str);
		int a = 1;

//				System.out.println(t);
//				System.out.println(str);
		if(t < 1 || t > 10) return;

		for(int i = 0; i < t; i++) {

			List<Integer> ans = new ArrayList<Integer>();
//			int n = Integer.parseInt(str.split(" ")[i]);
			int n = arr[i];
			
			if(n < 1 || n > 1000000) return;

			while(n / 2 > 0) {

				int e = n;
				int count = 0;
				a = 1;

				while(e / 2 != 0) {
					e /= 2;
					count++;
				}
				for(int j = 0; j < count; j++) {
					a *= 2;
				}
				n %= a;

				ans.add(count);
			}

			if(n == 1) {
				ans.add(0);
			}

			for(int k = ans.size()-1; k >= 0; k--) {

				if(k < 0) {
					
				}
				
				System.out.print(ans.get(k));

				if(k == 0) {
					System.out.println();
					break;
				}
				System.out.print(" ");
			}
			

		}

	}

}
