	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
	import java.util.Scanner;
	
	public class main {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			List<Integer> list1 = new ArrayList<>();
			List<Integer> n1list = new ArrayList<>();
			for(int a=0; a<n;a++) 
			{
				int n1 = scan.nextInt();
				n1list.add(n1);
			}
			for(int a=0; a<n;a++) 
			{
				int n1 = n1list.get(a);

				while(n1>1)
				{
					list1.add(n1%2);
					n1 = (n1-(n1%2))/2;
				}
				list1.add(n1%2);
				
				for(int i=0; i<list1.size();i++)
				{
					if(n1list.get(a) == 0 || n1list.get(a) == 1)
					{
						System.out.print(0 + " ");
					}
					else if(list1.get(i)==1)
					{
						System.out.print(i + " ");
					}
				}
				list1.clear();
				System.out.println();
				
			}

		}
	
	}
