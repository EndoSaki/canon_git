package 課題1;

import java.util.Scanner;

public class CheckString1 {

	public static void main(String[] args) {
Scanner scan = new Scanner (System.in);
		
		System.out.print("パスワード：");
		String num = scan.next();
		String a = "himitu";

		if(a.equals(num)){
			System.out.print("一致しました");
		}else {
			System.out.print("一致しません");
		}
	}

}
