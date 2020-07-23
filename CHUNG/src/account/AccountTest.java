package account;

import java.util.*;

public class AccountTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Scanner nm = new Scanner(System.in);
		System.out.print("계좌를 생성합니다 계좌 명을 입력해주세요\n[input] :  ");
		String name = nm.nextLine();
		Account account = new Account(name,0);
		Account account2 = new Account("엄준식",5500);
		Account account3 = new Account("홍길동",10000);
		Account[] accountlist = {account,account2,account3};
		Accounts accounts = new Accounts(accountlist);
				
		int val = 0;
		boolean jud = true;
		
		accounts.print();
		
		
		while (jud) {
			System.out.print("1.예금 | 2. 출금 | 3.잔고  | 4.이체 | 5.종료\n");
			System.out.print("[input] : ");
			val = sc.nextInt();
			switch (val) {
			case 1: {
				System.out.print("입금 금액을 입력하세요 : ");
				int amount = sc.nextInt();
				account.deposit(amount);
				break;
			}
			case 2: {
				System.out.print("출금 금액을 입력하세요 : ");
				int amount = sc.nextInt();
				account.withdraw(amount);
				break;
			}
			case 3: {
				account.print();
				break;
			}
			case 4: {
				for(Account i : accountlist) {
					System.out.println("전체 사용자 이름 : "+i.name);
				}
				System.out.print("입금할 사용자의 이름을 입력 : ");
				String usrname = nm.nextLine();
				System.out.print("\n입금 금액을 입력하세요 : ");
				int amount = sc.nextInt();
				account.transfer(accountlist[accounts.FindAccountName(usrname)], amount);
				break;
			}
			case 5: {
				jud = false;
				break;
			}	
			case 6: {
				System.out.print("입금할 사용자의 이름을 입력 : ");
				String usrname = nm.nextLine();
				System.out.println(usrname);
				System.out.println(accounts.FindAccountName(usrname));
				break;
			}
			default : {
				System.out.println("뭐함? 수준~");
				break;
			}

			}
		}
	}

}
