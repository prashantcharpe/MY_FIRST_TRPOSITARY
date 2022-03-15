package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class DoubleTryCatch {

	public static void main(String[] args) {
		
		try {
			
		try {
			FileReader obj = new FileReader("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("handle FileNotFoundException ");
		}
		System.out.println(10/0);
		}
		catch(ArithmeticException y){
			System.out.println("handle ArithmeticException ");
		}
		
		
		
	}
}
