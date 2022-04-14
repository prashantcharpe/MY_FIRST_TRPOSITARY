package susharsir;

import java.util.Arrays;

public class stringtobytesArray {

	
	public static void main(String[] args) {
		
		//string to bytes
		String s =" my name is prashant";
		byte [] w=s.getBytes();
		System.out.println(Arrays.toString(w));
		
		//byes to String 
		byte [] bt = {'t','e','s','t','i','n','g'};
		String str = new String (bt);
		System.out.println(str);
	}
	
}
