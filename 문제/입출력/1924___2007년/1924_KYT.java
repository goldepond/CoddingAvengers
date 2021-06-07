
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int total=0;
		for(int i=1; i<n1;i++)
		{
			if(i==1 || i==3|| i==5||i==7||i==8||i==10||i==12)
			{
				total = total+31;
			}
			else if(i==2)
			{
				total = total+28;
			}
			else {
				total = total+30;
			}
		}
		total = total+n2;
		switch(total%7)
		{
		case 1:
			System.out.println("MON");
			break;
			
		case 2:
			System.out.println("TUE");
			break;
			
		case 3:
			System.out.println("WED");
			break;
			
		case 4:
			System.out.println("THU");
			break;
			
		case 5:
			System.out.println("FRI");
			break;
			
		case 6:
			System.out.println("SAT");
			break;
			
		case 0:
			System.out.println("SUN");
			break;
			
		}
	}

}
