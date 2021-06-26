import java.util.ArrayList;
import java.util.Scanner;

public class SANG_1292 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int sum = 0;
		
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 1 ; i <= b ; i++) {
			for(int j = 1; j <= i ; j++) {
				list.add(i);
			}
		}
		

		
		for(int i = a ; i <= b ; i++) {

			sum += list.get(i-1);
		}
		
		System.out.println(sum);
		
	}
	
}
