package javaProgram1;

import java.util.concurrent.TimeoutException;

public class throwNthrows extends Exception {
	
	public static void main(String[] args) throws TimeoutException {
		throwNthrows name = new throwNthrows();
		name.test1();
		
	}

	
	public void  test1() throws TimeoutException  {
		
		throw new TimeoutException(" this is my exceptin");
	
	}
}
