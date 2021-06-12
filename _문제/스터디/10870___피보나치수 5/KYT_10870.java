	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
	import java.util.Scanner;
	
	public class Main {
		public static void main(String[] args) {
			//=====================
			
			Scanner scan = new Scanner(System.in);
			int n= scan.nextInt();
			List<Integer> P = new ArrayList<>();
			for(int i=0; i<n+1; i++)
			{
				if(i==0)
				{
					P.add(i);
				}
				else if(i==1)
				{
					P.add(1);
				}
				else {
					int pi = P.get(i-1) + P.get(i-2);
					P.add(pi);
				}

			}
			System.out.println(P.get(P.size()-1));
			
		}
	
	}
