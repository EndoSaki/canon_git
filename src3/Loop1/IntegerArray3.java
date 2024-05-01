package Loop1;

public class IntegerArray3 {

	public static void main(String[] args) {
		int[] canon = new int[] {1,7,2,7,3 };
			
		int count = 0;
		for (int num:canon) {
			if(num == 7) {
				count += 1;

		}
			}
			
		
		System.out.println( count+ "個あります");

	}
}
