package kadai7;

import java.util.ArrayList;
import java.util.List;

public class ItemAction {

	public static void main(String[] args) {
		// Itemクラスのリストを作成
		List<Item> list = new ArrayList<>();
		
		// 商品をリストに追加（３つ）
		Item i1 =new Item("ロボット掃除機",50000);
		Item i2 =new Item("ドラム式洗濯機",20000);
		Item i3 =new Item("液晶テレビ",10000);
		list.add(i1);
		list.add(i2);
		list.add(i3);
		
		
		//拡張for文を利用して1件ずつ商品情報を出力する
		for(Item a : list) {
			a.showInfo();
			System.out.println("---");
		}
	}

}
