package rensyuu;

public class R20_6_拡張for_配列の数値の合計 {

	public static void main(String[] args) {
		int[] suuzi= new int[] {1,7,2,7,3};
		
		int sum =0;
		for(int a:suuzi) {
			sum += a;
		}
		System.out.println("合計:"+sum);
	}

}
