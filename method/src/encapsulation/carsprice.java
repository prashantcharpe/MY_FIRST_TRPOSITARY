package encapsulation;

public class carsprice {

	public static void main(String[] args) {

		carshowroom c = new carshowroom();

		int a = c.getxuv300cost(300);
		System.out.println(" current market price of xuv300cost = " + a);

		c.setxuv300cost(1500000);

		int b = c.getxuv300cost(300);
		System.out.println(" updated market price of xuv300cost = " + b);
	}

}
