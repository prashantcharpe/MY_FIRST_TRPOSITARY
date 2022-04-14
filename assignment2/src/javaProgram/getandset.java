package javaProgram;

public class getandset {

	private static int balance = 10000;
	private int account;

	public int getbalance(int account) {
		if (account == 123) {
			System.out.println(" current balance + " + this.balance);
			return this.balance;
		} else {
			return 0;
		}
	}

	public void setbalance(int balance) {
		this.balance = this.balance + balance;
		System.out.println(" updated balance is : " + this.balance);
		System.out.println(" u withdrwal amount is = " + (-balance));
	}
}

class sbibank extends getandset {
	
	{
		System.out.println(" i am non static");
	}

	static {
		System.out.println(" i am static");
	}

	public static void main(String[] args) {
		sbibank obj = new sbibank();
		obj.getbalance(123);
		obj.setbalance(-2000);
	}

	
}