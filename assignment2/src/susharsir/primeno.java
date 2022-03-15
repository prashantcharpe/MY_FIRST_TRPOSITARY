package susharsir;

public class primeno {
	
	
	public static void main(String[] args) {
		int sum=0;
		for(int i=100; i>=1; i--) {
			
			boolean flag= true;
			
			for(int j=2; j<i; j++) {
				
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			if (flag) {
				sum=sum+i;
				System.out.println("this is prime no " + i);
			}else {
				System.out.println(" this is not prime no = " + i);
			}System.out.println(sum);
			
		}
	}

}
