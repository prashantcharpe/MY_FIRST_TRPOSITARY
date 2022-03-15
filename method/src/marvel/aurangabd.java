package marvel;

public interface aurangabd {
		 int b=5;
		public int a=45;
		 //public final static int a=45;
		
		 void m1();
		 
		 public abstract void m2();
		 
		 public abstract void m3();
		 
 
              default void m4() {
            	  
              }
           }

	 abstract class  hariyana implements aurangabd{

		@Override
		public void m1() {
			// TODO Auto-generated method stub
			System.out.println(" i am from m1 hariyana");
		}
		@Override
		public void m2() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void m3() {
			// TODO Auto-generated method stub
			
		}
	}
	 
	abstract class punjab extends hariyana{

		@Override
		public void m2() {
			// TODO Auto-generated method stub
			System.out.println(" i am from m2 punjab");

		}
		

		
		 
	 }
	 class maldives extends punjab{

		

		@Override
		public void m3() {
			// TODO Auto-generated method stub
			System.out.println(" i am from m3 maldives");

		}

		@Override
		public void m2() {
			// TODO Auto-generated method stub
			System.out.println(" i am from m2 maldives");

		}
		 public static void main(String[] args) {
			 maldives name = new maldives();
			 name.m1();
			 name.m2();
			 name.m3();
			 System.out.println(a+b);
		 }

		
		
	}


