package lab.chap04;

import java.util.Scanner;

public class If_Statement {
	public static void main(String[] args) {
		
		/*
		 
		 	// if ~ else if,    equals("월요일")
		 	 
		 	콘솔에서 "월요일" 입력되었을 때 출력 "월요일은 자바를 공부합니다."
		 	콘솔에서 "화요일" 입력되었을 때 출력 "화요일은 데이터베이스를 공부합니다."
		 	콘솔에서 "수요일" 입력되었을 때 출력 "수요일은 html javascript를 공부합니다."
		 	콘솔에서 "목요일" 입력되었을 때 출력 "목요일은 JSP를 공부합니다."
		 	콘솔에서 "금요일" 입력되었을 때 출력 "금요일은 Spring를 공부합니다."
		 	콘솔에서 "토요일" 입력되었을 때 출력 "토요일은 운동을 합니다."
		 	콘솔에서 "일요일" 입력되었을 때 출력 "일요일은 티비를 봅니다."
		 	
		 	// 변수명 한꺼번에 바꾸기 : Alt + Shift + R
		 */
		
		/*
		Scanner sc = new Scanner(System.in) ;      내가 해본거
		
		String str1 = "월요일" ;
		String str2 = "화요일" ;
		String str3 = "수요일" ;
		String str4 = "목요일" ;
		String str5 = "금요일" ;
		String str6 = "토요일" ;
		String str7 = "일요일" ;
		
		str1 = sc.next();
		str2 = sc.next();
		str3 = sc.next();
		str4 = sc.next();
		str5 = sc.next();
		str6 = sc.next();
		str7 = sc.next();
		
		
		if ( str1.equals(str1)) {
			System.out.println("A 학점입니다. ");
		}else if (str2.equals(str2)) {
			System.out.println("B 학점입니다. ");
		}else if (str3.equals(str3)) {
			System.out.println("C 학점입니다. ");
		}else if (str4.equals(str4)) {
			System.out.println("D 학점입니다. ");
		}else {
			System.out.println("F 학점입니다.");
		}
		*/
		
		// 강사님이 해주시는 것
		// 1. Scanner Import
		Scanner sc = new Scanner(System.in) ;
		
		String str1 ;
		
		// 2. 콘솔에서 입력 받아서 변수에 할당
		System.out.println("요일을 한글로 입력하세요. 예) 월요일 >>>>>>");
		str1 = sc.next();
		
		// 3. if ~ else if 문을 사용해서 처리
		
		if (str1.equals("월요일")) {    // 월요일
			System.out.println(str1 + "은 자바를 공부 합니다.");
			System.out.println("월요일 출력 입니다.");
			
		} else if (str1.equals("화요일")) {
			System.out.println(str1 + "은 데이터베이스를 공부 합니다.");
			System.out.println("월요일 출력 입니다.");
			
		} else if (str1.equals("수요일")) {
			System.out.println(str1 + "은 html javascript를 공부합니다.");
			System.out.println("월요일 출력 입니다.");
			
		}else if (str1.equals("목요일")) {
			System.out.println(str1 + "은 JSP를 공부합니다.");
			System.out.println("월요일 출력 입니다.");
			
		}else if (str1.equals("금요일")) {
			System.out.println(str1 + "은 Spring를 공부합니다.");
			System.out.println("월요일 출력 입니다.");
			
		}else if (str1.equals("토요일")) {
			System.out.println(str1 + "은 운동을 합니다.");
			System.out.println("월요일 출력 입니다.");
			
		}else if (str1.equals("일요일")) {
			System.out.println(str1 + "은 티비를 봅니다.");
			System.out.println("월요일 출력 입니다.");
			
		} else {
			System.out.println("잘 못 입력 했습니다. 요일을 입력하세요.");
		}
		
		
		
		
		

	}

}
