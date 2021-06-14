import java.util.Arrays;
import java.util.Scanner;

public class SANG_3460 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		int[] count = new int[T];
		
		for(int i = 0; i < T ; i++) {
			count[i] = scan.nextInt();
		}
		
		int[] arr = new int[100];
		int i = 0;

		for(int u = 0; u < count.length; u++) {
			
			while(count[u] > 0) {
				arr[i] = count[u]%2;	
				i++;
				count[u] = count[u]/2;
			}
	
			for(int k = 0; k < arr.length; k++) {
				if(arr[k] == 1) {
					System.out.print(k + " ");
				} 
			}
			
			arr = new int[100];
			i = 0;
			
			System.out.println("");
		}
			
	
	}
}
