package lab.chap04;

public class While_Statement {
	public static void main(String[] args) {
		/*
		 	1000 부터 1 까지 5씩 감소하면서 출력 : for 문, while 문으로 출력
		 */
		
		
		
		
		// for

		for (int i = 1000 ; i > 0 ; i -= 5) {
			System.out.println("i : " + i);
		}
		
		
		
		
		// while
		System.out.println("=== while ===");
		
		int i = 1000 ;
		
		while (i > 0) {
			
			System.out.println("1000 부터 1 까지 감소하면서 출력 : " + i);
			
			if (i == 0) break;
			i -= 5 ;
		}
		

		
		
		
	}
}
