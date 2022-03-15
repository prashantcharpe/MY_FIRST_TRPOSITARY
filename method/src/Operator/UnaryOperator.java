package Operator;

public class UnaryOperator {

	public static void main(String[] args) {
		UnaryOperator C =new UnaryOperator();
		C.positive(-5);
		C.negative(-5);
		C.increment(5);
		C.decrement(10);
		int var1=10;
		var1=-10; // it will represent negative value
		var1=+10; // it will represent positive value
		
		System.out.println(++var1); // var1=var1+1 prefix
		System.out.println(var1++); // 
	}


	
	public void positive(int a) {
		System.out.println("i am operator to represent positive " +(-a));
	}
	public void negative(int b) {
		System.out.println("i am operator to represent negative " +(b));
	}
	public void increment(int c) {
		//c=c+1 , c++  it will increment by 1
		System.out.println("i am operator to represent increment " +(++c));
	}
	public void decrement(int d) {
		//c=c-1 , c--  it will increment by 1
		System.out.println("i am operator to represent decrement " +(--d));
	}	
}
