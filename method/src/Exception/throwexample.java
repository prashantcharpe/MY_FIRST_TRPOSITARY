package Exception;

public class throwexample {

	public static void main(String[] args) {
		// in this method , method create object and assign to jvm then jvn assign 
		// to defualt exception handler then handler print the exception
		int a=100, b=0, c;
		c=a/b;
		System.out.println(c);
	}
}

class test{
	public static void main(String[] args) {
		//in this method, programmer create excep tion by manually and assign to jvm then jvn assign
		// to defualt exception handler then handler print the exception
		//throw keyword use for custome exception and user defined exception or uncheck exception
		throw new ArithmeticException();
	}
}
