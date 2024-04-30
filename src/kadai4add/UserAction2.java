package kadai4add;

import java.util.Scanner;

public class UserAction2 {

	public static void main(String[] args) {
		System.out.println("会員を登録します");
		Scanner scan = new Scanner(System.in);
		
		// Userオブジェクトを生成し変数userに代入する
		User U1 = new User();
		//User U2 = new User();
		System.out.print("名前:");
		U1.name =scan.next();
		System.out.print("年齢:");
		U1.age =scan.nextInt();
		
		// キーボードから名前と年齢を取得しuserにセットする
		
		System.out.println("---");
		System.out.println("会員を登録しました");
		U1.showInfo();
		
		// userの情報を出力する
		scan.close();
		
	}

}
