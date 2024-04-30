package rensyuu;

public class R30_メソッド3 {

	public static void main(String[] args) {
		int price = 1000;
		// プレミア会員のポイント計算
		int p1 = getPoints(price, true);
		System.out.println("プレミア会員には" + p1 + "ポイント付与されます");
		// 無料会員のポイント計算
		int p2 = getPoints(price, false);
		System.out.println("無料会員には" + p2 + "ポイント付与されます");

		
	}	
	static int getPoints(int x,boolean y) {
		if(y) {
			return x*2/10;
		}else {
			return x*1/10;
		}
	}

}
