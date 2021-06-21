import java.util.ArrayList;
import java.util.Scanner;

public class SANG_1978 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int count = 0;
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 1; i <= num; i++) {
			int a = scan.nextInt();
			
			for(int j = 1; j <= a ; j++) {
				if(a % j == 0) {
					list.add(j);
				}
			}
			
			if(list.size() == 2 && list.size() != 1) {
				count++;
			}
			
			list.clear();
			
		}
		System.out.println(count);
	}
}
