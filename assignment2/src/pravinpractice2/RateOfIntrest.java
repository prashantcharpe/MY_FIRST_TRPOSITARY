package pravinpractice2;

public class RateOfIntrest {
	
	public static void rateofintrest(int amount, double intrest, int month) {

		double totalintrest = amount*intrest*month;
		System.out.println("interest for the amount of " + amount + " rate of interest is " + intrest + " for "+ month+" month is " + totalintrest);
	}

	public static void main(String[] args) {
		rateofintrest(15000,0.12,2);
		rateofintrest(220000,0.12,2);
	}
}
