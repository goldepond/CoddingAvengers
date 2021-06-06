
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = n;
		
		for(int i=0; i<n; i++)
		{
			for(int j=1; j<m; j++)
			{
				System.out.print(" ");
			}
			for(int j=m; j<n; j++)
			{
				System.out.print("* ");
			}
			System.out.println("*");
			m--;
		}
	}
}