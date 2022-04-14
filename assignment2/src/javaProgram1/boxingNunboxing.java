package javaProgram1;

public class boxingNunboxing {
	
	public static void main(String[] args) {
		
		//boxing
		int i = 50; 
		Integer obj = new Integer(50);   //implicict
		Integer obj1 = new Integer(i);
		System.out.println(obj + obj1);
		
		//unboxing 
		Double obj2 = new Double(200.00); //implicict
		double a = obj2.doubleValue();
		System.out.println(a);

System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
 



Integer obj3 = i;  //implicit

Short obj4 = obj.shortValue();  //explicit
System.out.println(obj4);

Long obj5 = Long.valueOf(obj4);  //explicit
System.out.println(obj5);
		
	}

}
