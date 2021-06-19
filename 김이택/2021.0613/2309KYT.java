	import java.util.ArrayList;
import java.util.Collections;
	import java.util.List;
	import java.util.Scanner;
	
	public class main {
		public static void main(String[] args) {
			//=====================
			
			Scanner scan = new Scanner(System.in);
			
			List<Integer>  list1 = new ArrayList<>();
			int c =0;
			int sum=0;
			for(int a=0; a<9;a++)
			{
				int n= scan.nextInt();
				list1.add(n);
				sum = sum + n;
			}
			
			for(int a=0; a<9;a++) 
			{
				for(int b=0; b<9;b++) 
				{
					int aa  = list1.get(a);
					int bb = list1.get(b);
					if(sum-100 == aa+bb && a!=b)
					{
						list1.remove(a);
						list1.remove(b-1);
						Collections.sort(list1);
						for(int f=0;f<7;f++)
						{
							System.out.println(list1.get(f));
						}
						return;
					}
					
				}
			}
			
		}
	
	}
