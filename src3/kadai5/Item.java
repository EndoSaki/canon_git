package kadai5;

public class Item {
	// フィールド
	
	private String name;
	private int price;
	// コンストラクタ
	// ゲッターセッター
	public Item() {
		this.name = name;
		this.price= price;
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public Item(String name,int price) {
		this.name = name;
		this.price= price;
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	void showInf() {
		System.out.println("商品名:"+ name);
		System.out.println("価格:"+ price+"円");
	}
	

}
