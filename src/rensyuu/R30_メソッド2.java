package rensyuu;

public class R30_メソッド2 {

	public static void main(String[] args) {
		introduce("田中太郎", 25);
		System.out.println("---");
		introduce("鈴木一郎", 30);

		
	}	
	static void introduce(String x,int y) {
		System.out.println(x+y+"歳です");
		System.out.println("10年後は"+(y+10)+"歳です");
	}

}
