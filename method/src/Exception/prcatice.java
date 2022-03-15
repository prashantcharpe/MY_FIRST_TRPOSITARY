package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class prcatice {

	
	public static void main(String[] args)  {
	
		prcatice obj = new prcatice();
		try {
			obj.m1();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	public void m1() throws FileNotFoundException {
		m2();
		try {
		FileReader test =new FileReader("");
	}catch( FileNotFoundException p) {	
	}
		System.out.println(" exception is handle");
		}
	
	public void m2() throws FileNotFoundException {
		FileReader obj2 = new FileReader ("");
	}
}
