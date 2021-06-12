package group_study;

import java.util.Arrays;
import java.util.Scanner;

public class 2460_PJH {
	
	/* 문제:
	 * 최근에 개발된 지능형 기차가 1번역(출발역)부터 10번역(종창역)까지 10개의 정차역이 있는 노선에서 운행되고 있다.
	 * 이 기차에는 타거나 내리는 사람 수를 자동으로 인식할 수 있는 장치가 있다. 이 장치를 이용하여 출발역에서 종착역까지 가는 도중 기차 안에 사람이 가장
	 * 많을 때의 사람 수를 계산하려고 한다. 단, 이 기차를 이용하는 사람들의 질서 의식이 투철하여, 역에서 기차에 탈 때, 내릴 사람이 모두 내린 후에 기차에 탄다고 가정.
	 * 
	 * 이 기차는 다음 조건을 만족하면서 운행된다고 가정한다.
	 * 1. 기차는 역 번호 순서대로 운행한다.
	 * 2. 출발역에서 내린 사람 수와 종착역에서 탄 사람 수는 0이다.
	 * 3. 각 역에서 현재 기차에 있는 사람보다 더 많은 사람이 내리는 경우는 없다
	 * 4. 기차의 정원은 최대 10,000명 이고, 정원을 초과하여 타는 경우는 없다.
	 * 10개의 역에 대해 기차에서 내린 사람 수와 탄 사람의 수가 주어졌을 때, 기차에 사람이 가장 많을 때의 사람 수를 계산하는 프로그램을 작성하시오.
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//필요한 변수 초기화
		int[] totalArr = new int[10];	
		int off = 0;
		int on = 0;
		
		//1st stop
		//System.out.println("출발역 하차, 승차 인원을 입력하세요");
		off = scan.nextInt();
		on = scan.nextInt();
		
		while(off != 0 || on + off > 10000 || on + off < 0) {
			if(off != 0) {
				//System.out.println("출발역 하차 인원은 0명입니다. 하차 인원을 0으로 다시 입력 하세요");
				off = scan.nextInt();
			} else if(on + off > 10000) {
				//System.out.println("기차의 최대 정원은 10,000명 입니다. 승,하차 인원을 다시 입력하세요.");
				off = scan.nextInt();
				on = scan.nextInt();
			} else if(on + off < 0) {
				//System.out.println("기차의 승차 인원은 음수가 될 수 없습니다. 승,하차 인원을 다시 입력하세요.");
				off = scan.nextInt();
				on = scan.nextInt();
			}
		} 
		
		totalArr[0] = on + off;
		
		//2nd to 9th stop
		for(int i = 1; i <= 8; i++) {
			//System.out.println("2번 ~ 9번 역 하차, 승차 인원을 입력하세요");
			off = scan.nextInt();
			on = scan.nextInt();
			
			if(off > totalArr[i-1]) {
				while(off > totalArr[i-1]) {
					//System.out.println("승차한 인원보다 많이 하차 할 수 없습니다. 하차 인원을 다시 입력하세요");
					off = scan.nextInt();
				}
				totalArr[i] = totalArr[i-1] + on - off; 
			} else if(on + off > 10000) {
				while(on + off > 10000) {
					//System.out.println("기차의 최대 정원은 10,000명 입니다. 승,하차 인원을 다시 입력하세요.");
					off = scan.nextInt();
					on = scan.nextInt();
				}
				totalArr[i] = totalArr[i-1] + on - off;
			} else {
				totalArr[i] = totalArr[i-1] + on - off;
			}
//			System.out.println(Arrays.toString(totalArr));
		}
	
		//last stop
		//System.out.println("종창역 하차, 승차 인원을 입력하세요");
		off = scan.nextInt();
		on = scan.nextInt();
		
		while(on != 0 || off > totalArr[8]) {
			if(on != 0) {
				//System.out.println("종창역 승차 인원은 0명입니다. 승차 인원을 0으로 다시 입력 하세요");
				on = scan.nextInt();
			} else if(off > totalArr[8]) {
				//System.out.println("승차한 인원보다 많이 하차 할 수 없습니다. 하차 인원을 다시 입력하세요");
				off = scan.nextInt();
			}
		} 
		
		totalArr[9] = on + off;
		
		Arrays.sort(totalArr); //오름차순 정렬
		
		//System.out.println(Arrays.toString(totalArr));
		System.out.println(totalArr[9]);
		
	}

}
