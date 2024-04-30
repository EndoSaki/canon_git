package 課題1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("国語の点数を入力してください：");
		double num1 = scan.nextInt();
		System.out.print("数学の点数を入力してください：");
		double num2 = scan.nextInt();
		System.out.print("英語の点数を入力してください：");
		double num3 = scan.nextInt();

		double a = (num1 + num2 + num3) / 3;
		System.out.print("平均は" + a + "点です");
		String num4 = scan.next();

	}

}
