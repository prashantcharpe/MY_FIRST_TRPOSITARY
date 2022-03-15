package ConditionStatmente;

public class SwitchCondition {
	public static void main(String[] args) {
		
		// used when u have more than 10 condition
		// this is use for reduce the code
		//break keyword used for the stop condition to go to the next condition
		// boolean not support for switch case and u cant use
		// always value constant or literal in switch case
		  int month = 13;
		  
		  switch (month) {
		  
		  case 1 : System.out.println(" january "); break;
		  case 2 : System.out.println(" feb "); break;
		  case 3 : System.out.println(" march "); break;
		  case 4 : System.out.println(" april"); break;
		  case 5 : System.out.println(" may "); break;
		  case 6 : System.out.println(" june"); break;
		  case 7 : System.out.println(" july "); break;
		  case 8 : System.out.println(" augast"); break;
		  case 9 : System.out.println(" sep "); break;
		  case 10 : System.out.println(" oct"); break;
		  case 11: System.out.println(" nov "); break;
		  case 12: System.out.println(" dec"); break;
		  default : System.out.println(" this month is not valid"); 
		  }

	}

}
