package Operator;

public class logicaloperator {
	
	
	public static void main(String[] args) {
		//Andoperator
		// if two condition is true the op is true
		System.out.println("and operator test " + (5<6 && 6>3));
		//if 1st condition is false or not match then op is false
		System.out.println("and operator test " + (7<6 && 6>3));
		//if 2nd condition is false or not match then op is false
		System.out.println("and operator test " + (5<6 && 6>7));
		//if two condition is false then op is false
		System.out.println("and operator test " + (7<6 && 6>7));
		
		//Oroperator
		// if two condition is true the op is true
		System.out.println("Or operator test " + (5<6 || 6>3));
		//if one condition is false or other true  not match then op is true
		System.out.println("Or operator test " + (7<6 || 6>3));
		//if 2nd condition is true or not match then op is true
		System.out.println("Or operator test " + (5<6 || 6>7));
		//if two condition is false then op is false
		System.out.println("Or operator test " + (7<6 || 6>7));
		
	}

	public void andoperator() {
	System.out.println();
	}
}
