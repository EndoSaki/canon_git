package kadai7add;

public class Item {
	private String name;
	private int price;
	public Item() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Item(String name,int price) {
		this.name = name;
		this.price = price;
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
	public String getInfor() {
		return (name+"/"+price +"円");
	
		
	}
}
