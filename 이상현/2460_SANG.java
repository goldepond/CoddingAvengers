import java.util.Arrays;
import java.util.Scanner;

public class test_���� {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[20];
		//arr[0] �� ������� arr[1]�� ź���
		
		for(int i = 0; i < arr.length ; i++) {
			arr[i] = scan.nextInt();
		}
		
		int count = 0; //Ÿ���ִ� ����� ��
		int[] arrp = new int[10]; //���������� �����
		
		for(int s = 1; s <= 20; s += 2) {
			
			count = count - arr[s-1] + arr[s];

			arrp[s/2] = count;
			
			
			}
			
		Arrays.sort(arrp);
		System.out.println(arrp[9]);

	}
}