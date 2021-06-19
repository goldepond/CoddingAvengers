import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num= scan.nextInt();
		int num2= scan.nextInt();
		int sum = num;
		int sum2 = num2;
			int total =1;
			for(int a=2;a<=num;a++)
			{
				while(sum%a==0 && sum2%a ==0)
				{
					sum = sum/a;
					sum2 = sum2/a;
					total *= a;
				}
			}
			System.out.println(total);
			System.out.println(total*sum*sum2);
	}
}
