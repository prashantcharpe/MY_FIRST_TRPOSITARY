package javaProgram;

interface inter1
{
	public int addtion(int a, int b);
}

interface inter2
{
	public int division(int a, int b);
}

abstract class parent1
{
	abstract public int multi(int a, int b);
	public int sub(int a, int b) {
		return a-b;
	}
}
public class interface2 extends parent1 implements  inter1,inter2 {

	@Override
	public int division(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addtion(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int multi(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		interface2 name = new interface2();
		name.addtion(10, 20);
		name.sub(202, 10);
		name.multi(10, 5);
	    name.division(10, 2);
	}
}
