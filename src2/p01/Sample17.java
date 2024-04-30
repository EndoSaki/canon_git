package p01;

public class Sample17 {
	public static void main(String[] args) {

		//配列の宣言①と領域の確保②とデータ設定③
		//データ型[]　配列名　= ｛データ型１,データ型2,・・・｝;
		//データ型[]　配列名　= new データ型[]｛データ型１,データ型2,・・・｝;
		//String[] canon = { "田中", "遠藤", "椿" };
		String[] canon = new String[] { "田中", "遠藤", "椿" };

		//マンションの部屋に住人を住まわせる③
		//		canon[0] = "田中";
		//		canon[1] = "遠藤";
		//		canon[2] = "椿";

		System.out.println(canon[0]);
		System.out.println(canon[1]);
		System.out.println(canon[2]);
		System.out.println(canon.length);//要素数
	}
}
