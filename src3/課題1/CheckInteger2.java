package 課題1;

import java.util.Scanner;

public class CheckInteger2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("xの値を入力してください：");
		int num1 = scan.nextInt();
		System.out.print("yの値を入力してください：");
		int num2 = scan.nextInt();

		if (num1 > num2) {
			System.out.print("xはyより大きいです");
		} else if (num1 < num2) {
			System.out.print("xはyより小さいです");
		} else {
			System.out.print("xとyは等しいです");
		}

	}

}
