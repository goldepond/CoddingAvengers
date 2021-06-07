package prep;

import java.util.Scanner;

public class Quiz1924 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		int day = scan.nextInt();
		
		//0 < month < 13, 0 < day < 32
		while(month > 12 || month < 1 || day > 31 || day < 1) {
			//System.out.println("월은 1~12, 일은 1~31 까지의 수를 입력하세요");
			month = scan.nextInt();
			day = scan.nextInt();
		}
		
		//1, 3, 5, 7, 8, 10, 12 월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일까지
		int[] numOfDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		
		//일수 계산
		int daysInTotal = 0;
		
		for(int i = 1; i <= 12; i++) {
			//입력 받은 month의 일수는 포함하지 않고, for문 밖에서 day와 더해 총 일수를 구한다
			if(i == month) break; 
			daysInTotal += numOfDays[i]; //month 값이 5라면 numOfDays[1] ~ [4] 값 누적해서 더한다
		}
		
		//month월 day일 까지 총 일 수
		daysInTotal += day;
		
		//1일은 월요일, 7일은 일요일이니까 7로 나누고 나머지로 요일 계산  
		switch(daysInTotal % 7){
		case 0:
			System.out.println("SUN");
			break;
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("THU");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SAT");
			break;
		}
		
		scan.close();
	}
}
