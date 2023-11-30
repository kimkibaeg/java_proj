package lab.chap17.ACCOUNT;

import java.util.Scanner;

public class Account_Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
//		List<Account> aList = new ArrayList<>() ;
		Account a = new Account() ;
		int select ;
		
		
	out:	do {
			System.out.println("==============================================");
			System.out.println("0. 계좌이름과 계좌 번호 등록");
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 종료");
			System.out.println("==============================================");
			System.out.println("위 내용의 정수를 입력 하세요");
			select = sc.nextInt() ;
			
			switch (select) {
			case 0 : 
				// 계좌이름과 계좌 번호 등록
				System.out.println("이름을 계계좌번호를 입력하세요 : ");
				a.name = sc.next() ;
				//String name = sc.nextLine() ;
				//System.out.println("계계좌번호를 입력하세요 : ");
				a.account = sc.nextInt() ;
				System.out.println(a);				
				System.out.println(a.getName() + a.getAccount() + a.money);
				break;
			
			case 1 :
				// 입금
				System.out.println("입금할 금액을 입력하세요:");
                a.deposit(sc.nextInt());
               // a.deposit(depositAmount);
                break;
				
				
			case 2 :
				// 출금
				System.out.println("출금할 금액을 입력하세요:");
                a.withdraw(sc.nextInt());
              //  a.withdraw(withdrawAmount);
                break;
				
				
			case 3 :
				
			break out ;
			
			
			}
			
		}while (true) ;
	
		System.out.println("프로그램 종료");
	}
}
