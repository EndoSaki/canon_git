package kadai7add;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CartSystem {
	// 商品情報保存リスト（フィールド）
	private static Item[] partyList;
	
	private static List<Item> cart = new ArrayList<Item>();
	// スキャナークラス（フィールド）
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int sentaku;
		
		do {
			System.out.println("1.商品追加");
			System.out.println("2.書籍追加");
			System.out.println("9.終了");
			System.out.print("メニューを追加してください:");
			sentaku = scan.nextInt();
			if(sentaku == 1) {
				shina(partyList);
			}
			if(sentaku == 2) {
				book(partyList);
			}
			
		}while(sentaku !=9);

	}

	public static void shina(Item[] partyList) {
		System.out.println("商品をカートに追加します");
		System.out.println("商品名を入力してください:");
		String name = scan.next();
		System.out.println("価格を入力してください");
		int price = scan.nextInt();
		cart.add(new Item(name,price));
		
		
	}
	
	public static void book(Item[] partyList) {
		System.out.println("書籍をカートに追加します");
		System.out.println("書籍を入力してください");
		String name = scan.next();
		System.out.println("著者を入力してください:");
		String author = scan.next();
		System.out.println("価格を入力してください");
		int price = scan.nextInt();
		cart.add(new Book(name,price,author));
		
	}
	public static void show() {
		
	}
}
