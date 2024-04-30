package kadai5add;

public class Customer {
		 private String name;
		 private int id;

	

	public Customer(String name) {
		this.name=name;
		
	}
	
	public Customer(int id,String name) {
		this.id=id;
		this.name = name;
		
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	void showData() {
		System.out.println(id+":"+ name);
		}
	

 
}
