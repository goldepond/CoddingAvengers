import java.util.Arrays;
import java.util.Scanner;

public class test_기차 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[20];
		//arr[0] 은 내린사람 arr[1]은 탄사람
		
		for(int i = 0; i < arr.length ; i++) {
			arr[i] = scan.nextInt();
		}
		
		int count = 0; //타고있는 사람의 수
		int[] arrp = new int[10]; //정거정에서 사람수
		
		for(int s = 1; s <= 20; s += 2) {
			
			count = count - arr[s-1] + arr[s];

			arrp[s/2] = count;
			
			
			}
			
		Arrays.sort(arrp);
		System.out.println(arrp[9]);

	}
}