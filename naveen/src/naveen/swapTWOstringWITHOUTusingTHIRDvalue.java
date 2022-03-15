package naveen;

public class swapTWOstringWITHOUTusingTHIRDvalue {

	public static void main(String[] args) {
		String a = "prashant";
		String b = "charpe";
		
		System.out.println("before swapping");
		System.out.println(" a = " + a);
		System.out.println(" b = " +b);
		
		//1 append a and b
		System.out.println("**************************");
		a=a+b; //prashantcharpe
		
		//2 store initial string  a in string b
		b = a.substring(0, a.length()-b.length());
		
		//3 store initial string b in string a

		a = a.substring(b.length());
		
		System.out.println("after swapping");
		System.out.println(" a = " + a);
		System.out.println(" b = " +b);
		
		
		
		
	}
}
