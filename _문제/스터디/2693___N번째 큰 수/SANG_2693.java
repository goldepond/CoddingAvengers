import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SANG_2693 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 1 ; i <= num ; i++) {
			
			for(int j = 0 ; j < 10; j++) {
				int a = scan.nextInt();
				list.add(a);
			}
			Collections.sort(list);
			System.out.println(list.get(7));
			list.clear();
		}
	}
}
