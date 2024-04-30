package kadai6add;

public class Warrior extends Human {
	private String type;

	public Warrior() {
		super();
		
	}

	public Warrior(String name,String type) {
		super(name);
		this.type = type;
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void info() {
		System.out.println("種別:"+ type + "名前:"+getName() );
		
	}
	public void attack(String type) {
		System.out.println("「"+type +"」は攻撃した");
	}
}
