package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class throwsexample {

	// throws keyword used in only check / compile time exception 
	//not for runtime/uncheck exception
	//throws keyword use for only the throw and handvoer this exception to the coller method or chidle clas, main method
	// or  who call this method. that method will handle this method exception by using try catch.
	
	public void readfile() throws FileNotFoundException {
		
		FileInputStream r = new FileInputStream("d./abc.txt");	
	}
	
  public void savefile() throws FileNotFoundException {
		
	    String text="this is demo";
		FileOutputStream r = new FileOutputStream("E:/xyz.txt");	
	}
}


class throwsexampe2{
	
	public static void main(String[] args) {
		
		throwsexample r2 = new throwsexample();
		try {
			r2.readfile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}System.out.println(" i handel this exception");
		
		try {
			r2.savefile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}System.out.println(" i save this file");
		
		
		
	}

}