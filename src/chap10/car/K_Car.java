package chap10.car;

public class K_Car extends Car {
	
	@Override		// @ (어노테이션), @Override : 부모의 메소드를 오버라이딩 하겠다고 선언
	void run() {
		System.out.println("기아차는 띠띠빵빵 달립니다.");
	}

}
