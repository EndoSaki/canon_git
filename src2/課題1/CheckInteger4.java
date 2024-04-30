package 課題1;

import java.util.Scanner;

public class CheckInteger4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("数字を入力して下さい：");
		int num = scan.nextInt();

		if (num % 2 == 0 && num > 0) {
			System.out.print(num + "は正の偶数です");
		} else if (num % 2 == 1 && num > 0) {
			System.out.print(num + " は正の奇数です");
		} else if (num % 2 == 0 && num < 0) {
			System.out.print(num + " は負の偶数です");
		} else {
			System.out.print(num + "は負の奇数です");
		}
		
		//String judge1 =num >= 0 ? "正":"負";
		//String judge2 =num %= 0 ? "偶数" : "奇数";
	}

}


