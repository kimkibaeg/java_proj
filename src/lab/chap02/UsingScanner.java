package lab.chap02;

import java.util.Scanner;

public class UsingScanner {

	public static void main(String[] args) {
		// 스캐너로 각 변수의 값을 인풋 받아서
		String stu ;   // 학생
		String stu2 ;  // 학생 2
		String stu3 ;  // 학생 3
		
		int kor ;   // 국어 점수
		int eng ;   // 영어 점수
		int math ;  // 수학 점수
		
		int hap ;   // 점수의 합계
		double avg ; // 평균
		
		Scanner sc = new Scanner(System.in);  // 스캐너 콘솔로 부터 인풋을 받기 위한 명령어. sc를 사용한다
		
		System.out.println("===== 첫 번 째 학 생 =====");
		System.out.println("학생의 [이름과 국어점수 영어점수 수학점수]를 입력하세요 >>>>>");
		stu = sc.next(); // 스트링 인풋이기 때문에 Int가 붙지 않는다, 콘솔에서 인풋을 대기한다.
		kor = sc.nextInt() ; // 인트 인풋이기 때문에 nextInt라는 명령어를 쓴다.
		eng = sc.nextInt() ;
		math = sc.nextInt() ;
		
		hap = kor + eng + math ;
		avg = hap / 3.0 ;
		
		// 코드 부분
		System.out.println(stu + "의 모든 점수의 합계는 " + hap + "점이고 평균은 " + avg +" 입니다");
		System.out.println("========================");
		
		System.out.println("===== 두 번 째 학 생 =====");
		System.out.println("학생2의 이름과 국어점수 영어점수 수학점수를 입력하세요 >>>>> ");
		stu2 = sc.next();
		kor = sc.nextInt() ;
		eng = sc.nextInt() ;
		math = sc.nextInt() ;
		
		hap = kor + eng + math ;
		avg = hap / 3 ;
		System.out.println(stu2 + "의 모든 점수의 합계는 " + hap + "점이고 평균은 " + avg + " 입니다.");
		System.out.println("=========================");
		
		System.out.println("===== 세 번 째 학 생 =====");
		System.out.println("학생3의 이름과 국어점수 영어점수 수학점수를 입력하세요 >>>>> ");
		stu3 = sc.next();
		kor = sc.nextInt() ;
		eng = sc.nextInt() ;
		math = sc.nextInt() ;
		
		hap = kor + eng + math ;
		avg = hap / 3 ;
		System.out.println(stu3 + "의 모든 점수의 합계는 " + hap + "점이고 평균은 " + avg + " 입니다.");
		System.out.println("=========================");
		
		
		

	}

}
