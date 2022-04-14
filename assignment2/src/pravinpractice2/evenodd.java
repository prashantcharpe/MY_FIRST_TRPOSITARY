package pravinpractice2;

public class evenodd {

	public static void evenodd(int a) {
		 
		if(a%2==0) {
			System.out.println("this is even no : " + a);
		}else {
			System.out.println("this is odd no : " + a);
		}
	}
	
	public static void main(String[] args) {
		evenodd(10);
		evenodd(11);
	}
}
