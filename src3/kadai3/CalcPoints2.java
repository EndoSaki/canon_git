package kadai3;

import java.util.Scanner;

public class CalcPoints2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("購入金額：");
		int price = scan.nextInt();
		System.out.println("1:プレミア会員, 2:無料会員");
		System.out.print("会員ランク：");
		int rank = scan.nextInt();
		// 会員ランクによる判定
		scan.close();
		
		a(price,rank);
	}
	static void a(int x,int y ) {
		if(y == 1) {
			System.out.println("プレミア会員には"+(x*2/10)+"ポイント付与されます");
			
		}else {
			System.out.println("無料会員には"+(x*2/10)+"ポイント付与されます");
		
		}
	}
	
}
