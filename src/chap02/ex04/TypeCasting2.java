package chap02.ex04;

public class TypeCasting2 {

	public static void main(String[] args) {
		//
		
		int kor = 77;  // 국어 점수
		int eng = 88;  // 영어 점수
		int math = 98; // 수학 점수
		
		// 합계 : kor + eng + math
		
		System.out.println("합계 : " + kor + eng + math);    // 전체 연결
		
		// 평균 : (kor + eng + math) / 3
		System.out.println("캐스팅 하지 않는 평균 : " + (kor + eng + math) / 3 );
		System.out.println("평균 : " + ((double)(kor + eng + math)) / 3);
		
		System.out.println("==============================");
		
		int hab = kor + eng + math ;
		
		double avg = ((double)hab )/3 ;     // hap : int ==> double 업캐스팅 후에 3으로 나눔
		
		double avg1 = hab / 3 ;  // 87.0					정수 / 정수 => 정수 => 더블
		double avg2 = hab / 3.0 ;  // 87.6666666666667		정수(더블)/더블 => 더블 => 더블
		
		
		
		System.out.println("캐스팅하지 않는 평균 : " + hab);
		System.out.println("평균 : " + avg);
		
		System.out.println("==================================");
		System.out.println("avg1 : " + avg1 );
		System.out.println("avg2 : " + avg2 );
		
		
	}

}
