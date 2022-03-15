
package encapsulation;

public class practice {

	private int mobile;
	
	public int getmobilecost(int accountnumber) {
		
		if ( accountnumber == 10000){
			return this.mobile;
		}else {
			return 0;
		}
	}
		
		public void setmobilecost(int mobile) {
			this.mobile=mobile;
		}
}

class practice2{
	
	public static void main(String[] args) {
		
    practice obj=new practice();
		 
	int a=obj.getmobilecost(10000);
	System.out.println(a);
	
	obj.setmobilecost(5000);
	int b = obj.getmobilecost(10000);
	System.out.println(b);

	
	}
}