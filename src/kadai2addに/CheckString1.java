package kadai2addに;

import java.util.Scanner;

public class CheckString1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("文字列を入力してください：");
		String moji = scan.next();
		
		int num = moji.length();
		
		System.out.print("文字列の長さは"+num+"です");

	}

}
