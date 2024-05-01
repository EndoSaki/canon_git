package kadai6;

public class Book extends Item {
	//フィールド
	private String author;
	
	//コンストラクタ
	public Book() {
		super();
	}

	public Book(String name, int price,String author) {
		super(name, price);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	void showInfo() {
		super.showInfo();
		System.out.println("著者::"+author);
	}
	
	
	
	
}
