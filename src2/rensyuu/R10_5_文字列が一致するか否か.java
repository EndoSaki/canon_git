package rensyuu;

import java.util.Scanner;

public class R10_5_文字列が一致するか否か {

	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		System.out.print("パスワード:");
		String a = scan.next();
		
		if(a .equals("himitu")) {
			System.out.println("一致しました");
		}else {
			System.out.println("一致しませんでした");
		}

	}

}
