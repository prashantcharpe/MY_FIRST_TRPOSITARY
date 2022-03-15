package Map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
public static void main(String[] args) throws FileNotFoundException, IOException {
	
	
	Properties prop =new Properties();
	//for load file or read file use FileInputStream
	prop.load(new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\method\\src\\Map\\test.properties"));
	//get fileinput by get.property
	System.out.println(prop.getProperty("test"));
	
	//for get file or changedata file use FileOutputStream
	FileOutputStream test = new FileOutputStream("C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\method\\\\src\\\\Map\\\\test.properties");
	
	//change data from file use getProperty
	prop.setProperty("test", "charpe");
	System.out.println(prop.getProperty("test"));
	
}
}
