package array;

public class threedimetionalarray {

	//int a[][][]; //declaration
	
	public static void main(String[] args) {
		
		threedimetionalarray c = new threedimetionalarray();		
		
		int a[][][]= new int[2][3][3]; // declaration and creation
		
		
		a[0][0][0]=10;
		a[0][0][1]=20;
		a[0][0][2]=130;
		
		a[0][1][0]=30;
		a[0][1][1]=40;
		a[0][1][2]=130;
		
		a[0][2][0]=50;
		a[0][2][1]=60;
		a[0][2][2]=130;
		
		a[1][0][0]=70;
		a[1][0][1]=80;
		a[1][0][2]=130;
		
		a[1][1][0]=90;
		a[1][1][1]=100;
		a[1][1][2]=130;
		
		a[1][2][0]=110;
		a[1][2][1]=120;
		a[1][2][2]=130;
		
		for ( int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				for (int k=0; k<a[i][j].length; k++) {
					System.out.print(a[i][j][k]+ " ");
				}System.out.println();
			}
		}
		
		
	}
}
 