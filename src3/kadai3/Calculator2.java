package kadai3;

public class Calculator2 {

	public static void main(String[] args) {
		int a = add(3, 7);
		System.out.println(a);
		int b = sub(3, 7);
		System.out.println(b);


	}

	static int add(int x,int y) {
		return x + y;
	}
	static int sub(int x,int y) {
		return x - y;
	}
}
