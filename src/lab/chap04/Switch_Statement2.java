package lab.chap04;

import java.util.Scanner;

public class Switch_Statement2 {
	public static void main(String[] args) {
		/*
		 	switch ~ case 문으로 프로그램 작성
		 	월을 입력해서 해당 월은 00일 입니다.
		 	
		 	31을 출력되는 월 : 1, 3, 5, 7, 8, 10, 12
		 	30일 출력되는 달 : 4, 6, 9, 11
		 	28일 출력되는 달 : 2
		 	
		 	스캐너로 달을 입력 받고, 해당 달에 대한 일을 출력.
		 		출력 내용 : "해당 월은 00월이고, 00일 까지 존재 합니다."
		 */
		
//		int month ;       // 스캐너로 input을 받습니다.
//		int day = 30;	  // 

		/*
		Scanner sc = new Scanner(System.in);
		
		int month ;
		int day ;
		
		System.out.println("출력을 희망하시는 월을 적어주세요");
		month = sc.nextInt();
		day = sc.nextInt();
		
		
		switch (month) {
		case 1 : case 3 : case 5 : 
			System.out.println("당신은 금메달을 획득했습니다.");
			break;
		case 2 : case 20 : case 200 :
			System.out.println("당신은 은메달을 획득했습니다.");
			break;
		case 3 : case 30 : case 300 :
			System.out.println("당신은 동메달을 획득했습니다.");
			break;
		default :
			System.out.println("잘못 된 값을 입력했습니다. 점수 1 ~ 3 중 하나의 값을 넣으세요.");
		}
		*/
		
		int month;
		int day = 30;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("(1월 ~ 12월)을 정수 값으로 입력 하세요 >>>");
		month = sc.nextInt();
		
		switch (month) {
		case 1 : case 3: case 5: case 7: case 8: case 10: case 12:
			day += 1 ;	 // day = day + 1 ;
			System.out.printf("해당 월은 %d 월이고, %d일 까지 존재 합니다. \n\n", month, day);
			break;
		case 2 :
			day -=2 ;    // day = day - 2 ;
			System.out.printf("해당 월은 %d 월이고, %d일 까지 존재 합니다. \n\n", month, day);
			break;
		default :    // 4, 6, 9, 11
			System.out.printf("해당 월은 %d 월이고, %d일 까지 존재 합니다. \n\n", month, day);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
