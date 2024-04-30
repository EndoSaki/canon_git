package kadai5;

public class ItemAction1 {

	public static void main(String[] args) {
		// 商品オブジェクトを生成
		Item i =new Item();
		
		// セッターを利用して情報（絵本/1000円）をセットする
		i.setName("絵本");
		i.setPrice(1000);
		// ゲッターを利用して商品の情報を出力する
		System.out.println("商品名:"+i.getName());
		System.out.println("金額:"+i.getPrice());
		
		System.out.println("---");
		
		// ■Step4の処理
		// コンストラクタを利用し初期化（シャンプー/222円）と
		// 同時に商品オブジェクトを生成する
		
		Item i1 =new Item("シャンプー",222);
		// 商品情報出力用のメソッドを利用して出力する
			
		i1.showInf();
		
	}

}
