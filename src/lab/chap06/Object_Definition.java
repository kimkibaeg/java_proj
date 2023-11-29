package lab.chap06;



class Animal {
	
	// 1. 필드
	String aName ;
	String aColor ;
	int aLeg ;			// 팔다리 갯수
	int aSpeed ;
	String aCry ;
	
	// 생성자 : 필드의 기본 값을 입력하는 생성자
	Animal (String aName, String aColor, int aLeg, int aSpeed, String aCry) {
		this.aName = aName ;
		this.aColor = aColor ;
		this.aLeg = aLeg ;
		this.aSpeed = aSpeed ;
		this.aCry = aCry ;
	}
	
	// 메소드 : 필드의 모든 값을 출력 하는 메소드
	void printAll() {
		System.out.println("동물 이름 : " + aName);
		System.out.println("동물 색깔 : " + aColor);
		System.out.println("동물 다리 : " + aLeg);
		System.out.println("동물 속도 : " + aSpeed);
		System.out.println("동물 소리 : " + aCry);
	}
	
	// 메소드 : int abc() { return aLeg + aSpeed ; }
	int abc() {
		int hap = aLeg + aSpeed ;
		return hap ;
	}
}





public class Object_Definition {
	public static void main(String[] args) {
		// 객체 생성 및 테스트
		
		Animal a1 = new Animal("호랑이", "검은색", 4, 100, "어흥") ;
		a1.printAll();
		
		Animal a2 = new Animal("독수리", "빨간색", 2, 300, "삐약") ;
		a1.printAll();
		
		Animal a3 = new Animal("사자", "주황색", 4, 100, "음메") ;
		a1.printAll();
		
		Animal a4 = new Animal("개", "흰색", 4, 30, "멍멍") ;
		a1.printAll();
		// 호랑이, 독수리, 사자, 개
		System.out.println(a4.abc());

	}
}
