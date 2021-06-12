import java.util.Scanner;

public class test2440 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		for(int i = a; i > 0 ; i-- ) {
			for(int j = i ; j > 0 ; j-- ) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
