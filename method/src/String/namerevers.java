package String;

public class namerevers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String A="Dnyaneshwar Mauli Dnyanraj Mauli Tukaram";
			String dnyanu[]=A.split(" ");
			
		//System.out.println(A.split(" ")[0]);
				
			for(int i=dnyanu.length-1;i>=0;i--) {
				System.out.print(dnyanu[i]+" ");
			}

	}

}
