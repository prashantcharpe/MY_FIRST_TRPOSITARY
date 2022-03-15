package array;

public class JAGGEDarray {
	
	//int a[][]  = {{10,20,30,40},{50,60},{70,80,90}};
	  int [][]a; // declaration
	  
	public static void main(String[] args) {
		
	JAGGEDarray Z = new JAGGEDarray();
	Z.a=new int[3][4];  //  declration + creation
		//row size is fix 3 but column not 
		
		
		// Z.a[0]= new int [4]; //Z.[0] IS ROW index AND new int [4] is column size
		// Z.a[1]=new int[3];
		   //Z.[1] IS ROW index  AND new int [3] is column size
		
		
		
		Z.a[0][0]=10;    
		Z.a[0][1]=20;   
		Z.a[0][2]=30;    
		Z.a[0][3]=40;  
		
		Z.a[1][0]=50;   
		Z.a[1][1]=50;
		Z.a[1][2]=50;
		

		Z.a[2][0]=50;   
		Z.a[2][1]=50;
		Z.a[2][2]=50;
	
		
		
		for(int i=0; i<Z.a.length; i++) {
			for(int j=0; j<Z.a[i].length; j++) {
				System.out.print(Z.a[i][j] + " ");
			}System.out.println();
		}
	}
}
 