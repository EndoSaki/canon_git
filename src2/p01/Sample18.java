package p01;

public class Sample18 {
	public static void main(String[] args) {

		//配列の宣言①と領域の確保②とデータ設定③
		String[] canon = { "田中", "遠藤", "椿" };
		String[] sony;
		
		sony = canon;
		
		sony[1] = "工藤";

		System.out.println(canon[0]);
		System.out.println(canon[1]);
		System.out.println(canon[2]);
		System.out.println(canon.length);//要素数
	}
}
