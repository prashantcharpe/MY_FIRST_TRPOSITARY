package PrimitiveCasting;

class PrimitiveCasting {

	// two type of casting
	// 1st primitive casting
	// 2nd non-primitive casting

	// 1st primitive casting
	
     //in Java, type casting is a method or process that converts a data type into another data type in both ways 
	// manually and automatically. The automatic conversion is done by the compiler and
	// manual conversion performed by the programmer. 
	
	//Convert a value from one data type to another data type is known as type casting
	//There are two types of type casting
	
	// Widening Type Casting
	// Narrowing Type Casting
	 
	// Widening Type Casting -->Converting a lower data type into a higher one is called widening type casting. . It is also known as implicit conversion or casting down
	//byte -> short -> char -> int -> long -> float -> double 
	int a = 10; 	//automatically converts the integer type into long  
	long b = a;     //automatically converts the long type into float type 
	
	//Narrowing Type Casting-->Converting a higher data type into a lower one is called narrowing type casting. It is also known as explicit conversion or casting up
	//double -> float -> long -> int -> char -> short -> byte 
	int c=10;
	short d = (short) c; // manually converts the integer type into short 

	public static void main(String[] args) {
		
		PrimitiveCasting s1 = new PrimitiveCasting();
		System.out.println(s1.b);
		System.out.println(s1.d);
	}

}
