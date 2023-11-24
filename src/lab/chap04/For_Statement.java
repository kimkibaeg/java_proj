package lab.chap04;

public class For_Statement {
	public static void main(String[] args) {
		

	/* 구구단 중에 7단만 출력
	 	7 * 1 = 7
	 	7 * 2 = 14
	 	7 * 3 = 21
	 	7 * 4 = 28
	 	7 * 5 = 35
	 	7 * 6 = 42
	 	7 * 7 = 49
	 	7 * 8 = 56
	 	7 * 9 = 63
	 */
	
		/* 내가 한 것
		for(int i=1 ; i<=9 ; i++) {
			System.out.println("7 * "+i+" = "+7*i);
		}
		*/
		
		// 강사님이 해주시는 것
		
		for (int i = 1 ; i < 10 ; i++) {
			System.out.println(" 7 * " + i + " = " + (i * 7));
		}
		
		System.out.println("====================");
		for (int i = 1, j = 7 ; i < 10; i++) {
			System.out.println(j + " * " + i + " = " + (i * j));
		}
		
		System.out.println("=== 탭으로 구분해서 한 라인으로 출력 ===");
		
		// 7단을 탭으로 구분해서 출력
		for (int i = 1 , j = 7 ; i < 10 ; i++) {
			System.out.printf("%d * %d = %d \t", j, i, i * j);
		}
		System.out.println();
		
		for (int i = 1 , j = 8 ; i < 10 ; i++) {
			System.out.printf("%d * %d = %d \t", j, i, i * j);
		}
		
		
		
		
		
		
		
		
	}
}
