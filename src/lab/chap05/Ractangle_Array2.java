package lab.chap05;

import java.util.Arrays;

public class Ractangle_Array2 {
	public static void main(String[] args) {
		/*
		 	arr : 배열 변수명, 2차원 배열, [5] [10] , 행은 5행, 10열
		 		arr [0] : 짝수만 저장
		 		arr [1] : 홀수만 저장, 3의 배수는 빼고 저장.
		 		arr [2] : 4, 5 의 배수를 저장
		 		arr [3] : 10의 배수 저장
		 		arr [4] : 8단을 입력값 입력
		 		
		 		// For 문으로 출력
		 		// Enhanced For 문
		 		// Arrays.toString () 으로 출력
		 */
		
		int[][] arr = new int[5][10] ;
		
		System.out.println(arr.length);     // 행의 갯수 : 5
		System.out.println(arr[0].length);	// 열의 갯수 : 10
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		System.out.println(arr[3].length);
		System.out.println(arr[4].length);
		
		for (int i = 0 ; i < arr.length ; i++) {		// i : 행의 index (방번호) 
			
			if ( i == 0) {		// 짝수만 저장 
				int a = 2;   // 방의 값을 저장하는 변수 
				for ( int j = 0 ; j < arr[i].length; j++) {
					arr[i][j] = a; 
					a +=2; 
				}
				
			}else if ( i == 1) {	// 홀수만 저장, 3의 배수는 빼고 저장.
				int a = 1;
				for ( int j = 0; j < arr[i].length; a ++) {
					
					if (a % 2 != 0) {		// 홀수 일때
						if (a % 3 != 0) {	// 3의 배수가 아닐 때
							// 홀수이면서 3의 배수가 아닐 때 실행 블락
							arr[i][j] = a;
							j++;
						}
					}
				}
				// 누나가 알려준거
		/*		for (int j = 0, a = 1; j < arr[i].length; a+=2) {
					if (a % 3 == 0) {
						continue;
					}
					arr[i][j] = a;
					j++;
				}    */
				
			}else if ( i == 2) {    // 4, 5 의 배수를 저장
				int a = 1;    // 값을 저장하는 변수
				for (int j = 0; j <arr[i].length ; a++) {
					if (a % 4 == 0 || a % 5 == 0) {
						// 4의 배수 이거나 5의 배수이면 실행
						arr[i][j] = a ;
						j++;
					}
				}
				
				/*
				for (int j = 0, a = 1; j < arr[i].length; a++) {
					if (a  % 4 == 0 || a % 5 == 0) {
						arr[i][j] = a;
						j++;
					}
				}
				*/
				
			}else if ( i == 3) {   // 10의 배수 저장
				int a = 1 ;
				for (int j = 0; j < arr[i].length; a++) {
					if (a % 10 == 0) {
						arr[i][j] = a ;
						j++;
					}
				}
				
				
				/*
				for (int j = 0, a = 10; j < arr[i].length; j++) {
					arr[i][j] = a;
					a+=10;
				}
				*/
				
			}else if ( i == 4) {  // 8단을 입력값 입력
				int a = 8;
				for (int j = 0 ; j < arr[i].length; j++) {
					arr[i][j] = a;
					a+=8;
				}
				
				
				
				/*
				for (int j = 0, a = 4; j < arr[i].length; j++) {
					arr[i][j] = a * 8;
					a++;
				}
			*/
				
			}
		}
		
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		System.out.println(Arrays.toString(arr[3]));
		System.out.println(Arrays.toString(arr[4]));
		
		System.out.println("==== Enhanced For 문으로 출력 1 ====");
		for (int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}
		
		System.out.println("==== Enhanced For 문으로 출력 2 ====");
		for(int[] a : arr) {
			for (int b : a) {
				System.out.println(b);
				System.out.println("\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}
}
