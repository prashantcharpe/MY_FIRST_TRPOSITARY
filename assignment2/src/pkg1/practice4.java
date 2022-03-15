package pkg1;

public class practice4 {

	private   int a;
    int b;
     protected int c;
     public    int d;

public void m4() {

System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
} 
public static void main(String[] args) {

practice4 obj4=new practice4();
obj4.a=10;
obj4.b=20;
obj4.c=30;
obj4.d=40;
obj4.m4();	

practice obj=new practice(); // this class is import from pkg1
//obj.a=80; cant access in same pakg or out of the pkg.

obj.b=70;   //default variable can visible in same pkg in other class
obj.c=60;    //protected variable can visible in same pkg in other class
obj.d=50;   //public variable can visible in same pkg in other class
obj.m1();// public method also access through import.

//only public variable can access in other pkg1.
//default variable cant access in other pkg1.
//private variable cant access in other pkg1.  //protected variable cant access in other pkg1. 

}
}

