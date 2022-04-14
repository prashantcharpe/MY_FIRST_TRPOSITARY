package array;

public class employee {
	
  String ename;
  int empid ;
  double salary;
  static final String company = "LNT";
  double  pf, pt, medicalallowance,basicsalary,netsalary,grosssalary,otherAllowance;

  
  public employee(String name, int id, double sal ) {
	ename = name;
	empid = id;
	salary=sal;
	
	System.out.println(" name = " + ename);
	  System.out.println(" id = " +empid);
	  System.out.println("sal = " + salary);
	  System.out.println(" company name = " + company);
}
 	
  
  
  public double calculateGrossSalary() {
		grosssalary = calculateGrossSalary() ;
		return calculateGrossSalary();
  }
  
      public static void main(String[] args) {
	  employee v=new employee("pankaj", 100, 10000.500);
	  employee v1=new employee("suresh", 101, 11000.500);
	  employee v2=new employee("raju", 103, 1000.500);
	  employee v3=new employee("anand", 104, 14000.500);	  
}
}
