package group_study;

//공부 하면서 찾은 풀이 입니다ㅎㅎ 
import java.util.Scanner;

public class 3460_PJH {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		
		for(int i = 1; i <= t; i++) {
			
			int decimal = scan.nextInt();
			String binary = Integer.toBinaryString(decimal);
			
			for(int j = binary.length()-1; j >= 0; j--) {
				
				if(binary.charAt(j)=='1') {
					System.out.print(binary.length()-j-1 + " ");
				}
			}
			System.out.println();
		}
	}

}
