package lab.chap03;

import java.util.Scanner;

public class ConditionalOperator {
	public static void main(String[] args) {
		// 스캐너 장착, 정수, % 나머지, || 연산자 사용, 삼항 연산자 사용.
//		Scanner sc = new Scanner(System.in);
		
		// 1. 스캐너로 정수 값을 인풋 받아서 : 출력 내용 : 인풋 받은 값은 00 이고, 짝수 입니다. ( 홀수 입니다. )
//		sc.nextInt();
//		System.out.println("인풋 받은 값은" + sc.nextInt() + " 이고, 짝수 입니다.");
		
		// 2. 스캐너로 값을 인풋 받아서 : 출력 내용 : 인풋 받은 값은 00 이고, 3, 6, 9의 배수 입니다. (3, 6, 9의 배수가 아닙니다.)
		
		
		// 1. Scanner 장착
		Scanner sc = new Scanner(System.in);
		
		// 2. 인풋 받을 변수 선언 : 정수
		int abc ;
		
		// 3. 스캐너로 정수 값을 인풋 받음.
		System.out.println("정수 값 하나를 입력하세요 >>>> ");
		abc = sc.nextInt();
		
		System.out.printf("인풋 받은 값은 %s 이고, ", abc);
		System.out.println( (abc % 2 == 0 ) ? "짝수 입니다." : "홀수 입니다.");
		
		System.out.printf("인풋 받은 값은 %s 이고, ", abc);
		System.out.println( (abc % 3 == 0 || abc % 6 == 0 || abc % 9 == 0  ) ? "3, 6, 9의 배수 입니다." : "3, 6, 9의 배수가 아닙니다.");
	}

}
