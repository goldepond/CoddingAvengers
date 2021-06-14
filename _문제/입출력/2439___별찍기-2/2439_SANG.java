import java.util.Scanner;

public class test2439 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		for(int i = 1; i <= a ; i++) {
			for(int j = a-i; j > 0  ; j--) {
				System.out.print(" ");
			}
			for(int z = 1; z <= i ; z++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
