import java.util.Arrays;
import java.util.Scanner;

public class test_피보나치 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		if(n == 0) {
			System.out.println(0);
			return;
		}
		int[] arr = new int[n+1];
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i = 2; i < arr.length ; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		System.out.println(arr[n]);
		
		
	}
}
