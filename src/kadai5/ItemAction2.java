package kadai5;

public class ItemAction2 {

	public static void main(String[] args) {
		// 3つの要素をもつ商品クラスの配列を生成
		Item[] items = new Item[3] ;
		items[0] =new Item("ロボット掃除機",50000);
		items[1] =new Item("空気清浄機",2000);
		items[2] =new Item("扇風機",4000);
		// 拡張for文とshowInfoメソッドを利用して
		// 1件ずつ商品情報を出力する
		for(Item it: items) {
			it.showInf();
			System.out.println("---");
		}
	}

}
