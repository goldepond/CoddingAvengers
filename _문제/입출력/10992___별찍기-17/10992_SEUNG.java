
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
			for(int j= (n*2)-(i*2)-1; j<n*2; j++)
			{
				if(!(i==n-1))
				{
					if(j==(n*2)-(i*2)-1 || j ==n*2-1) 
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
						continue;
					}
				}else 
				{
					System.out.print("*");
				}
			}
			System.out.println("");
			m--;
		}
	}
}