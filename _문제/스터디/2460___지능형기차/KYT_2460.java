	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
	import java.util.Scanner;
	
	public class main {
		public static void main(String[] args) {
			//=====================
			
			Scanner scan = new Scanner(System.in);
			int sumsum =0;
			
			int rseult = 0;
			List<Integer> out = new ArrayList<>();
			List<Integer> in = new ArrayList<>();
			List<Integer> sum = new ArrayList<>();
			for(int a=0;a<10;a++)
			{
				int inscan = scan.nextInt();
				in.add(inscan);
				
				int outscan = scan.nextInt();
				out.add(outscan);
			}
			
			for(int a=0;a<10;a++)
			{
				if(a==0)
				{
					sumsum =  out.get(a) -in.get(a);
				}
				else {
					sumsum = sum.get(a-1)+ out.get(a) -in.get(a);
				}
				
				sum.add(sumsum);
			}
			
			System.out.println(Collections.max(sum));

		}
	
	}
