package 課題1;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("国語の点数を入力してください：");
		int num1 = scan.nextInt();
		System.out.print("数学の点数を入力してください：");
		int num2 = scan.nextInt();
		System.out.print("英語の点数を入力してください：");
		int num3 = scan.nextInt();

		String a = "国語";
		int b = num1;
		if (num2 > b) {
			if (num2 > num3) {
				a = "数学";
				b = num2;
			}
		}
		if (num3 > b) {
			if (num3 > num2) {
				a = "英語";
				b = num3;
			}
		}

		System.out.print("最高点は" + a + "で" + b + "点です");
	}
}
