package ConditionStatmente;

public class NestedIFCondition {
	public static void main(String[] args) {
		
		int age=18;
		int weight =52;
		// nasted if used when 1st condition true then
		if(age>=18 ) {
			if(weight>50) {
				System.out.println("you can donate blood");
			} else {
				System.out.println("weight not above 50kg");
			}
			
		}else {
			System.out.println("age is below 18");
		}
	}

}
