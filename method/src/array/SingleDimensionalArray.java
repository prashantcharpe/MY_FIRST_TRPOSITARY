package array;

public class SingleDimensionalArray {

	
	 int a[];                 // noramal variable declaration
	public static int b[];    // array declaration--- single dimensional
	public static int c[]= {1,2,3,4,5,6,7,8,9,10}; //declaration+initilization
	public static int[] rollno;
	int marks[];
	static int percentage[];
	
	public static void main(String[] args) {
		
		   b=new int[5]; // initilization of array like arryname = new datatype [size]
           rollno=new int[100];
        
        for(int i=1; i<=rollno.length; i++) {
        	System.out.println(" rollno = " + i);
        	System.out.println(" s p college \n");
        	
        	SingleDimensionalArray obj = new SingleDimensionalArray();
        	obj.marks = new int [5];  //if u try to access arrary out of the index
        	    // at runtime you will get the ArrayIndexOutOfBoundsException
        	                     // so u cant acess array part from declare size
            //obj.marks = new int[10]; // u cant change the size of array but it is good to create new array 
           /* obj.marks[0]=10;
            obj.marks[1]=20;
            obj.marks[2]=30;
            obj.marks[3]=40;
            obj.marks[4]=50;*/
         
            //for(int j=0; j<5; j++) {  
            	//arrya defualt value is 0
            	//at the time of initilization if you don't assign value then java will 
            	//assign defualt value as marks is holding so defulat value will be 0
            	//System.out.println(obj.marks[j]);
           // }
            
            // System.out.println(percentage[0]); 
            // u will get the NullPointerException  if u trying to access array without initilization
       
        //if i want to konw the size/length of array i can use lengt deta member 
            // of java in built class arrays like below
            
            System.out.println("\n" + rollno.length);
         
            //interating array through for each loop
            //please iterate through all the array element one  by one
            
            for (int k:obj.marks) {
            	System.out.println(k);
            }
        
        }
	}

}
