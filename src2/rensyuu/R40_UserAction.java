package rensyuu;

public class R40_UserAction {

	public static void main(String[] args) {
		R40_User u1 = new R40_User();
		R40_User u2 = new R40_User();
		// 田中太郎（20）の情報を登録して出力
		u1.name= "田中";
		u1.age = 20;
		u1.showInfo();
		System.out.println("---");
		// 鈴木一郎（25）の情報を登録して出力
		u2.name = "鈴木";
		u2.age = 23;
		u2.showInfo();

	}

}
