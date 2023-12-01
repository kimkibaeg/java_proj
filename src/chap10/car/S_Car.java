package chap10.car;

public class S_Car extends Car {
	
	@Override		// @ (어노테이션), @Override : 부모의 메소드를 오버라이딩 하겠다고 선언
	void run() {
		System.out.println("쌍용차는 붕 달립니다.");
	}

}
