package lab.chap04;

import java.util.Scanner;

public class If_Statement2 {
	public static void main(String[] args) {
		/*
		 
		  	if ~ else if, ==
		 	스캐너로 정수 값을 입력 받으세요. 자신의 가진 자산을 입력 받습니다.
		 	
		 	0 ~ 1000 만원 : "버스나 지하철을 타고 다닙니다."
		 	1000만원 ~ 10000 : "택시를 타고 다닙니다."
		 	10000 ~         : "비행기를 타고 다닙니다."
		 */
		
		Scanner sc = new Scanner(System.in);
		int abc ;
		
		System.out.println("가진 자산을 입력해주세요.");
		abc = sc.nextInt();
		
		if (abc >= 0 && abc <= 1000) {
			System.out.println("버스나 지하철을 타고 다닙니다.");
		} else if (abc >= 1000 && abc < 10000){
			System.out.println("택시를 타고 다닙니다.");
		} else if (abc >= 1000) {
			System.out.println("비행기를 타고 다닙니다.");
		} else {
			System.out.println("잘못 된 값을 입력했습니다. 양수를 입력 하세요.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
