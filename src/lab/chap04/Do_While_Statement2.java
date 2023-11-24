package lab.chap04;

import java.util.Scanner;

public class Do_While_Statement2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a ;      // 스캐너로 인풋 받는 변수
		
		do {
			System.out.println("==========================================================================");
			System.out.println("1. 구구단 출력 || 2. 19단 출력 || 3. 1 ~ 1000 까지 3의 배수 출력 || 4. 10개의 정수를 입력 받아 그 수들 중 짝수의 개수가 몇개 인지 출력하는 프로그램 || 5. 프로그램 종료");
			System.out.println("==========================================================================");
			System.out.println("위 의 내용을 정수로 입력 하세요 >>>");
			a = sc.nextInt();
			
			if (a == 1) {
				System.out.println("1. 구구단 출력");
				// 구구단 출력 프로그램
				for (int i = 1 ; i < 10 ; i ++) {			// i 단을 출력 하는 변수
					System.out.println("=== 구구단 " + i + " 단 출력 ===");
					for (int j = 1; j < 10 ; j ++) {		// j 각 단에서 1 ~ 9 곱하는 수
						System.out.println(i + " * " + j + " = " + (i * j));
					}	
				}
				
			}else if (a == 2) {
				System.out.println("2. 19단 출력");
				// 19단 출력 프로그램 작성
				for (int i = 1 ; i < 20 ; i++) {
					System.out.println("=== 19단 " + i + " 단 출력 ===");
					for (int j = 1; j < 10 ; j ++) {
						System.out.println(i + " * " + j + " = " + (i * j));
					}
				}
				
			}else if (a ==3) {
				System.out.println("3. 1 ~ 1000 까지 3의 배수 출력");
				// 1 ~ 1000 까지 3의 배수 출력
				
				System.out.println("=== for 문 ===");
				for (int i = 1; i < 1000 ; i++) {
					if (i % 3 == 0) System.out.println("3의 배수 : " + i);
				}
				
				System.out.println("=== while 문 ===");
				int b = 3 ;
				while (b < 1000) {
					
					System.out.println("3의 배수 : " + b);
					b += 3;      // b = b + 3;
				}
				
				System.out.println("=== do while 문 ===");
				boolean c = true;
				int d = 0;
				do {
					
					if (d % 3 == 0) {System.out.println("3의 배수(do while) : " + d);}
					if (d == 1000) c = false ;
					d++;
				}while (c) ;
				
				
			}else if (a == 4) {
				// 4. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇 개인지 출력하는 프로그램
				System.out.println("10개의 정수를 공백으로 넣으세요 >>>");
				int c, count = 0 ;		// c : 스캐너로 정수를 받는 변수, count : 인풋 받은 것 중 짝수를 카운트 하는 변수
				for (int i = 1 ; i <= 10 ; i++) {
					c = sc.nextInt();			// 10 번 루프 : Input 값을 할당 받음.
					
					if (c <= 0) {		// 0 이거나 음수는 카운트 하지 않음.
						continue ;
					}
					if (c % 2 == 0) {	// 짝수만 카운트 변수에 할당 한다.
						count++ ;
					}
				}
				System.out.println("입력 한 10개의 정수 중 짝수는 : " + count + " 개 입니다.");
				
				
				System.out.println("4. 프로그램을 종료 합니다.");
				break;
			}
			
		}while (true) ;
		
		
		sc.close();    // 메모리에서 스캐너를 제거 해야함.
		
		
		
		
		
	}

}
