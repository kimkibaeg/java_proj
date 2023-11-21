package chap02.ex01;
// 패키지 : 폴더


public class UsageOfDataType {   // 클래스 영역
	public static void main(String[] args) {   // 메인 메소드
		// 변수 : 한 번 선언 후 변수의 값을 다른 값을 할당 할 수 있다., 소문자로 시작해서 캐멀케이스 이름 작성
		// 상수 : 변수 선언 앞에 final 키가 등록 됨., 상수명은 대문자로만 지정, 한 번 값을 할당하면 그 값을 수정 할 수 없다.
		
		/* 자료형 : 변수 혹은 상수를 정의할 때 반드시 자료형 , <<P.60 Page>>
			- 기본 자료형 (8개)   : 메모리의 Stack 공간에 변수와 값이 할당
				boolean, 정수 (byte, short, int, long), 실수 (float, double), 문자 (char)
				  (true/false)
			- 참조 자료형 (무한대) : 메모리의 Stack 공간에는 변수명, 값은 Heap에 저장 됨.
						첫 자는 대문자
						객체  /  배열
						String : 참조자료형, 문자열을 담는다.
		*/
		
		// 변수 선언 방법 2 가지
		//1. 변수 선언과, 값은 나중에 할당.
		int a;		// 변수 선언
		int b;		// 변수 선언
		
		a= 1;		// 변수의 값은 나중에 할당.
		
		System.out.println(a);
//		System.out.println(b);     // 오류 발생 : 변수 선언 후 값이 할당이 안되어 있어
		
		//2. 변수 선언과 동시에 값을 할당.
		int c = 10;
		int d = 20;
		System.out.println(c);
		System.out.println(d);
		
		//리터럴 : 변수, 상수에 들어가는 값
		
		//변수에 새로운 값을 할당
		c = 55;
		d = 66;
		System.out.println(c);  //55
		System.out.println(d);  //66
		
		// 상수 : 한 번 값이 할당 되면 다른 값을 넣을 수 없다. final 키를 넣어서 상수 선언.
			// 상수 명은 대문자로 할당.
		final int ABC = 200;
		final double PI = 3.14;
		
		System.out.println(ABC);
		
//		ABC = 300;		// 상수는 새로운 값을 넣으면 오류 발생
		
		
		System.out.println("=======8가지 자료형 =======");
		
		//기본 자료형 8가지
		//1. boolean : 
		boolean abc ; // true, false 값만 넣을 수 있다.
		abc = true;
		
		System.out.println(abc);   // true
		
		//2. 정수 값을 넣을 수 있는 자료형 (byte : 1byte, short : 2byte, int : 4byte, long : 8byte)
		//byte : 1byte (8bit) : -128 ~ 127
		byte aa ;
		byte bb ;
		aa = 127;
		bb = 127;
		System.out.println(aa);
		System.out.println(bb);
		
		//short : 2byte (16bit) : -32,768 ~ = 32,767
		short cc;
		short dd;
		cc = -32768;
		dd = 32767;
		System.out.println(cc);
		System.out.println(dd);
		
		// int : 4byte (32bit) : -2,147,483,648 ~ 2,147,483,647
		int ee ;
		int ff ;
		ee = -2_147_483_648;   // _ 는 구분자로 생략
		ff = 2_147_483_647;
		System.out.println();
		System.out.println();
		
		// long : 8byte (64bit) : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
			// 64 bit : 처음 비트 (MSB, 부호를 처리하는 비트)
			// clac
			// 리터럴에 l, L을 명시를 해야 한다.
		
		long gg;
		long hh;
		// 정수의 범위를 벗어난 값을 넣을 때 : L
		gg = -9_223_372_036_854_775_808L;   // 리터럴에 L을 적용.
		hh = 9_223_372_036_854_775_807l;
		System.out.println(gg);
		System.out.println(hh);
		
		long ii;
		ii = 5000;   // int 범위 내의 값을 넣을 때 L을 명시 하지 않아도 됨.
		
		
		// 실수 : float, double <== (기본) 
		// float : 4byte (32bit), 소수점 7자리까지 정밀도가 유지됨.      리터럴 뒤에 f, F
		float jj;
		jj = 3.1488888888888F;		// 리터럴 뒤에 F
		System.out.println(jj);
		
		
		// double : 8byte (64bit), 소수점 15자리까지 정밀도가 유지됨.     <==== 기본형
		double kk;
		kk = 3.148888888888888;
		System.out.println(kk);
		
		System.out.println("===============");
		
		//char : 1 문자를 넣을 수 있음. 영문, 한글, 일본어, 중국어, String : 문자열, ""
			/*
				-char 의 값(리터럴)을 넣을 때는 ' '
				- 1문자
				- 문자, 아스키 코드 값(10진수), 유니코드로 할당(16진수) 
				
				- 아스키 코드 : 7bit, 영어, 숫자, 특수문자 
				- 유니코드    : 2byte ~ 3byte,  한글, 일본어, 중국어, .....
				
			 */
		char ll;
		ll = 'A';
		char mm;
		mm = '가';
		System.out.println(ll);
		System.out.println(mm);
		System.out.println("=============");
		 
		// 문자로 값넣기 : a
		char nn = 'a' ;
		System.out.println(nn);
		
		// 10진수 아스키 코드 값으로 값넣기 : a
			// '' 넣으면 오류
		char oo = 97;
		System.out.println(oo);
		
		// 16진수 유니코드 값으로 값넣기 : a
		char pp = '\u0061';
		System.out.println(pp);
		
		System.out.println("========================");
		
		char firstName1 = '\uAE30' ;	// 이름 첫자	:기
		char firstName2 = '\uBC31' ;	// 중간 이름	:백
		char lastname = '\uAE40' ;		// 성		:김
		
		// 출력 내용 : 나의 이름은 김 기백 입니다.
		
		// println (); 출력
		System.out.println("나의 이름은 " + lastname + " " + firstName1 + firstName2 +" 입니다.");
		
		// printf (); 출력
		System.out.printf("나의 이름은 %c %c%c 입니다.", lastname, firstName1, firstName2);
		
		
	
	}	

}
