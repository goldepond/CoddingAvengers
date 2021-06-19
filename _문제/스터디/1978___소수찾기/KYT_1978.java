import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num= scan.nextInt();
		int total =0;
		
		List<Integer> list1 = new ArrayList<>();
		for(int a=0;a<num;a++)
		{
			int num2= scan.nextInt();
			list1.add(num2);
		}
//		System.out.println("============================");
		Collections.sort(list1);
//		System.out.println(list1.get(list1.size()-1));
//		System.out.println(list1);
		for(int a=1;a<=list1.get(list1.size()-1);a++)
		{
			for(int y=2;y<=a;y++)
			{
				if(a%y==0)
				{
					if( y==a && list1.contains(a))
					{
						total++;
					}
					else {
						break;
					}
					
				}
			}
		}
	System.out.println(total);
	}
}
