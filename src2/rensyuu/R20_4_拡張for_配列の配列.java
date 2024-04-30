package rensyuu;

public class R20_4_拡張for_配列の配列 {

	public static void main(String[] args) {
		
		String[] suuzi = new String[] {"ダンス","映画","バイク"};
		
		System.out.println("私の趣味は");
		
		//aにsuuziの配列を順番に入れる
		for(String a :suuzi) {
			System.out.println("・"+a);
		}
		
		System.out.println("です");
	}

}
