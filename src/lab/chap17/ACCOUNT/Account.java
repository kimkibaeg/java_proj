package lab.chap17.ACCOUNT;

public class Account {
	
	String name ;		// 이름
	int account ;		// 계좌 번호
	int money = 10000 ;			// 자신 돈
	
	void deposit (int money) {		// 입금 <== 00원 입금되었습니다. 계좌의 총금액 00원 입니다.
		this.money += money ;
		System.out.println(money + "원 입금되었습니다. 계좌의 총 금액은 " + this.money + "원 입니다.");
	}
	
	void withdraw (int money) {		// 출금 <== 00 출금 했습니다. 잔고는 00 입니다.
		if (this.money >= money) {
			this.money -= money ;
			System.out.println(money + "원 출금 했습니다. 남은 잔고는 " + this.money + "원 입니다.");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", account=" + account + ", money=" + money + "]";
	}

	
	
}
