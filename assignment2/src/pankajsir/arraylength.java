package pankajsir;

public class arraylength {

	static int z[]= {10,20,30,40,1,2,5,7,100,1};
	
public static  int[] getIntArraymethod(){
	int [] number= {10,20,30,40};
	return number;
	}

public static  int[][] getIntArraymethod1(){
	int [][] number= {{10,30,},{70,40}};
	return number;
	}


  static String[] name1= {"akash", "alexzander","prakash" };

public static String[] getstringarryreturnmethod() {
	String[] name= {"akash", "alexzander","prakash" };
	return name;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 System.out.println(z.length);
		
		for(int i=0; i<z.length; i++) {
			System.out.print(z[i]+ " ");
		}
	
		System.out.println();

		int a[]= getIntArraymethod();
		
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}System.out.println();
		
            int d[][]= getIntArraymethod1();
		
		for (int i=0; i<d.length; i++) {
			for(int j=0; j<d[i].length; j++)
			System.out.print(d[i][j]+" ");
		}System.out.println();
		
		String b[]= getstringarryreturnmethod(); // by for loo[
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]+" ");
		} System.out.println();
		
		System.out.println("array length is : " +z.length);
		
	for(String string : name1) {
		System.out.print(string+ " ");
	}
	}

}
