package account;

public class Accounts {
	
	Account[] accounts;
	
	Accounts(){}
	
	Accounts(Account[] accounts){
		this.accounts = accounts;
	}
	
	public void print() {
		for(Account account : accounts) {
		System.out.println(account.name);
		}
	}
	
	public int FindAccountName(String usrname) {	
		for(int idx=0; idx<accounts.length; idx++) {
			System.out.println(accounts[idx].name);
			if(!accounts[idx].name.equals("usrname") ) {
				return idx;
			} 
			else {
				break;
			}
		}
		return 0;
	}
		
	

}
