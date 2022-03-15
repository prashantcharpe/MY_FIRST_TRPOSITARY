package naveen;

import java.util.Arrays;

public class LargestANDsmallestNumberINarray {

	public static void main(String[] args) {
		int numbers[]= {10,20,30,40,50,10,15,20,70};
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]>largest) {
				largest = numbers[i];
			}
			else {
				if(numbers[i]<smallest) {
					smallest=numbers[i];
				}
			}
		}
		System.out.println(" given array is = "+ Arrays.toString(numbers));
		System.out.println("largest numbers is = "+ largest);
		System.out.println("smallest numbers is = "+ smallest);
	}
}



