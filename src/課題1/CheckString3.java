package 課題1;

import java.util.Scanner;

public class CheckString3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("名前：");
		String num = scan.next();
		int a = num.length();

		if (0 < a && a <= 20) {
			System.out.print("ようこそ" + num + "さん");
		} else {
			System.out.print("エラー：20文字以内で入力してください");
		}

	}
}
