package kadai7add;

public class Book extends Item {
	private String author;

	public Book() {
		super();
		
	}

	public Book(String name, int price, String author) {
		super(name, price);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getInfo() {
		return (getName()+"(著:"+author+")/"+ getPrice() +"円");
		
	}
	
}
