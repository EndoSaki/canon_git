package kadai2addに;

import java.util.Scanner;

public class CheckString4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("繰り返す回数を入力してください：");
		int kaisu = scan.nextInt();

		String[] ary = new String[kaisu];

		for (int i = 0; i < kaisu; i++) {
			System.out.print((i + 1) + "つ目の文字列を入力してください：");
			ary[i] = scan.next();
			
		}
		String b = "";

		for (String s: ary) {
			if (b.length() < s.length()) {
				 b= s;
			}

		}

		System.out.print("最も長い文字列は「" + b + "」です");
	}

}
