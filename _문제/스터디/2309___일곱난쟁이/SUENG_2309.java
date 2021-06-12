import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		System.out.println("dd");
		ArrayList<Integer> list = new ArrayList<Integer>(); // 7명난쟁이와 2명가짜를 담을 list
		ArrayList<Integer> newList = new ArrayList<Integer>(); //7명난쟁이만 담을 list
		Scanner scan = new Scanner(System.in);
		
		
		for(int i=0; i<9; i++) //9명담기
		{
			list.add(scan.nextInt());
		}
		
		int total = list.get(0)+list.get(1)+list.get(2)+list.get(3)
					+list.get(4)+list.get(5)+list.get(6)+list.get(7)
					+list.get(8); 
		int gap = 0;
		
		while(total-gap != 100)
		{
			Collections.shuffle(list);
			gap = (list.get(7)+list.get(8));
		}

		for(int i=0; i<7; i++) // list옮겨 담는작업
		{
			newList.add(list.get(i));
		}
		Collections.sort(newList);
		
		for(int i=0; i<7; i++)
		{
			System.out.println(newList.get(i));
		}
	}
}