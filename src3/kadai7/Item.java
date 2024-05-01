package kadai7;

public class Item {
	private String name;
	private int price;
	
	public Item() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public Item(String name,int price) {
		super();
		this.name = name;
		this.price = price;
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void showInfo() {
		System.out.println("商品:"+ name);
		System.out.println("価格:"+ price+"円");
	}
}
