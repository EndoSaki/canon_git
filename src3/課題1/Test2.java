package 課題1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("国語の点数を入力してください：");
		double num1 = scan.nextInt();
		System.out.print("数学の点数を入力してください：");
		double num2 = scan.nextInt();
		System.out.print("英語の点数を入力してください：");
		double num3 = scan.nextInt();

		if (80 <= num1 && 75 <= num2 && 70 <= num3) {
			System.out.print("合格です");
		} else {
			System.out.print("不合格です");
		}
	}
}
