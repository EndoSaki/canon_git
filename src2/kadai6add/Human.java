package kadai6add;

public class Human {
	private String name;

	public Human() {
		super();
		
	}
	public Human(String name) {
		super();
		this.name =name;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void info() {
		System.out.println("名前:"+ name);
	}
	
	public void attack() {
		System.out.println("攻撃した");
	}
}
