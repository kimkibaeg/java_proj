package chap10.car;

import java.util.ArrayList;
import java.util.List;

public class Car_Test {

	public static void main(String[] args) {
		
		// 자식객체를 생성하면서 부모 타입으로 지정 후 부모의 메소드 호출 시 Overriding 된 자식의 메소드가 작동 됨.
		// car.run() - 다형성
		// <실습>
		
		Car c1 = new H_Car ();
		Car c2 = new K_Car ();
		Car c3 = new S_Car ();
		
		// 부모의 run()을 호출 시 자식의 Overriding 된 메소드 작동됨.
		c1.run();
		c2.run();
		c3.run();
		
		// ArrayList<Car>
		// 선언
		List<Car> aList = new ArrayList<>() ;
		
		aList.add(c1) ;
		aList.add(c2) ;
		aList.add(c3) ;
		
		System.out.println("========================================");
		// for 문을 사용해서 끄집어 내서 출력
		for (int i = 0 ; i < aList.size() ; i++) {
			
			aList.get(i).run();
			
		}
		
		
		
		
		
	}
}
