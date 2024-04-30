package Loop1;

public class IntegerArray2 {

	public static void main(String[] args) {
		int[] canon = new int[] {1,7,2,7,3 };
			
		int sum = 0;
		for (int i = 0; i < canon.length; i++) {
			sum += canon[i];

		}
		
		System.out.println( "合計:" + sum );

	}
}
