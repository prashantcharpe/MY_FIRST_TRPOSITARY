package System;

import java.io.PrintStream;

import array.Multydimensionalarray;

public class SystemExample {

	
		//below out variable is written n system class
	    //access modifire - public
		//variable type- stataic
		//data type -non perimative and which class it is represwnting - PtrintStream
	 public static PrintStream out;
	 
	 //below out1 variable is written by use in our class
	 //access modifire - public
	 //variable- static
	 //data typr- nonpremetive and which class it is repesenting Multydimensionalarray
	 
	 public static Multydimensionalarray out1; //non-primetive datatype
	 
	 public static void main(String[] args) {
     
		 //SystemExampleobj-----reference/object declaration 
		 //new SystemExample();----Object initilization
		 //SystemExample obj=new SystemExample();  //declaration + initilization
		 
		 
	System.out.println(SystemExample.out1);
	SystemExample.out1=new Multydimensionalarray();
	System.out.println(SystemExample.out1);
	
	//System class method 
	//static String getProperty(String Key)
	//static String exist(String Key)
	//static String getProperty(String Key)
	//static String getProperty(String Key)
	//static String getProperty(String Key)
	
	System.out.println(System.getProperty("user.language"));
	System.exit(1); //use to stop exicutionwork
		
		//System.err.println(" i am error ");
	}
}
