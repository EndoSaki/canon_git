package kadai4add;

public class Item {
	// フィールド（名前と価格を定義する）
	String name;
	int price;
	
	void introduce() {
		System.out.println("名前:"+ name);
		System.out.println("価格(税抜き):"+ price+"円");
		System.out.println("価格(税込み):"+ price*11/10+"円");
		
	}
	 
	 
	 
	// 情報出力用showInfo()メソッド
	void showInfo() {
		System.out.println("名前:"+ name);
		System.out.println("価格(税抜き):"+ price+"円");
		System.out.println("価格(税込み):"+ price*11/10+"円");
		
	}
}
