package kadai7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringCart2 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		// 文字列を保持できるリストの作成
		List<String> list = new ArrayList<String>();		
		// キーボードからリストに追加するを3回繰り返す
		for(int i = 0;i< 3;i++) {
			System.out.print("商品を追加してください:");
			String shina =scan.next();
			list.add(shina);
		}
		// 拡張for文を利用して全商品を出力する
		for(String a : list) {
			System.out.println(a);
		}
		scan.close();
		
		

	}

}
