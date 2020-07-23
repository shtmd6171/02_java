package account;


public class Account {

	String name;
	int balance;
	
	Account(){
	}
	
	Account(String name,int balance){
		this.name = name;
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public void withdraw(int amount) {
		if(balance > amount) {
		balance -= amount;
		}else {
			System.out.println("잔액 부족");
		}
	}
	
	public void transfer(Account account, int amount) {
		if(balance > amount) {
			balance -= amount;
			account.deposit(amount);
			}else {
				System.out.println("잔액 부족");
			}
	}

	public void print() {
		System.out.printf("계좌이름 : %s\n계좌잔액 : %d\n\n", name, balance);
	}
	

}






