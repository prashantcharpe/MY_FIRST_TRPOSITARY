package encapsulation;

public class hidingdata {
	
	public static void main(String[] args) {
		
		DataHiding c= new DataHiding();
		int a =c.getbalance(123);
		System.out.println(a);
		
		c.setbalance(2000);
	    int b =c.getbalance(123);
	    System.out.println(b);
	}

}
