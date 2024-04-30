package rensyuu;

public class R20_7_拡張for_配列の中に同じ数が何個か {

	public static void main(String[] args) {
		int[] suuzi= new int[] {1,7,2,7,3};
		
		int count =0;
		for(int a:suuzi) {
			if(a == 7) {
			count += 1;
			}
		}
		System.out.println(count + "個ありました");
	}

}
