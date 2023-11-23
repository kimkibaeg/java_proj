package chap03.ex04;

public class ReationOperator {
	public static void main(String[] args) {
		/* 비교 연산자 : 결과를 true, false 를 리턴 (되돌려줌)
		 	- 크기 비교 연산자 : >, <, >=, <=
		 	- 등가 비교 연산자 : == (같은 면 true), != (같지 않으면 true)
		
		*/
		
		// 1. 크기 비교 연산자 / 등가 비교 연산자
		System.out.println( 5 > 2 );    // true
		System.out.println( 5 < 2 );    // false
		System.out.println( 5 >= 2 );    // true
		System.out.println( 5 <= 2 );    // false
		System.out.println( 5 == 2 );    // false
		System.out.println( 5 != 2 );    // true
		
		char a = 'a';
		char b = 'a';
		
		System.out.println( a == b );    // true
		System.out.println( a != b );    // false
		
		System.out.println("==========");
		// 2. 참조 자료형일 때 등가 비교 연산자 사용
			// 객체 변수 명 (str1)	: stack 메모리 영역에 저장됨. str1 = 값이 저장된 Heap의 주소를 가지고 있음.
			// 객체의 값은 : Heap 메모리 영역에 저장
		
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		
		System.out.println(str1 == str2);    // == 은 stack 의 변수의 값을 비교
		
		// 참조 자료형일 때 Heap 영역의 값을 비교 할때 .equals() 를 사용해서 값을 비교
		
		System.out.println(str1.equals(str2));    // true
		
		System.out.println("====================");
		// String 은 특수한 기능들이 많이 적용 되어 있음.
		
		String str3 = "오늘";
		String str4 = "오늘";
		
		System.out.println(str3 == str4);    // == 는 stack 에 저장 된 변수의 값을 비교
		System.out.println(str3.equals(str4));    // Heap 에 저장 된 값을 비교
		
		
		

	}

}
