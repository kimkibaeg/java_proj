package chap03.ex02;

import java.util.Scanner;

public class BitWiseOperator {
	public static void main(String[] args) {
		// 다양한 진법 표현, 비트연산자
		
		// 1. 다양한 진법 표현 : 2 진수 (BIN), 8 진수 (OCT), 10 진수 (DEC), 16 진수 (HEX), calc (계산기)
		
		int data = 13;
		
		// 정수를 2 진수로 변환 : Integer.toBinaryString(정수); ===> 2 진수로 출력
		System.out.println(Integer.toBinaryString(data));  // 1101
		
		// 정수를 8 진수로 변환 : Integer.toOctalString(정수); ===> 8 진수로 출력
		System.out.println(Integer.toOctalString(data));  // 15
			
		// 정수를 16 진수로 변환 : Integer.toHexString(정수); ===> 16 진수로 출력
		System.out.println(Integer.toHexString(data));  // d
		
		// 문자열로 된 숫자를 정수 Type 으로 변환  <==== 중요, 많이 사용됨
		System.out.println( "3" + "5" );	// 문자열 + 문자열 = 문자열 연결
		
		// Integer.parseInt("숫자 정수"); ===> 정수 Type 으로 저장됨.       <=== << 많이사용>>
		System.out.println(Integer.parseInt("3") + Integer.parseInt("5"));   // 8
		
		// 문자열로 된 실수를 실수 Type 으로 변환  <==== 실수 타입으로 저장
		// Double.parseDouble("13.5"); ==> 실수로 변환
		System.out.println("13.5" + "17.77");   // 13.517.77
		
		System.out.println(Double.parseDouble("13.5") + Double.parseDouble("17.77")); // 31.27
		
		System.out.println("====================================");
		// 스캐너에서 숫자가 문자열로 들어왔을 때 정수로 변환, 실수로 변환 후 연산
		
		Scanner sc = new Scanner (System.in);    // Ctrl + Shift + o
		
		String kor ;
		String eng ;
		String avg ;
		
		System.out.println(" 국어점수(정수) 영어점수(정수) 평균(실수) 로 입력해 주세요 >>>>");
		
		kor = sc.next();
		eng = sc.next();
		avg = sc.next();
		
//		int hap = kor + avg ;	// 오류 발생, Type 이 맞지 않는다.
		int hap = Integer.parseInt(kor) + Integer.parseInt(eng);
		
		System.out.println("국어점수 + 영어점수 : " + hap );
		System.out.println("평균 출력 : " + Double.parseDouble(avg));
		
		
	}
}
