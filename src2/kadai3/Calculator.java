package kadai3;

public class Calculator {

	public static void main(String[] args) {
		int a = add(3, 7);
		System.out.println(a);
		int b = sub(3, 7);
		System.out.println(b);
		double c = avg(3, 7);
		System.out.println(c);

	}

	static int add(int x,int y) {
		return x + y;
	}
	static int sub(int x,int y) {
		return x - y;
	}
	static double avg(double x,double y) {
		return (x + y )/2;
	}
}
