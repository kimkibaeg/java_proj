package chap04.ex03;

public class For_Statement3 {
	public static void main(String[] args) {
		
		// 무한루프에서 break; 를 사용해서 무한 루프 빠져 나오기
			// 반복문에서 특정 시점에 break;	if 문 내에 break; 를 사용함.   <== for, while, do while
		
		// for 문에서 break;
		
		for (int i = 1 ; i > 0 ; i ++) {		// i = i + 10	<==>	i += 10
			System.out.println(i);
			if (i == 10000) {
				break;
			}
		}
		
		System.out.println("====================");
		
		for (int i = 0 ; i >= 0 ; i += 10) {		// i = i + 10	<==>	i += 10
			System.out.println(i);
			if (i == 10000) 
				break;
				System.out.println("오늘");
			}
		}
		
		
		
		
	}
