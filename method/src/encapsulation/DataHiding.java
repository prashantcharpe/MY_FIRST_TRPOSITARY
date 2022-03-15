package encapsulation;

public class DataHiding {
	
	//you are not allowing ur data member to be access directly outside the class
	private int balance = 1000;
	private int deposite;
	private int LoanEligibility;
	
	
	//to access private data member we will have public method
	public int getbalance(int accountnumber) {
		
		if (accountnumber == 123) {
		return this.balance;
	} else {
		return 0;
	}
}
	
	public int deposite() {
		return this.balance;
	}
	
	public int getLoanEligibility() {
		return LoanEligibility; //if u dont add this then compailer will add
	}
	
	public void setbalance(int balance) {
		this.balance=balance;
	}
	public void setdeposite(int deposite) {
		this.deposite=deposite;
	}
}

