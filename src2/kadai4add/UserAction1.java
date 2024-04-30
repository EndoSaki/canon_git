package kadai4add;

public class UserAction1 {

	public static void main(String[] args) {
		User U1 = new User();
		User U2 = new User();
		
		U1.name ="田中太郎";
		U1.age = 20;
		
		U1.showInfo();
		
		System.out.println("---");
		
		U2.name ="鈴木一郎";
		U2.age = 25;
		
		U2.showInfo();
		
	}

}
