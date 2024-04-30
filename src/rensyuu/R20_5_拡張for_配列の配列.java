package rensyuu;

import java.util.Scanner;

public class R20_5_拡張for_配列の配列 {

	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		System.out.println("名前:");
		String a = scan.next();
		System.out.println("趣味1:");
		String  b = scan.next();
		System.out.println("趣味2:");
		String  c = scan.next();
		System.out.println("趣味3:");
		String  d = scan.next();
		
		System.out.println("---");
		String[] suuzi = new String[] {b,c,d};
		
		System.out.println("こんにちは"+a+"です");
		System.out.println("私の趣味は");
		
		//aにsuuziの配列を順番に入れる
		for(String e :suuzi) {
			System.out.println("・"+e);
		}
		
		System.out.println("です");
	}

}
