import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		
		for(int i =1;i<=n1;i++)
		{
			for(int a =0;a<i;a++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
