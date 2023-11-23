package chap04.ex01;

public class If_Statement {

	public static void main(String[] args) {
		/*
		    클래스명 : 반드시 첫자는 영문 대문자
		    변수명  : 소문자로 시작 (권장사항), 낙타형식으로 이름을 사용
		    상수명  : 대문자로만 (권장사항)
		    
		    	특수문자 : _ , & 만 사용 가능
		    	숫자가 처음에 오면 오류가 발생함. 숫자는 사용 가능 
		 */
		
		/*
		   제어문 : 프로그램의 순서를 바꾸어서 처리함. 
		   	if 문        <== break; 가 내장 
		   	switch 문    <== break; (블락을 빠져 나올 때 사용함.)
		   	
		   if -- 3가지 구문
		   
		   1.	조건이 1개 일 때		<==== 삼항 연산자로 수정		(조건) ? 참 : 거짓 ;
		   
		   		if (조건) {
		            조건이 true 일 때 실행문 ;
		        }else {
		            조건이 false 일 때 실행문 ;
		        }
		        
		   2. 조건이 여러개 일 때
		   		
		   		if (조건1) {
		   			조건1이 일 때 ;
		   		} else if (조건2) {
		   			조건2이 일 때 ;
		   		} else if (조건3) {
		   			조건3이 일 때 ;
		   		} else if (조건4) {
		   			조건4이 일 때 ;
		   		} else {
		   			위의 모든 조건이 만족되지 않을 때 작동
		   		}
		   		
		   3. 한 라인으로 사용
		    	if (조건) { 조건이 true 일 때 }
		    	if (조건) 조건이 true 일 때 ;
		    	
		 */
		
		
		// 조건이 1개 일 때 : if ~ else ~
		int a = 10 ;
		
		if ( a < 30 ) {
			System.out.println(" 참입니다. ");    // 조건이 참이면 실행
			
			System.out.println("참일 때 또 실행 됩니다.");
			
		}else {
			System.out.println(" 거짓입니다. ");  // 조건이 거짓이면 실행
		}
		
		System.out.println("프로그램 종료입니다.");
		
		// 조건이 여러개 일 때 : 점수가 90점 이상일때 : A 학점, 80점 이상일때 : B학점, 70점 이상일때 : C학점
		
		int score = 95 ;
		
		if ( score >= 90) {
			System.out.println("A 학점입니다. ");
		}else if (score >= 80) {
			System.out.println("B 학점입니다. ");
		}else if (score >= 70) {
			System.out.println("C 학점입니다. ");
		}else if (score >= 60) {
			System.out.println("D 학점입니다. ");
		}else {
			System.out.println("F 학점입니다.");
		}
		
		System.out.println("=========if 조건에서 조건처리=========");
		
		score = 90 ;
		
		if ( score >= 60 && score < 70) {			// true && false ==> false
			System.out.println("D 학점입니다. ");
		}else if (score >= 70 && score < 80) {		// true && false ==> false
			System.out.println("D 학점입니다. ");
		}else if (score >= 80 && score < 90) {		// true && false ==> false
			System.out.println("B 학점입니다. ");
		}else if (score >= 90 && score < 100) {		// true && true ==> true
			System.out.println("A 학점입니다. ");
		}else {
			System.out.println("F 학점입니다.");
		}
		
		System.out.println("====================");
		
		
		// 조건이 true 일 때만 실행 : 중괄호를 넣어도 되고 생략 될 수도 있다.
		
		if (10 > 5) { System.out.println("참입니다."); }
		
		if (10 > 5) System.out.println("10은 5보다 큽니다.");
		
		
		
		
		
		
	}

}
