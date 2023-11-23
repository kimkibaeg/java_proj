package lab.chap04;

import java.util.Scanner;

public class Switch_Statement {
	public static void main(String[] args) {
		/*
		 	switch 문을 사용해서 출력 / if ~ else if
		 	
		 	스캐너로 정수를 입력 받으세요.
		 	1		"당신은 금메달을 획득했습니다."
		 	2		"당신은 은메달을 획득했습니다."
		 	3		"당신은 동메달을 획득했습니다."
		 			"점수 1 ~ 3 중 하나의 값을 넣으세요."
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int a ;
		
		System.out.println("점수 1 ~ 3 중 하나의 값을 넣으세요.");
		a = sc.nextInt();
		
		switch (a) {
		case 1 : case 10 : case 100 :
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
		
		System.out.println("===========if 문으로 출력===========");
		
		if (a == 1 || a == 10 || a == 100) {
			System.out.println("당신은 금메달을 획득했습니다.");
		} else if (a == 2 || a == 20 || a == 200){
			System.out.println("당신은 은메달을 획득했습니다.");
		} else if (a == 3 || a == 30 || a == 300) {
			System.out.println("당신은 동메달을 획득했습니다.");
		} else {
			System.out.println("잘못 된 값을 입력했습니다. 점수 1 ~ 3 중 하나의 값을 넣으세요.");
		}
		
		
		
		

	}
}
