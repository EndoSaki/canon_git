package kadai2addに;

import java.util.Scanner;

public class CheckString2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("文字列を入力してください：");
		String moji1 = scan.next();
		System.out.print("文字列を入力してください：");
		String moji2 = scan.next();
		
		if(moji1.equals (moji2)) {
			System.out.print("2つの文字列は同じです");
		}else {
			System.out.print("2つの文字列は異なります");
		}
		
		

	}

}
