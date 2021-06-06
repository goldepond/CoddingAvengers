
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{	
		Scanner scan = new Scanner(System.in);
		
		int month = scan.nextInt();
		int day = scan.nextInt();
		int index = day%7;
		String[] answer = {"SUN","MON","TUE","WED","THU","FRI","SAT","SUN","MON","TUE","WED","THU","FRI","SAT"};
		
		if(month == 1 || month == 10)
		{
			System.out.println(answer[index]);
		}else if(month==2 || month==3 || month==11)
		{
			System.out.println(answer[index+3]);
		}else if(month==4 || month==7)
		{
			if(index == 0) {
				System.out.println("SAT");
			}else {
				System.out.println(answer[index-1]);
			}
		}else if(month==5)
		{
			System.out.println(answer[index+1]);
		}else if(month==6)
		{
			System.out.println(answer[index+4]);
		}else if(month==8)
		{
			System.out.println(answer[index+2]);
		}else if(month==9 || month ==12)
		{
			System.out.println(answer[index+5]);
		}
	}
}
