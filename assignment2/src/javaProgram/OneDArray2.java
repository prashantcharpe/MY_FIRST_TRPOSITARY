package javaProgram;

public class OneDArray2 {
	public static void main(String[] args) {
		int[] art = new int[5];

		art[0] = 10;
		art[1] = 20;
		art[2] = 30;
		art[3] = 40;
		art[4] = 50;

		for (int i = 0; i < art.length; i++) {
			System.out.println(i + " " + art[i]);
		}
		System.out.println();

		int size = art.length;
		System.out.println(size);
	}

}
