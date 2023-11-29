package lab.chap06;

public class Product_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Product 객체 4개 생성
		
		Product p1 = new Product () ;
		Product p2 = new Product () ;
		Product p3 = new Product () ;
		Product p4 = new Product () ;
		
		// 2. Setter 를 사용해서 객체의 필드의 값을 주입
		
		p1.setIdx(1);
		p1.setProName("필통");
		p1.setQty(1);
		p1.setYear(2010);
		p1.setProColor("빨간색");
		
		p2.setIdx(2);
		p2.setProName("연필");
		p2.setQty(2);
		p2.setYear(2020);
		p2.setProColor("주황색");
		
		p3.setIdx(3);
		p3.setProName("볼펜");
		p3.setQty(3);
		p3.setYear(2030);
		p3.setProColor("노란색");
		
		p4.setIdx(4);
		p4.setProName("지우개");
		p4.setQty(4);
		p4.setYear(2040);
		p4.setProColor("검은색");
		
		// 3. 배열 arr [10], 방 크기는 10개 : 0 ~ 9, 각 방에 4의 객체를 배열 방에 넣음.
		
		Product[] arr = new Product[10] ;
		
		arr[0] = p1 ;
		arr[1] = p2 ;
		arr[2] = p3 ;
		arr[3] = p4 ;
		
		// 4. 배열의 값을 끄집어내서 Product 변수 P 에 담고 출력 : For
		
		for (int p = 0 ; p < arr.length ; p++) {
			Product pro = arr[p] ;
			System.out.println(pro);
		}
		
		
	}
}
