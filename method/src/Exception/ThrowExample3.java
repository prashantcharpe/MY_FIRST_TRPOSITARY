package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowExample3 {
	
	public static void main(String[] args) {
		
		//before java 7
		
		 FileReader obj;
		 try {
			 obj = new FileReader("");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch ( ArithmeticException e) {
			e.printStackTrace();
		} finally {
			obj=null;
		}
		 
		 //after java 7
		 //u can write block () after try 
		 // this four object automatic null we dont need finally keywarod after jav 7
		 // compiler release memory after execution if the obj is available in try block
		 try (FileReader obj1  = new FileReader("");
				 FileReader obj2  = new FileReader("");
				 FileReader obj3 = new FileReader("");
				 FileReader obj4  = new FileReader("");){
		//FileReader obj = new FileReader("");
		// u can write multiple exception in one catch block after java7
			} catch ( ArithmeticException | FileNotFoundException  e) {
				e.printStackTrace();
			}
		    catch ( IOException e) {
				e.printStackTrace();
			}
		 System.out.println("555");
		 
		 
	}

}
