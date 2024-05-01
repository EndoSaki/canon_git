package kadai7;

import java.util.Scanner;

public class PriceErrorCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int price = 0; // 価格初期値:0
		
		// 整数チェック（エラーの場合は終了）
		try {
			System.out.print("価格：");
			price = scan.nextInt();
		}catch(Exception e){
			System.out.println("整数で入力してください");
			System.exit(price);
		}
		
		
		// 範囲チェック（エラーの場合は終了)
		if(price <0) {
			System.out.println("マイナスの値です");
			return;
		}
		System.out.println(price + "円を登録しました");
		scan.close();
		

	
}
	
}
