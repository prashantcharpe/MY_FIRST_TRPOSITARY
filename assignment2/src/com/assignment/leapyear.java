package com.assignment;

public class leapyear {
	public static void main(String[] args) {
		
		// 1st condi if leap year divided by 400 is called as leap year
		// 2nd condi if leap year divided by 4 but not divided by 100
		
		int  year = 2024;
		if(year%4==0) {
			
			if (year%100==0) {
				
				if (year%400==0) {
					
					System.out.println(" this is leap year " + year);
				}else 
				{
					System.out.println(" this is not leap year " + year);
				}
			}else 
			{
				System.out.println(" this is leap year " + year);
			}
		}else 
		{
			System.out.println(" this is not leap year " + year);
		}
		
		
		
		/* if ((year%4==0) || (year%100==0 && year%400==0) ) {
		System.out.println(" this is leapyear");
	}else {
		System.out.println(" this is not leapyear");
	}*/

}
}
