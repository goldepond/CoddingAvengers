import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int k1 = scan.nextInt();
		List<Integer> list1 = new ArrayList<>();
		
		for(int i=1;i<=n1;i++)
		{
			if((n1%i) == 0)
			{
				list1.add(i);
			}
			
		}
		if(k1>=1 && k1<=list1.size())
		{
			System.out.println(list1.get(k1-1));
			
		}else {
			System.out.println(0);
		}
        
        scan.close();
	}

}
