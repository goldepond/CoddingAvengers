import java.util.ArrayList;
import java.util.Scanner;

public class SANG_2609 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int gop = a * b;
		
		if(a > b) {
			int emp = a;
			a = b;
			b = emp;
		}

		ArrayList<Integer> mina = new ArrayList<>();
		ArrayList<Integer> minb = new ArrayList<>();
		ArrayList<Integer> maxa = new ArrayList<>();
		ArrayList<Integer> maxb = new ArrayList<>();
		
		
		for(int i=a ; i > 0 ; i-- ) {
			if(a % i == 0) {
				maxa.add(i);
			}
		}
		
		es : for(int i=b ; i > 0 ; i-- ) {
			if(b % i == 0) {
				maxb.add(i);
				if(maxa.contains(i)) {
					System.out.println(i);
					break es;
				}
			}
			
			
		}
		

		ex : for(int i= 1; i <= gop ; i++) {
			mina.add(a*i);
			minb.add(b*i);
			
			if(minb.contains(a*i)) {
				System.out.println(a*i);
				break ex;
			}
			
		}

	}
}
