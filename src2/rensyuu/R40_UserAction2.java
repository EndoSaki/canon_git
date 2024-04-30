package rensyuu;

import java.util.Scanner;

public class R40_UserAction2 {

	public static void main(String[] args) {
		R40_User U = new R40_User();
		Scanner scan = new Scanner(System.in);
		// Userオブジェクトを生成し変数userに代入する
		System.out.println("名前:");
		U.name =scan.next();
		// キーボードから名前と年齢を取得しuserにセットする
		System.out.println("年齢:");
		U.age = scan.nextInt();
		System.out.println("---");
		System.out.println("会員を登録しました");
		// userの情報を出力する
		scan.close();
		U.showInfo();

	}

}
